package FrameworkBasedPrograming.controller;

import FrameworkBasedPrograming.model.Dept_emp;
import FrameworkBasedPrograming.model.OldNewDeptEmp;
import FrameworkBasedPrograming.service.Dept_empSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.Collection;

@RestController
@RequestMapping(value = {"/deptemp"})
public class DeptEmpControllerClass {
    @Autowired
    private Dept_empSearchService deptEmpSearchService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public Collection<Dept_emp> getAllDeptEmp() { return deptEmpSearchService.listDepartmentEmployees(); }

    @RequestMapping(value = "/deptno", method = RequestMethod.GET)
    public Collection<Dept_emp> getAllDeptEmpByDeptName(
            @RequestParam("deptno") String deptno
    ) { return deptEmpSearchService.listDepartmentEmployeesByDept(deptno); }

    @RequestMapping(value = "/depemp", method = RequestMethod.GET)
    public Dept_emp getDeptEmp(
            @RequestParam("deptno") String deptNo,
            @RequestParam("fromdate") Date fromDate,
            @RequestParam("todate") Date toDate
    ) { return deptEmpSearchService.getEmpByDepAndFromDate(deptNo, fromDate, toDate); }

    @RequestMapping(value = "/add", method = RequestMethod.PUT)
    public void addDeptEmp(
            @RequestBody() Dept_emp deptEmp
    ) { deptEmpSearchService.addEmployeeToDep(deptEmp); }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public void updateDeptEmp(
            @RequestBody() OldNewDeptEmp oldNewDeptEmp
    ) { deptEmpSearchService.updateDeptEmp(oldNewDeptEmp); }

    @RequestMapping(value = "delete", method = RequestMethod.DELETE)
    public void deleteDeptEmp(
            @RequestBody() Dept_emp deptEmp
    ) { deptEmpSearchService.deleteDeptEmp(deptEmp); }

}
