package FrameworkFinal.FrameworkBasedPrograming.service;

import FrameworkFinal.FrameworkBasedPrograming.model.Departments;

import java.util.Collection;

public interface DeptSearchService {
    public Collection<Departments> listDepartments();

    public Departments queryDepartmentById(String id);

    public Collection<Departments> queryDepartmentByName(String depName);

    void addDepartment(Departments departments);

    void updateDepartment(Departments departments);

    void deleteDepartment(String id);
}
