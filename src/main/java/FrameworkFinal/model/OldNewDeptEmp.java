package FrameworkBasedPrograming.model;

public class OldNewDeptEmp {
    private Dept_emp OldDeptEmp;
    private Dept_emp NewDeptEmp;

    public OldNewDeptEmp(Dept_emp oldDeptEmp, Dept_emp newDeptEmp) {
        OldDeptEmp = oldDeptEmp;
        NewDeptEmp = newDeptEmp;
    }

    public OldNewDeptEmp() {
    }

    @Override
    public String toString() {
        return "OldNewDeptEmp{" +
                "OldDeptEmp=" + OldDeptEmp +
                ", NewDeptEmp=" + NewDeptEmp +
                '}';
    }

    public Dept_emp getOldDeptEmp() {
        return OldDeptEmp;
    }

    public void setOldDeptEmp(Dept_emp oldDeptEmp) {
        OldDeptEmp = oldDeptEmp;
    }

    public Dept_emp getNewDeptEmp() {
        return NewDeptEmp;
    }

    public void setNewDeptEmp(Dept_emp newDeptEmp) {
        NewDeptEmp = newDeptEmp;
    }
}
