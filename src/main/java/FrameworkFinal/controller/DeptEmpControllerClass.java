package FrameworkFinal.controller;

import FrameworkFinal.FrameworkBasedPrograming.model.Emp;
import FrameworkFinal.model.OldNewDeptEmp;
import FrameworkFinal.service.DeptEmpSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.Collection;

@RestController
@RequestMapping(value = {"/deptemp"})
public class DeptEmpControllerClass {
    @Autowired
    private DeptEmpSearchService deptEmpSearchService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public Collection<Emp> getAllDeptEmp() {
        return deptEmpSearchService.listDepartmentEmployees();
    }

    @RequestMapping(value = "/deptno", method = RequestMethod.GET)
    public Collection<Emp> getAllDeptEmpByDeptName(
            @RequestParam("deptno") String deptno
    ) {
        return deptEmpSearchService.listDepartmentEmployeesByDept(deptno);
    }

    @RequestMapping(value = "/depemp", method = RequestMethod.GET)
    public Emp getDeptEmp(
            @RequestParam("deptno") String deptNo,
            @RequestParam("fromdate") Date fromDate,
            @RequestParam("todate") Date toDate
    ) {
        return deptEmpSearchService.getEmpByDepAndFromDate(deptNo, fromDate, toDate);
    }

    @RequestMapping(value = "/add", method = RequestMethod.PUT)
    public void addDeptEmp(
            @RequestBody() Emp deptEmp
    ) {
        deptEmpSearchService.addEmployeeToDep(deptEmp);
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public void updateDeptEmp(
            @RequestBody() OldNewDeptEmp oldNewDeptEmp
    ) {
        deptEmpSearchService.updateDeptEmp(oldNewDeptEmp);
    }

    @RequestMapping(value = "delete", method = RequestMethod.DELETE)
    public void deleteDeptEmp(
            @RequestBody() Emp deptEmp
    ) {
        deptEmpSearchService.deleteDeptEmp(deptEmp);
    }

}
