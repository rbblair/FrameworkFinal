package FrameworkBasedPrograming.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Departments {
    @Id
    //@GeneratedValue(generator="system-uuid")
    //@GenericGenerator(name="system-uuid", strategy = "uuid")
    @Column(name = "dept_no", nullable = false)
    private String deptNo;

    @Column(name="dept_name", nullable = false)
    private String deptName;

    public Departments() {
    }

    public String getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Departments{" +
                "deptNo=" + deptNo +
                ", deptName='" + deptName + '\'' +
                '}';
    }
}
