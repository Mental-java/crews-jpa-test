package com.mentaljava.crewsjpatest.repository;

import com.mentaljava.crewsjpatest.domain.UserCalendar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserCalendarRepository extends JpaRepository<UserCalendar, Integer> {

}
