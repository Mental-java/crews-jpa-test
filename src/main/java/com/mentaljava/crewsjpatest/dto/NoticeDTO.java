package com.mentaljava.crewsjpatest.dto;

import com.mentaljava.crewsjpatest.domain.Admin;
import java.sql.Date;

public class NoticeDTO {
    private Long noticeId;
    private String noticeTitle;
    private String noticeContent;
    private Date noticeDate;
    private Integer delete_status;
    private Admin adminId;


    public NoticeDTO(Long noticeId, String noticeTitle, String noticeContent, Date noticeDate, Integer delete_status, Admin adminId) {
        this.noticeId = noticeId;
        this.noticeTitle = noticeTitle;
        this.noticeContent = noticeContent;
        this.noticeDate = noticeDate;
        this.delete_status = delete_status;
        this.adminId = adminId;
    }

    public Long getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(Long noticeId) {
        this.noticeId = noticeId;
    }

    public String getNoticeTitle() {
        return noticeTitle;
    }

    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle;
    }

    public String getNoticeContent() {
        return noticeContent;
    }

    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent;
    }

    public Date getNoticeDate() {
        return noticeDate;
    }

    public void setNoticeDate(Date noticeDate) {
        this.noticeDate = noticeDate;
    }

    public Integer getDelete_status() {
        return delete_status;
    }

    public void setDelete_status(Integer delete_status) {
        this.delete_status = delete_status;
    }

    public Admin getAdminId() {
        return adminId;
    }

    public void setAdminId(Admin adminId) {
        this.adminId = adminId;
    }

    @Override
    public String toString() {
        return "NoticeDTO{" +
                "noticeId=" + noticeId +
                ", noticeTitle='" + noticeTitle + '\'' +
                ", noticeContent='" + noticeContent + '\'' +
                ", noticeDate=" + noticeDate +
                ", delete_status=" + delete_status +
                ", adminId=" + adminId +
                '}';
    }
}
