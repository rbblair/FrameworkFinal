package FrameworkFinal.model;
import FrameworkFinal.FrameworkBasedPrograming.model.Manager;

public class OldNewDeptManager {
    private Manager oldDeptManager;
    private Manager newDeptManager;

    public OldNewDeptManager() {
    }

    public OldNewDeptManager(Manager oldDeptManager, Manager newDeptManager) {
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

    public Manager getOldDeptManager() {
        return oldDeptManager;
    }

    public void setOldDeptManager(Manager oldDeptManager) {
        this.oldDeptManager = oldDeptManager;
    }

    public Manager getNewDeptManager() {
        return newDeptManager;
    }

    public void setNewDeptManager(Manager newDeptManager) {
        this.newDeptManager = newDeptManager;
    }
}
