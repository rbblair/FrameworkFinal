package FrameworkBasedPrograming.dao;

import FrameworkBasedPrograming.model.Dept_manager;
import org.springframework.data.repository.CrudRepository;

import java.sql.Date;
import java.util.Collection;

public interface Dept_managerRepository extends CrudRepository<Dept_manager, Long> {
    Collection<Dept_manager> findAllByDeptNo(String dept_no);
    Dept_manager findByFromDateAndToDateAndDeptNo(Date from_date, Date to_date, String dept_no);

}
