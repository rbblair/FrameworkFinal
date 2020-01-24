package FrameworkBasedPrograming.dao;

import FrameworkBasedPrograming.model.Departments;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.Collection;

public interface DepartmentsRepository extends CrudRepository<Departments, Long> {
    Departments findByDeptNo(String dept_no);

    @Transactional
    void deleteByDeptNo(String dept_no);

    Collection<Departments> findAllByDeptName(String dept_name);
}
