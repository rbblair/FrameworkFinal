package FrameworkFinal.FrameworkBasedPrograming.dao;

import FrameworkFinal.FrameworkBasedPrograming.model.Titles;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.sql.Date;
import java.util.Collection;

public interface TitlesRepository extends CrudRepository<Titles, Long> {
    Collection<Titles> findAllByEmpNo(long emp_no);

    Titles findByEmpNoAndFromDate(long emp_no, Date from_date);

    Collection<Titles> findAllByTitle(String title);

    @Modifying
    @Query(value = "DELETE FROM Titles t WHERE t.empNo = :empNo AND t.fromDate = :fromDate")
    @Transactional
    void deleteByEmpNoAndFromDate(@Param("empNo") long empNo, @Param("fromDate") Date fromDate);
}
