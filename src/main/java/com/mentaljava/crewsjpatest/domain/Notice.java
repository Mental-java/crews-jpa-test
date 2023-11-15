package com.mentaljava.crewsjpatest.domain;

import java.sql.Date;
import lombok.Data;
import javax.persistence.*;

@Entity
@Data @Table(name = "NOTICE")
public class Notice {

    @Id @GeneratedValue
    @Column(name = "NOTICE_ID")
    private Long noticeId;

    @Column(name = "NOTICE_TITLE")
    private String noticeTitle;

    @Column(name = "NOTICE_CONTENT")
    private String noticeContent;

    @Column(name = "NOTICE_DATE")
    private Date noticeDate;

    @Column(name = "DELETE_STATUS")
    private Integer delete_status;

    @ManyToOne
    @JoinColumn(name = "ADMIN_ID")
    @Column(name = "ADMIN_ID")
    private Admin adminId;

}
