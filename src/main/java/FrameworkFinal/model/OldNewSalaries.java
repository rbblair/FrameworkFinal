package FrameworkFinal.FrameworkBasedPrograming.model;

public class OldNewSalaries {
    private Salaries oldSalary;
    private Salaries newSalary;

    public OldNewSalaries() {
    }

    public OldNewSalaries(Salaries oldSalary, Salaries newSalary) {
        this.oldSalary = oldSalary;
        this.newSalary = newSalary;
    }

    public Salaries getOldSalary() {
        return oldSalary;
    }

    public void setOldSalary(Salaries oldSalary) {
        this.oldSalary = oldSalary;
    }

    public Salaries getNewSalary() {
        return newSalary;
    }

    public void setNewSalary(Salaries newSalary) {
        this.newSalary = newSalary;
    }

    @Override
    public String toString() {
        return "OldNewSalaries{" +
                "oldSalary=" + oldSalary +
                ", newSalary=" + newSalary +
                '}';
    }
}
