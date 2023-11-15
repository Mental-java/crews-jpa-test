package com.mentaljava.crewsjpatest.domain;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;


@Entity
@Table(name="USER_CALENDER")
public class UserCalendar {

    @Id
    @Column(name="USER_CALENDAR_ID")
    private int userCalendarId;
    @Column(name="START_DATE")
    private Date startDate;
    @Column(name="END_DATE")
    private Date endDate;
    @Column(name="TITLE")
    private String title;
    @Column(name="CALENDAR_CONTENT")
    private String calendarContent;
    @Column(name="DELETE_STATUS")
    private int deleteStatus;
    @Column(name="USER_ID")
    private String userId;
    @Column(name="TIME")
    private Time time;

    public UserCalendar() {}

    public UserCalendar(int userCalendarId, Date startDate, Date endDate, String title, String calendarContent, int deleteStatus, String userId, Time time) {
        this.userCalendarId = userCalendarId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.title = title;
        this.calendarContent = calendarContent;
        this.deleteStatus = deleteStatus;
        this.userId = userId;
        this.time = time;
    }

    public int getUserCalendarId() {
        return userCalendarId;
    }

    public void setUserCalendarId(int userCalendarId) {
        this.userCalendarId = userCalendarId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCalendarContent() {
        return calendarContent;
    }

    public void setCalendarContent(String calendarContent) {
        this.calendarContent = calendarContent;
    }

    public int getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(int deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "UserCalendar{" +
                "userCalendarId=" + userCalendarId +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", title='" + title + '\'' +
                ", calendarContent='" + calendarContent + '\'' +
                ", deleteStatus=" + deleteStatus +
                ", userId='" + userId + '\'' +
                ", time=" + time +
                '}';
    }
}
