package FrameworkBasedPrograming.service;

import FrameworkBasedPrograming.model.Dept_emp;
import FrameworkBasedPrograming.model.OldNewDeptEmp;

import java.sql.Date;
import java.util.Collection;

public interface Dept_empSearchService {
    public Collection<Dept_emp> listDepartmentEmployees();
    public Collection<Dept_emp> listDepartmentEmployeesByDept(String dep);
    public Dept_emp getEmpByDepAndFromDate(String depNo, Date fromDate, Date toDate);

    void addEmployeeToDep(Dept_emp dept_emp);

    void updateDeptEmp(OldNewDeptEmp oldNewDeptEmp);

    void deleteDeptEmp(Dept_emp dept_emp);
}
