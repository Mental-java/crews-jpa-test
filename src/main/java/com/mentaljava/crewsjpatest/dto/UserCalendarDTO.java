package com.mentaljava.crewsjpatest.dto;

import java.sql.Time;
import java.util.Date;

public class UserCalendarDTO {
    private int userCalendarId;
    private Date startDate;
    private Date endDate;
    private String title;
    private String calendarContent;
    private int deleteStatus;
    private String userId;
    private Time time;

    public UserCalendarDTO() {}

    public UserCalendarDTO(int userCalendarId, Date startDate, Date endDate, String title, String calendarContent, int deleteStatus, String userId, Time time) {
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
        return "UserCalendarDTO{" +
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
