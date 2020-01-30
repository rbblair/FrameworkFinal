import FrameworkFinal.dao.*;
import FrameworkFinal.service.*;
import FrameworkFinal.service.ServiceImplementation.*;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class WebConfiguration {

    @Bean
    public EmployeeSearchService EmployeeSearchService(EmployeeRepository employeeRepository) {
        return new EmployeeSearchServiceImplementation(employeeRepository);
    }

    @Bean
    public FrameworkFinal.FrameworkBasedPrograming.service.DeptSearchService DeptSearchService(FrameworkFinal.FrameworkBasedPrograming.dao.DepartmentsRepository departmentsRepository) {
        return new DeptSearchServiceImplementation(departmentsRepository);
    }

    @Bean
    public FrameworkFinal.FrameworkBasedPrograming.service.SalariesSearchService SalariesSearchService(FrameworkFinal.FrameworkBasedPrograming.dao.SalariesRepository salariesRepository) {
        return new FrameworkFinal.FrameworkBasedPrograming.service.serviceImpl.SalariesSearchServiceImplementation(salariesRepository);
    }

    @Bean
    public FrameworkFinal.FrameworkBasedPrograming.service.TitlesSearchService TitlesSearchService(FrameworkFinal.FrameworkBasedPrograming.dao.TitlesRepository titlesRepository) {
        return new FrameworkFinal.FrameworkBasedPrograming.service.serviceImpl.TitlesSearchServiceImplementation(titlesRepository);
    }

    @Bean
    public ManagerSearchService ManagerSearchService(FrameworkFinal.FrameworkBasedPrograming.dao.ManagerRepository ManagerRepository) {
        return new ManagerSearchServiceImplementation(ManagerRepository);
    }

    @Bean
    public DeptEmpSearchService DeptEmpSearchService(FrameworkFinal.FrameworkBasedPrograming.dao.EmpRepository deptEmpRepository) {
        return  new DeptEmpSearchServiceImplementation(deptEmpRepository);
    }
}
