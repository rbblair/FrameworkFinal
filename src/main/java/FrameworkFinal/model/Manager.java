package FrameworkFinal.FrameworkBasedPrograming.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Manager {
    @Id
    @Column(name = "emp_no", nullable = false)
    private Long empNo;

    @Column(name = "dept_no", nullable = false)
    private String deptNo;

    @Column(name = "from_date", nullable = false)
    private Date fromDate;

    @Column(name = "to_date", nullable = false)
    private Date toDate;

    public Manager() {
    }

    @Override
    public String toString() {
        return "Dept_manager{" +
                "empNo=" + empNo +
                ", dept_no=" + deptNo +
                ", fromDate=" + fromDate +
                ", toDate=" + toDate +
                '}';
    }

    public Long getEmpNo() {
        return empNo;
    }

    public void setEmpNo(Long empNo) {
        this.empNo = empNo;
    }

    public String getDept_no() {
        return deptNo;
    }

    public void setDept_no(String dept_no) {
        this.deptNo = dept_no;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }
}
