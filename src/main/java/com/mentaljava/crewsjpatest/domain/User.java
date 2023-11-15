package com.mentaljava.crewsjpatest.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
@Data
@Entity
@Table(name="USER")
public class User {

    @Id
    @Column(name = "USER_ID")
    private String USER_ID;

    @Column(name = "NICKNAME")
    private String NICKNAME;

    @Column(name = "DIAMOND_COUNT")
    private int DIAMOND_COUNT;

    @Column(name = "JOIN_DATE")
    private Date JOIN_DATE;

    @Column(name = "OUT_DATE")
    private Date OUT_DATE;

    @Column(name ="PERMISSION_TYPE")
    private String PERMISSION_TYPE;
}
