package FrameworkBasedPrograming.controller;

import FrameworkBasedPrograming.model.Employees;
import FrameworkBasedPrograming.model.Titles;
import FrameworkBasedPrograming.service.TitlesSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.Collection;

@RestController
@RequestMapping(value = {"/titles"})
public class TitlesControllerClass {
    @Autowired
    private TitlesSearchService titlesSearchService;

    @RequestMapping(value="/empno", method = RequestMethod.GET)
    public Collection<Titles> getTitlesOfEmployee(
            @RequestParam(value = "empID") long empNo
    ) { return titlesSearchService.getTitlesByEmpNo(empNo); }

    @RequestMapping(value="/name", method = RequestMethod.GET)
    public Collection<Titles> getTitlesByName(
            @RequestParam(value = "title_name") String titleName
    ) { return titlesSearchService.getTitlesByTitleName(titleName); }

    @RequestMapping(value="/add", method = RequestMethod.PUT)
    public void addNewTitle(
            @RequestBody() Titles titles
    ) { titlesSearchService.addTitle(titles); }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public void updateTitle(
            @RequestBody() Titles titles
    ) { titlesSearchService.updateTitle(titles); }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public void deleteTitle(
            @RequestParam(value = "emp_no") long empNo,
            @RequestParam(value = "from_date") Date fromDate
    ) { titlesSearchService.deleteTitle(empNo, fromDate); }

}
