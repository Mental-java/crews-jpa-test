package com.mentaljava.crewsjpatest.repository;

import com.mentaljava.crewsjpatest.domain.Crew;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CrewRepository extends JpaRepository<Crew,Long> {

}
