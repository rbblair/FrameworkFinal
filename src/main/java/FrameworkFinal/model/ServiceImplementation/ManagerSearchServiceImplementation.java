package FrameworkBasedPrograming.service.serviceImpl;

import FrameworkBasedPrograming.dao.Dept_managerRepository;
import FrameworkBasedPrograming.model.Dept_manager;
import FrameworkBasedPrograming.model.OldNewDeptManager;
import FrameworkBasedPrograming.service.Dept_managerSearchService;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.Collection;

@Service
public class Dept_managerSearchServiceImplementation implements Dept_managerSearchService {
    private Dept_managerRepository dept_managerRepository;

    public Dept_managerSearchServiceImplementation(Dept_managerRepository dept_managerRepository) {
        this.dept_managerRepository = dept_managerRepository;
    }

    @Override
    public Collection<Dept_manager> listDepartmentManagers() {
        return (Collection<Dept_manager>) dept_managerRepository.findAll();
    }

    @Override
    public Collection<Dept_manager> listDepartmentManagersByDeptNo(String Dept_no) {
        return dept_managerRepository.findAllByDeptNo(Dept_no);
    }

    @Override
    public Dept_manager getDepartmentManagerByFromDateAndToDateAndDept_no(Date from_date, Date to_date, String dept_no) {
        return dept_managerRepository.findByFromDateAndToDateAndDeptNo(from_date, to_date, dept_no);
    }

    @Override
    public void addDeptManager(Dept_manager dept_manager) {
        dept_managerRepository.save(dept_manager);
    }

    @Override
    public void updateDeptManager(OldNewDeptManager oldNewDeptManager) {
        Dept_manager oldDeptMan = oldNewDeptManager.getOldDeptManager();
        Dept_manager newDeptMan = oldNewDeptManager.getNewDeptManager();
        Dept_manager temp_deptMan = dept_managerRepository.findByFromDateAndToDateAndDeptNo(oldDeptMan.getFromDate(), oldDeptMan.getToDate(), oldDeptMan.getDept_no());
        temp_deptMan.setDept_no(newDeptMan.getDept_no());
        temp_deptMan.setEmpNo(newDeptMan.getEmpNo());
        temp_deptMan.setFromDate(newDeptMan.getFromDate());
        temp_deptMan.setToDate(newDeptMan.getToDate());
        dept_managerRepository.delete(oldDeptMan);
        dept_managerRepository.save(temp_deptMan);
    }

    @Override
    public void deleteDepartmentManager(Dept_manager dept_manager) {
        dept_managerRepository.delete(dept_manager);
    }
}
