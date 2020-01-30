package FrameworkFinal.service;

import FrameworkFinal.FrameworkBasedPrograming.model.Emp;
import FrameworkFinal.model.OldNewDeptEmp;

import java.sql.Date;
import java.util.Collection;

public interface DeptEmpSearchService {
    public Collection<Emp> listDepartmentEmployees();

    public Collection<Emp> listDepartmentEmployeesByDept(String dep);

    public Emp getEmpByDepAndFromDate(String depNo, Date fromDate, Date toDate);

    void addEmployeeToDep(Emp dept_emp);

    void updateDeptEmp(OldNewDeptEmp oldNewDeptEmp);

    void deleteDeptEmp(Emp dept_emp);
}
