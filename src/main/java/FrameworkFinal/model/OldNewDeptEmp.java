package FrameworkFinal.model;
import FrameworkFinal.FrameworkBasedPrograming.model.Emp;

public class OldNewDeptEmp {
    private FrameworkFinal.FrameworkBasedPrograming.model.Emp OldDeptEmp;
    private Emp NewDeptEmp;

    public OldNewDeptEmp(Emp oldDeptEmp, Emp newDeptEmp) {
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

    public Emp getOldDeptEmp() {
        return OldDeptEmp;
    }

    public void setOldDeptEmp(Emp oldDeptEmp) {
        OldDeptEmp = oldDeptEmp;
    }

    public Emp getNewDeptEmp() {
        return NewDeptEmp;
    }

    public void setNewDeptEmp(Emp newDeptEmp) {
        NewDeptEmp = newDeptEmp;
    }
}
