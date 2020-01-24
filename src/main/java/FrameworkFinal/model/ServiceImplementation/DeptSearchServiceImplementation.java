package FrameworkBasedPrograming.service.serviceImpl;

import FrameworkBasedPrograming.dao.DepartmentsRepository;
import FrameworkBasedPrograming.model.Departments;
import FrameworkBasedPrograming.service.DepartmentSearchService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Iterator;

@Service
public class DepartmentSearchServiceImplementation implements DepartmentSearchService {
    private DepartmentsRepository departmentsRepository;

    public DepartmentSearchServiceImplementation(DepartmentsRepository departmentsRepository) {
        this.departmentsRepository = departmentsRepository;
    }

    @Override
    public Collection<Departments> listDepartments() {
        return (Collection<Departments>) departmentsRepository.findAll();
    }

    @Override
    public Departments queryDepartmentById(String id) {
        return departmentsRepository.findByDeptNo(id);
    }

    @Override
    public Collection<Departments> queryDepartmentByName(String depName) {
        return (Collection<Departments>) departmentsRepository.findAllByDeptName(depName);
    }

    @Override
    public void addDepartment(Departments departments) {
        departmentsRepository.save(departments);
    }

    @Override
    public void updateDepartment(Departments departments) {
        Departments temp_dep = departmentsRepository.findByDeptNo(departments.getDeptNo());
        //idk if we should update dep_no
        if (temp_dep.getDeptName().length() != 0) {
            temp_dep.setDeptName(departments.getDeptName());
            departmentsRepository.save(temp_dep);
        }
    }

    @Override
    public void deleteDepartment(String id) {
        departmentsRepository.deleteByDeptNo(id);
    }
}
