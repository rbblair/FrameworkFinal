package FrameworkFinal.FrameworkBasedPrograming.dao;

import FrameworkFinal.FrameworkBasedPrograming.model.Emp;
import org.springframework.data.repository.CrudRepository;

import java.sql.Date;
import java.util.Collection;

public interface EmpRepository extends CrudRepository<Emp, Long> {
    Collection<Emp> findAllByDeptNo(String dept_no);

    Collection<Emp> findAllByEmpNo(long emp_no);

    Emp findByFromDateAndToDateAndDeptNo(Date from_date, Date to_date, String Dept_no);
}
