package FrameworkFinal.service;

import FrameworkFinal.model.Employees;

import java.sql.Date;
import java.util.Collection;

public interface EmployeeSearchService {
    public Collection<Employees> listEmployees();

    public Employees queryEmployeeById(long id);

    void addEmployee(Employees employees);

    void updateEmployee(Employees employees);

    void deleteEmployee(long id);

    public Collection<Employees> listEmployeesByFirstName(String first_name);

    public Collection<Employees> listEmployeesByLastName(String last_name);

    public Collection<Employees> listEmployeesByFullName(String first_name, String last_name);

    public Collection<Employees> listEmployeesByHireDate(Date hire_date);

    Collection<Employees> listEmployeesByDepartment(String dep_no);

    Collection<Employees> listEmployeesByTitle(String title);

    Collection<Employees> listDepartmentManagers(String dep_no);
    //get all workers
    //get workers from to date
    //get all managers
    //get workers bt title
    //get by department?

}
