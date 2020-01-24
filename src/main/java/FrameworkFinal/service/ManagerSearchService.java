package FrameworkBasedPrograming.service;

import FrameworkBasedPrograming.model.Dept_manager;
import FrameworkBasedPrograming.model.OldNewDeptManager;

import java.sql.Date;
import java.util.Collection;

public interface Dept_managerSearchService {
    public Collection<Dept_manager> listDepartmentManagers();

    public Collection<Dept_manager> listDepartmentManagersByDeptNo(String Dept_no);

    public Dept_manager getDepartmentManagerByFromDateAndToDateAndDept_no(Date from_date, Date to_date, String dept_no);

    void addDeptManager(Dept_manager dept_manager);

    void updateDeptManager(OldNewDeptManager oldNewDeptManager);

    void deleteDepartmentManager(Dept_manager dept_manager);
}
