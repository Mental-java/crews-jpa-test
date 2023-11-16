package com.mentaljava.crewsjpatest.service;

import com.mentaljava.crewsjpatest.domain.UserCalendar;
import com.mentaljava.crewsjpatest.dto.UserCalendarDTO;
import com.mentaljava.crewsjpatest.repository.UserCalendarRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class UserCalendarService {
    private final UserCalendarRepository userCalendarRepository;

    public List<UserCalendar> findCalendar() {
        return userCalendarRepository.findAll();
    }
}
