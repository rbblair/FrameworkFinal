package FrameworkBasedPrograming.service;

import FrameworkBasedPrograming.model.Salaries;

import java.sql.Date;
import java.util.Collection;

public interface SalariesSearchService {
    void addSalary(Salaries salary);
    void updateSalary(Salaries oldSalary, Salaries newSalary);
    void deleteSalary(long emp_no, Date from_date);
    Salaries getSalaryByEmpNoAndFromDate(long emp_no, Date from_date);
    Collection<Salaries> getAllSalariesByEmpNo(long emp_no);
    Collection<Salaries> getAllSalariesBetweenDates(Date from_date, Date to_date);
    Collection<Salaries> getAllSalariesByEmpNoBetweenDates(long emp_no, Date from_date, Date to_date);
}
