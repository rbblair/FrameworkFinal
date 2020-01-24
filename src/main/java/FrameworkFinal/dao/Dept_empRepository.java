package FrameworkBasedPrograming.dao;

import FrameworkBasedPrograming.model.Dept_emp;
import org.springframework.data.repository.CrudRepository;

import java.sql.Date;
import java.util.Collection;

public interface Dept_empRepository extends CrudRepository<Dept_emp, Long> {
    Collection<Dept_emp> findAllByDeptNo(String dept_no);
    Collection<Dept_emp> findAllByEmpNo(long emp_no);
    Dept_emp findByFromDateAndToDateAndDeptNo(Date from_date, Date to_date, String Dept_no);
}
