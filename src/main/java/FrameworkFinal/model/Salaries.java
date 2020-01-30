package FrameworkFinal.FrameworkBasedPrograming.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Salaries {
    @Column(name = "emp_no", nullable = false)
    private long empNo;

    @Column(name = "salary", nullable = false)
    private long salary;

    @Id
    @Column(name = "from_date", nullable = false)
    private Date fromDate;

    @Column(name = "to_date", nullable = false)
    private Date toDate;

    public long getEmpNo() {
        return empNo;
    }

    public void setEmpNo(long empNo) {
        this.empNo = empNo;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
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

    public Salaries() {

    }

    @Override
    public String toString() {
        return "Salaries{" +
                "empNo=" + empNo +
                ", salary='" + salary + '\'' +
                ", fromDate=" + fromDate +
                ", toDate=" + toDate +
                '}';
    }
}
