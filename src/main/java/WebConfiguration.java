import FrameworkBasedPrograming.dao.*;
import FrameworkBasedPrograming.service.*;
import FrameworkBasedPrograming.service.serviceImpl.*;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class WebConfiguration {

    @Bean
    public EmployeeSearchService employeeSearchService(EmployeeRepository employeeRepository) {
        return new EmployeeSearchServiceImplementation(employeeRepository);
    }

    @Bean
    public DepartmentSearchService departmentSearchService(DepartmentsRepository departmentsRepository) {
        return new DepartmentSearchServiceImplementation(departmentsRepository);
    }

    @Bean
    public SalariesSearchService salariesSearchService(SalariesRepository salariesRepository) {
        return new SalariesSearchServiceImplementation(salariesRepository);
    }

    @Bean
    public TitlesSearchService titlesSearchService(TitlesRepository titlesRepository) {
        return new TitlesSearchServiceImplementation(titlesRepository);
    }

    @Bean
    public Dept_managerSearchService dept_managerSearchService(Dept_managerRepository dept_managerRepository) {
        return new Dept_managerSearchServiceImplementation(dept_managerRepository);
    }

    @Bean
    public Dept_empSearchService deptEmpSearchService(Dept_empRepository deptEmpRepository) {
        return  new Dept_empSearchServiceImplementation(deptEmpRepository);
    }
}
