package FrameworkFinal.controller;

import FrameworkFinal.FrameworkBasedPrograming.model.Manager;
import FrameworkFinal.model.OldNewDeptManager;
import FrameworkFinal.service.ManagerSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.Collection;

@RestController
@RequestMapping(value = {"/deptmanager"})
public class DeptManagerControllerClass {
    @Autowired
    private ManagerSearchService deptManagerSearchService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public Collection<Manager> getDeptManagers() {
        return deptManagerSearchService.listDepartmentManagers();
    }

    @RequestMapping(value = "/dept", method = RequestMethod.GET)
    public Collection<Manager> getDeptManagersByDeptNo(
            @RequestParam(value = "departmentNo") String dep_no
    ) {
        return deptManagerSearchService.listDepartmentManagersByDeptNo(dep_no);
    }

    @RequestMapping(value = "/date_deptNo", method = RequestMethod.GET)
    public Manager getDeptManagerBetweenDatesAndDeptNo(
            @RequestParam(value = "from_date") Date from_date,
            @RequestParam(value = "to_date") Date to_date,
            @RequestParam(value = "departmentNo") String dept_no
    ) {
        return deptManagerSearchService.getDepartmentManagerByFromDateAndToDateAndDept_no(from_date, to_date, dept_no);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public void updateDeptManager(
            @RequestBody() OldNewDeptManager oldNewDeptManager
    ) {
        deptManagerSearchService.updateDeptManager(oldNewDeptManager);
    }

    @RequestMapping(value = "/add", method = RequestMethod.PUT)
    public void addDeptManager(
            @RequestBody() Manager Manager
    ) {
        deptManagerSearchService.addDeptManager(Manager);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public void deleteDeptManager(
            @RequestBody() Manager Manager
    ) {
        deptManagerSearchService.deleteDepartmentManager(Manager);
    }


}
