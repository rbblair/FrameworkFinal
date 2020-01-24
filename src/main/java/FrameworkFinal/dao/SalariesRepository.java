package FrameworkBasedPrograming.dao;

import FrameworkBasedPrograming.model.Salaries;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.sql.Date;
import java.util.Collection;

public interface SalariesRepository extends CrudRepository<Salaries, Long> {
    Collection<Salaries> findAllByEmpNo(long EmpNo);

    @Modifying
    @Query(value = "DELETE FROM Salaries s WHERE s.empNo = :empNo AND s.fromDate = :fromDate")
    @Transactional
    void deleteByEmpNoAndFromDate(@Param("empNo") long empNo, @Param("fromDate") Date fromDate);

    Salaries findSalariesByEmpNoAndFromDate(long EmpNo, Date from_date);
    Collection<Salaries> findSalariesByFromDateGreaterThanEqualAndToDateLessThanEqual(Date from_date, Date to_date);
    Collection<Salaries> findSalariesByFromDateGreaterThanEqualAndToDateLessThanEqualAndEmpNo(Date from_date, Date to_date, long EmpNo);
    //Collection<Salaries> findAllByFromDateAndToDate(Date from_date, Date to_date);
    //Collection<Salaries> findAllByEmpNoAndFromDateAndToDate(long EmpNo, Date from_date, Date to_date);
}