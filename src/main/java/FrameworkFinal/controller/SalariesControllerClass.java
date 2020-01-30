package FrameworkFinal.FrameworkBasedPrograming.controller;

import FrameworkFinal.FrameworkBasedPrograming.model.OldNewSalaries;
import FrameworkFinal.FrameworkBasedPrograming.model.Salaries;
import FrameworkFinal.FrameworkBasedPrograming.service.SalariesSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.Collection;

@RestController
@RequestMapping(value = {"/salaries"})
public class SalariesControllerClass {
    @Autowired
    private SalariesSearchService salariesSearchService;

    @RequestMapping(value = "/empSalaries", method = RequestMethod.GET)
    public Collection<Salaries> getSalariesByEmpNo(
            @RequestParam(value = "empNo") long emp_no
    ) {
        return salariesSearchService.getAllSalariesByEmpNo(emp_no);
    }

    @RequestMapping(value = "/salariesBetweenDates", method = RequestMethod.GET)
    public Collection<Salaries> getSalariesBetweenDates(
            @RequestParam(value = "fromDate") Date from_date,
            @RequestParam(value = "toDate") Date to_date
    ) {
        return salariesSearchService.getAllSalariesBetweenDates(from_date, to_date);
    }

    @RequestMapping(value = "/salariesBetweenDatesOfEmployee", method = RequestMethod.GET)
    public Collection<Salaries> getSalariesBetweenDatesEmpNo(
            @RequestParam(value = "fromDate") Date from_date,
            @RequestParam(value = "toDate") Date to_date,
            @RequestParam(value = "empNo") long id
    ) {
        return salariesSearchService.getAllSalariesByEmpNoBetweenDates(id, from_date, to_date);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void addSalary(
            @RequestBody(required = true) Salaries salary
    ) {
        salariesSearchService.addSalary(salary);
    }

    @RequestMapping(value = "/salaryByEmpNoAndFromDate", method = RequestMethod.GET)
    public Salaries getSalaryByEmpNoAndFromDate(
            @RequestParam(value = "empNo") long emp_no,
            @RequestParam(value = "fromDate") Date from_date
    ) {
        return salariesSearchService.getSalaryByEmpNoAndFromDate(emp_no, from_date);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public void updateSalary(
            @RequestBody(required = true) OldNewSalaries oldNewSalaries
    ) {
        salariesSearchService.updateSalary(oldNewSalaries.getOldSalary(), oldNewSalaries.getNewSalary());
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public void deleteSalary(
            @RequestParam(value = "empNo") long emp_no,
            @RequestParam(value = "fromDate") Date from_date
    ) {
        salariesSearchService.deleteSalary(emp_no, from_date);
    }
}
