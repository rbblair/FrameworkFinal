package FrameworkBasedPrograming.service;

import FrameworkBasedPrograming.model.Titles;

import java.sql.Date;
import java.util.Collection;

public interface TitlesSearchService {
    void addTitle(Titles title);
    void updateTitle(Titles title);
    void deleteTitle(long emp_no, Date from_date);
    Collection<Titles> getTitlesByEmpNo(long emp_no);
    Collection<Titles> getTitlesByTitleName(String titleName);
}
