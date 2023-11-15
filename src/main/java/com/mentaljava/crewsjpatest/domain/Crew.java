package com.mentaljava.crewsjpatest.domain;

import java.sql.Date;
import javax.persistence.*;
import lombok.Data;

@Entity
@Data @Table(name = "CREW")
public class Crew {

    @Id @GeneratedValue
    @Column(name = "CREW_ID")
    private int crewId;

    @Column(name = "CREW_NAME")
    private String crewName;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User captain;

    @Column(name = "INTRODUCTION")
    private String introduction;

    @ManyToOne
    @JoinColumn(name = "CATEGORY_CODE")
    private CrewCategory crewCategoryCode;

    @Column(name = "START_DATE")
    private Date startDate;

    @Column(name = "END_DATE")
    private Date endDate;

    @Column(name = "CREW_RECRUITMENT_POST")
    private String crewRecruitmentPost;

    @Column(name = "CREW_RECRUITMENT_CONTENT")
    private String crewRecruitmentContent;

    @Column(name = "RECRUITMENT_STATUS")
    private String recruitmentStatus;

    @Column(name = "CREATION_DATE")
    private Date creationDate;

}
