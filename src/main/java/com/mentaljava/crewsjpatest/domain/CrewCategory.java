package com.mentaljava.crewsjpatest.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class CrewCategory {

    @Id
    @Column(name = "CATEGORY_CODE")
    private int category_code;

    @Column(name = "CATEGORY_NAME")
    private String category_name;

}
