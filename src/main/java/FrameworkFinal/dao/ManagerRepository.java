package FrameworkFinal.FrameworkBasedPrograming.dao;

import FrameworkFinal.FrameworkBasedPrograming.model.Manager;
import org.springframework.data.repository.CrudRepository;

import java.sql.Date;
import java.util.Collection;

public interface ManagerRepository extends CrudRepository<Manager, Long> {
    Collection<Manager> findAllByDeptNo(String dept_no);

    Manager findByFromDateAndToDateAndDeptNo(Date from_date, Date to_date, String dept_no);

}
