package FrameworkFinal.service;

import FrameworkFinal.FrameworkBasedPrograming.model.Manager;
import FrameworkFinal.model.OldNewDeptManager;

import java.sql.Date;
import java.util.Collection;

public interface ManagerSearchService {
    public Collection<Manager> listDepartmentManagers();

    public Collection<Manager> listDepartmentManagersByDeptNo(String Dept_no);

    public Manager getDepartmentManagerByFromDateAndToDateAndDept_no(Date from_date, Date to_date, String dept_no);

    void addDeptManager(Manager Manager);

    void updateDeptManager(OldNewDeptManager oldNewDeptManager);

    void deleteDepartmentManager(Manager Manager);
}
