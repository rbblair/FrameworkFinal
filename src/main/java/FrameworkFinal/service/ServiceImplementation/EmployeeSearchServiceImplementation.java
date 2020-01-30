package FrameworkFinal.service.ServiceImplementation;

import FrameworkFinal.dao.EmployeeRepository;
import FrameworkFinal.model.Employees;
import FrameworkFinal.service.ManagerSearchService;
import FrameworkFinal.service.EmployeeSearchService;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.Collection;

@Service
public class EmployeeSearchServiceImplementation implements EmployeeSearchService {
    private EmployeeRepository employeeRepository;
    private ManagerSearchService dept_managerSearchService;

    public EmployeeSearchServiceImplementation(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Collection<Employees> listEmployees() {
        return (Collection<Employees>) employeeRepository.findAll();
    }


    @Override
    public Employees queryEmployeeById(long id) {
        return employeeRepository.findByEmpNo(id);
    }

    @Override
    public void addEmployee(Employees employees) {
        employeeRepository.save(employees);
    }

    @Override
    public void updateEmployee(Employees employees) {
        Employees temp_emp = employeeRepository.findByEmpNo(employees.getEmpNo());
        System.out.println(temp_emp);
        if (temp_emp.getFirst_name().length() != 0) {
            temp_emp.setBirth_date(employees.getBirth_date());
            temp_emp.setFirst_name(employees.getFirst_name());
            temp_emp.setLast_name(employees.getLast_name());
            temp_emp.setGender(employees.getGender());
            System.out.println(temp_emp);
            employeeRepository.save(temp_emp);
        }
    }

    @Override
    public void deleteEmployee(long id) {
        System.out.println(employeeRepository.findByEmpNo(id));
        employeeRepository.deleteByEmpNo(id);
    }

    @Override
    public Collection<Employees> listEmployeesByFirstName(String first_name) {
        return employeeRepository.findAllByFirstName(first_name);
    }

    @Override
    public Collection<Employees> listEmployeesByLastName(String last_name) {
        return employeeRepository.findAllByLastName(last_name);
    }

    @Override
    public Collection<Employees> listEmployeesByFullName(String first_name, String last_name) {
        return employeeRepository.findAllByFirstNameAndLastName(first_name, last_name);
    }

    @Override
    public Collection<Employees> listEmployeesByHireDate(Date hire_date) {
        return employeeRepository.findAllByHireDate(hire_date);
    }

    @Override
    public Collection<Employees> listEmployeesByDepartment(String dep_no) {
        //how can i inject other services or repositories ?
        return null;
    }

    @Override
    public Collection<Employees> listEmployeesByTitle(String title) {
        return null;
    }

    @Override
    public Collection<Employees> listDepartmentManagers(String dep_no) {
        return null;
    }
}
