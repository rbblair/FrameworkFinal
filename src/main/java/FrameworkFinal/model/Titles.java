package FrameworkBasedPrograming.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Titles {
    @Column(name="emp_no", nullable = false)
    private Long empNo;

    @Column(name="title", nullable = false)
    private String title;

    @Id
    @Column(name="from_date", nullable = false)
    private Date fromDate;

    @Column(name="to_date", nullable = false)
    private Date toDate;

    public Titles() {

    }

    public Long getEmp_no() {
        return empNo;
    }

    public void setEmp_no(Long emp_no) {
        this.empNo = emp_no;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getFrom_date() {
        return fromDate;
    }

    public void setFrom_date(Date from_date) {
        this.fromDate = from_date;
    }

    public Date getTo_date() {
        return toDate;
    }

    public void setTo_date(Date to_date) {
        this.toDate = to_date;
    }

    @Override
    public String toString() {
        return "Titles{" +
                "emp_no=" + empNo +
                ", title='" + title + '\'' +
                ", from_date=" + fromDate +
                ", to_date=" + toDate +
                '}';
    }
}
