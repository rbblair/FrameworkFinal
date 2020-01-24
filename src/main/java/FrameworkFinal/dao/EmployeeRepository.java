package FrameworkBasedPrograming.dao;

import FrameworkBasedPrograming.model.Employees;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.sql.Date;
import java.util.Collection;

public interface EmployeeRepository extends CrudRepository<Employees, Long> {
    //Optional<Employees> findByEmp_no(long id);
    Employees findByEmpNo(long emp_no);

    @Modifying
    @Query(value = "DELETE FROM Employees e WHERE e.empNo = :empNo")
    @Transactional
    void deleteByEmpNo(@Param("empNo") long empNo);

    Collection<Employees> findAllByFirstName(String first_name);

    Collection<Employees> findAllByLastName(String last_name);

    Collection<Employees> findAllByFirstNameAndLastName(String first_name, String last_name);

    Collection<Employees> findAllByHireDate(Date hire_date);

}
