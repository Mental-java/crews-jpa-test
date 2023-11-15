package com.mentaljava.crewsjpatest.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="admin")
public class Admin {

    @Id
    @Column(name="ADMIN_ID")
    private String ADMIN_ID;

    @Column(name="ADMIN_PW")
    private String ADMIN_PW;

    @Column(name="PERMSSION_NAME")
    private String PERMISSION_NAME;
}
