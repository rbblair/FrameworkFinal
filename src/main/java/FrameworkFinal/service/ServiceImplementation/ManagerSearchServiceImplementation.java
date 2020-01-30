package FrameworkFinal.service.ServiceImplementation;

import FrameworkFinal.FrameworkBasedPrograming.model.Manager;
import FrameworkFinal.model.OldNewDeptManager;
import FrameworkFinal.service.ManagerSearchService;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.Collection;

@Service
public class ManagerSearchServiceImplementation implements ManagerSearchService {
    private FrameworkFinal.FrameworkBasedPrograming.dao.ManagerRepository ManagerRepository;

    public ManagerSearchServiceImplementation(FrameworkFinal.FrameworkBasedPrograming.dao.ManagerRepository ManagerRepository) {
        this.ManagerRepository = ManagerRepository;
    }

    @Override
    public Collection<Manager> listDepartmentManagers() {
        return (Collection<Manager>) ManagerRepository.findAll();
    }

    @Override
    public Collection<Manager> listDepartmentManagersByDeptNo(String Dept_no) {
        return ManagerRepository.findAllByDeptNo(Dept_no);
    }

    @Override
    public Manager getDepartmentManagerByFromDateAndToDateAndDept_no(Date from_date, Date to_date, String dept_no) {
        return ManagerRepository.findByFromDateAndToDateAndDeptNo(from_date, to_date, dept_no);
    }

    @Override
    public void addDeptManager(Manager Manager) {
        ManagerRepository.save(Manager);
    }

    @Override
    public void updateDeptManager(OldNewDeptManager oldNewDeptManager) {
        Manager oldDeptMan = oldNewDeptManager.getOldDeptManager();
        Manager newDeptMan = oldNewDeptManager.getNewDeptManager();
        Manager temp_deptMan = ManagerRepository.findByFromDateAndToDateAndDeptNo(oldDeptMan.getFromDate(), oldDeptMan.getToDate(), oldDeptMan.getDept_no());
        temp_deptMan.setDept_no(newDeptMan.getDept_no());
        temp_deptMan.setEmpNo(newDeptMan.getEmpNo());
        temp_deptMan.setFromDate(newDeptMan.getFromDate());
        temp_deptMan.setToDate(newDeptMan.getToDate());
        ManagerRepository.delete(oldDeptMan);
        ManagerRepository.save(temp_deptMan);
    }

    @Override
    public void deleteDepartmentManager(Manager Manager) {
        ManagerRepository.delete(Manager);
    }
}
