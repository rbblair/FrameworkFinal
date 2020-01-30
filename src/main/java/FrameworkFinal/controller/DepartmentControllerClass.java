package FrameworkFinal.controller;

import FrameworkFinal.FrameworkBasedPrograming.model.Departments;
import FrameworkFinal.FrameworkBasedPrograming.service.DeptSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping(value = {"/departments"})
public class DepartmentControllerClass {
    @Autowired
    private DeptSearchService departmentSearchService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public Collection<Departments> fetchAllEmployees() {
        return departmentSearchService.listDepartments();
    }

    @RequestMapping(value = "/departmentNo", method = RequestMethod.GET)
    public Departments getDepartmentByNo(
            @RequestParam(value = "departmentNo") String dep_no
    ) {
        return departmentSearchService.queryDepartmentById(dep_no);
    }

    @RequestMapping(value = "/departmentName", method = RequestMethod.GET)
    public Collection<Departments> getDepartmenstByName(
            @RequestParam(value = "departmentName") String dep_name
    ) {
        return departmentSearchService.queryDepartmentByName(dep_name);
    }

    @RequestMapping(value = "/add", method = RequestMethod.PUT)
    public void addDepartment(
            @RequestBody(required = true) Departments department
    ) {
        departmentSearchService.addDepartment(department);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public void updateDepartment(
            @RequestBody(required = true) Departments department
    ) {
        departmentSearchService.updateDepartment(department);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public void deleteDepartment(
            @RequestParam(value = "departmentNo") String dep_no
    ) {
        departmentSearchService.deleteDepartment(dep_no);
    }
}
