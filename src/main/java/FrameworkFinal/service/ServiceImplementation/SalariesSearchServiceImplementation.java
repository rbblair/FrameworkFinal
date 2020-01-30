package FrameworkFinal.FrameworkBasedPrograming.service.serviceImpl;

import FrameworkFinal.FrameworkBasedPrograming.dao.SalariesRepository;
import FrameworkFinal.FrameworkBasedPrograming.model.Salaries;
import FrameworkFinal.FrameworkBasedPrograming.service.SalariesSearchService;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.Collection;

@Service
public class SalariesSearchServiceImplementation implements SalariesSearchService {
    private SalariesRepository salariesRepository;

    public SalariesSearchServiceImplementation(SalariesRepository salariesRepository) {
        this.salariesRepository = salariesRepository;
    }

    @Override
    public void addSalary(Salaries salary) {
        salariesRepository.save(salary);
    }

    @Override
    public void updateSalary(Salaries oldSalary, Salaries newSalary) {
        salariesRepository.deleteByEmpNoAndFromDate(oldSalary.getEmpNo(), oldSalary.getFromDate());
        salariesRepository.save(newSalary);
    }

    @Override
    public void deleteSalary(long emp_no, Date from_date) {
        salariesRepository.deleteByEmpNoAndFromDate(emp_no, from_date);
    }

    @Override
    public Salaries getSalaryByEmpNoAndFromDate(long emp_no, Date from_date) {
        return salariesRepository.findSalariesByEmpNoAndFromDate(emp_no, from_date);
    }

    @Override
    public Collection<Salaries> getAllSalariesByEmpNo(long emp_no) {
        return salariesRepository.findAllByEmpNo(emp_no);
    }

    @Override
    public Collection<Salaries> getAllSalariesBetweenDates(Date from_date, Date to_date) {
        return salariesRepository.findSalariesByFromDateGreaterThanEqualAndToDateLessThanEqual(from_date, to_date);
    }

    @Override
    public Collection<Salaries> getAllSalariesByEmpNoBetweenDates(long emp_no, Date from_date, Date to_date) {
        return salariesRepository.findSalariesByFromDateGreaterThanEqualAndToDateLessThanEqualAndEmpNo(from_date, to_date, emp_no);
    }
}
