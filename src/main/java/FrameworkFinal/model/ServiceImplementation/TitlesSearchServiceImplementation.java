package FrameworkBasedPrograming.service.serviceImpl;

import FrameworkBasedPrograming.dao.TitlesRepository;
import FrameworkBasedPrograming.model.Titles;
import FrameworkBasedPrograming.service.TitlesSearchService;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.Collection;

@Service
public class TitlesSearchServiceImplementation implements TitlesSearchService {
    private TitlesRepository titlesRepository;

    public TitlesSearchServiceImplementation(TitlesRepository titlesRepository){
        this.titlesRepository = titlesRepository;
    }

    @Override
    public void addTitle(Titles title) {
        titlesRepository.save(title);
    }

    @Override
    public void updateTitle(Titles title) {
        Titles temp_title = titlesRepository.findByEmpNoAndFromDate(title.getEmp_no(), title.getFrom_date());
        temp_title.setEmp_no(title.getEmp_no());
        temp_title.setTitle(title.getTitle());
        temp_title.setFrom_date(title.getFrom_date());
        temp_title.setTo_date(title.getTo_date());
        titlesRepository.save(temp_title);
    }

    @Override
    public void deleteTitle(long emp_no, Date from_date) {
        titlesRepository.deleteByEmpNoAndFromDate(emp_no, from_date);
    }

    @Override
    public Collection<Titles> getTitlesByEmpNo(long emp_no) {
        return titlesRepository.findAllByEmpNo(emp_no);
    }

    @Override
    public Collection<Titles> getTitlesByTitleName(String titleName) {
        return titlesRepository.findAllByTitle(titleName);
    }
}
