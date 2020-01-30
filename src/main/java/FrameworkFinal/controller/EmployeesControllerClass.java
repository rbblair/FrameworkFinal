package FrameworkFinal.controller;

import FrameworkFinal.model.Employees;
import FrameworkFinal.service.EmployeeSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.Collection;

@RestController
@RequestMapping(value = {"/employees"})
class EmployeesControllerClass {

    @Autowired
    private EmployeeSearchService employeeSearchService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public Collection<Employees> fetchAllEmployees() {
        return employeeSearchService.listEmployees();
    }

    @RequestMapping(value = "/employeeFirstName", method = RequestMethod.GET)
    public Collection<Employees> getEmployeesByFirstName(
            @RequestParam(value = "employeeFirstName") String first_name
    ) {
        return employeeSearchService.listEmployeesByFirstName(first_name);
    }

    @RequestMapping(value = "/employeeLastName", method = RequestMethod.GET)
    public Collection<Employees> getEmployeesByLastName(
            @RequestParam(value = "employeeLastName") String last_name
    ) {
        return employeeSearchService.listEmployeesByLastName(last_name);
    }

    @RequestMapping(value = "/employeeFullName", method = RequestMethod.GET)
    public Collection<Employees> getEmployeesByFullName(
            @RequestParam(value = "employeeFirstName") String first_name,
            @RequestParam(value = "employeeLastName") String last_name
    ) {
        return employeeSearchService.listEmployeesByFullName(first_name, last_name);
    }

    @RequestMapping(value = "/employeeHireDate", method = RequestMethod.GET)
    public Collection<Employees> getEmployeesByHireDate(
            @RequestParam(value = "employeeHireDate") Date hire_date
    ) {
        return employeeSearchService.listEmployeesByHireDate(hire_date);
    }

    @RequestMapping(value = "/employeeId", method = RequestMethod.GET)
    public Employees getEmployeeById(
            @RequestParam(value = "employeeId") long id
    ) {
        System.out.println(employeeSearchService.queryEmployeeById(id));
        return employeeSearchService.queryEmployeeById(id);
    }

    @RequestMapping(value = "/add", method = RequestMethod.PUT)
    public void addEmployee(
            @RequestBody(required = true) Employees employees) {
        employeeSearchService.addEmployee(employees);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public void updateEmployee(
            @RequestBody(required = true) Employees employees) {
        employeeSearchService.updateEmployee(employees);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public void deleteEmployee(
            @RequestParam(value = "employeeId", required = true) long id
    ) {
        employeeSearchService.deleteEmployee(id);
    }

}
