package FrameworkFinal.service.ServiceImplementation;

import FrameworkFinal.FrameworkBasedPrograming.dao.EmpRepository;
import FrameworkFinal.FrameworkBasedPrograming.model.Emp;
import FrameworkFinal.model.OldNewDeptEmp;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.Collection;

@Service
public class DeptEmpSearchServiceImplementation implements FrameworkFinal.service.DeptEmpSearchService {
    private EmpRepository deptEmpRepository;

    public DeptEmpSearchServiceImplementation(EmpRepository deptEmpRepository) {
        this.deptEmpRepository = deptEmpRepository;
    }

    @Override
    public Collection<Emp> listDepartmentEmployees() {
        return (Collection<Emp>) deptEmpRepository.findAll();
    }

    @Override
    public Collection<Emp> listDepartmentEmployeesByDept(String dep) {
        return deptEmpRepository.findAllByDeptNo(dep);
    }

    @Override
    public Emp getEmpByDepAndFromDate(String depNo, Date fromDate, Date toDate) {
        return deptEmpRepository.findByFromDateAndToDateAndDeptNo(fromDate, toDate, depNo);
    }

    @Override
    public void addEmployeeToDep(Emp Emp) {
        deptEmpRepository.save(Emp);
    }

    @Override
    public void updateDeptEmp(OldNewDeptEmp oldNewDeptEmp) {
        Emp oldOne = oldNewDeptEmp.getOldDeptEmp();
        Emp newOne = oldNewDeptEmp.getNewDeptEmp();
        Emp tempDeptEmp = deptEmpRepository.findByFromDateAndToDateAndDeptNo(oldOne.getFromDate(), oldOne.getToDate(), oldOne.getDept_no());
        tempDeptEmp.setEmpNo(newOne.getEmpNo());
        tempDeptEmp.setDept_no(newOne.getDept_no());
        tempDeptEmp.setFromDate(newOne.getFromDate());
        tempDeptEmp.setToDate(newOne.getToDate());
        deptEmpRepository.delete(oldOne);
        deptEmpRepository.save(tempDeptEmp);
    }

    @Override
    public void deleteDeptEmp(Emp Emp) {
        deptEmpRepository.delete(Emp);
    }
}
