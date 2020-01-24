package FrameworkBasedPrograming.model;

public class OldNewDeptManager {
    private Dept_manager oldDeptManager;
    private Dept_manager newDeptManager;

    public OldNewDeptManager() {
    }

    public OldNewDeptManager(Dept_manager oldDeptManager, Dept_manager newDeptManager) {
        this.oldDeptManager = oldDeptManager;
        this.newDeptManager = newDeptManager;
    }

    @Override
    public String toString() {
        return "OldNewDeptManager{" +
                "oldDeptManager=" + oldDeptManager +
                ", newDeptManager=" + newDeptManager +
                '}';
    }

    public Dept_manager getOldDeptManager() {
        return oldDeptManager;
    }

    public void setOldDeptManager(Dept_manager oldDeptManager) {
        this.oldDeptManager = oldDeptManager;
    }

    public Dept_manager getNewDeptManager() {
        return newDeptManager;
    }

    public void setNewDeptManager(Dept_manager newDeptManager) {
        this.newDeptManager = newDeptManager;
    }
}
