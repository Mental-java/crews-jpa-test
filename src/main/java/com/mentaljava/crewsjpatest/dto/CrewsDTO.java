package com.mentaljava.crewsjpatest.dto;
import com.mentaljava.crewsjpatest.domain.Crew;
import com.mentaljava.crewsjpatest.domain.CrewCategory;
import com.mentaljava.crewsjpatest.domain.User;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.sql.Date;

public class CrewsDTO {

    private Long crewId;
    private String crewName;
    private User captain;
    private String introduction;
    private CrewCategory crewCategoryCode;
    private Date startDate;
    private Date endDate;
    private String crewRecruitmentPost;
    private String crewRecruitmentContent;
    private String recruitmentStatus;
    private java.sql.Date creationDate;
    public CrewsDTO() {
    }

}
