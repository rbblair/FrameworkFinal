package FrameworkBasedPrograming.service.serviceImpl;

import FrameworkBasedPrograming.dao.Dept_empRepository;
import FrameworkBasedPrograming.model.Dept_emp;
import FrameworkBasedPrograming.model.Dept_manager;
import FrameworkBasedPrograming.model.OldNewDeptEmp;
import FrameworkBasedPrograming.model.OldNewDeptManager;
import FrameworkBasedPrograming.service.Dept_empSearchService;
import FrameworkBasedPrograming.service.Dept_managerSearchService;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.Collection;

@Service
public class Dept_empSearchServiceImplementation implements Dept_empSearchService {
    private Dept_empRepository deptEmpRepository;

    public Dept_empSearchServiceImplementation(Dept_empRepository deptEmpRepository) {
        this.deptEmpRepository = deptEmpRepository;
    }

    @Override
    public Collection<Dept_emp> listDepartmentEmployees() {
        return (Collection<Dept_emp>) deptEmpRepository.findAll();
    }

    @Override
    public Collection<Dept_emp> listDepartmentEmployeesByDept(String dep) {
        return deptEmpRepository.findAllByDeptNo(dep);
    }

    @Override
    public Dept_emp getEmpByDepAndFromDate(String depNo, Date fromDate, Date toDate) {
        return deptEmpRepository.findByFromDateAndToDateAndDeptNo(fromDate, toDate, depNo);
    }

    @Override
    public void addEmployeeToDep(Dept_emp dept_emp) {
        deptEmpRepository.save(dept_emp);
    }

    @Override
    public void updateDeptEmp(OldNewDeptEmp oldNewDeptEmp) {
        Dept_emp oldOne = oldNewDeptEmp.getOldDeptEmp();
        Dept_emp newOne = oldNewDeptEmp.getNewDeptEmp();
        Dept_emp tempDeptEmp = deptEmpRepository.findByFromDateAndToDateAndDeptNo(oldOne.getFromDate(), oldOne.getToDate(), oldOne.getDept_no());
        tempDeptEmp.setEmpNo(newOne.getEmpNo());
        tempDeptEmp.setDept_no(newOne.getDept_no());
        tempDeptEmp.setFromDate(newOne.getFromDate());
        tempDeptEmp.setToDate(newOne.getToDate());
        deptEmpRepository.delete(oldOne);
        deptEmpRepository.save(tempDeptEmp);
    }

    @Override
    public void deleteDeptEmp(Dept_emp dept_emp) {
        deptEmpRepository.delete(dept_emp);
    }
}
