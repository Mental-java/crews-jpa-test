package com.mentaljava.crewsjpatest.service;

import com.mentaljava.crewsjpatest.domain.UserCalendar;
import com.mentaljava.crewsjpatest.dto.UserCalendarDTO;
import com.mentaljava.crewsjpatest.repository.UserCalendarRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class UserCalendarService {
    private final UserCalendarRepository userCalendarRepository;
    private final ModelMapper modelMapper;
    public UserCalendarService(UserCalendarRepository userCalendarRepository, ModelMapper modelMapper) {
        this.userCalendarRepository = userCalendarRepository;
        this.modelMapper = modelMapper;
    }

    public UserCalendarDTO findUserCalendarById(int userCalendarId){
        UserCalendar userCalendar = userCalendarRepository.findById(userCalendarId).orElseThrow(IllegalAccessError::new);

        return modelMapper.map(userCalendar, UserCalendarDTO.class);
    }
}
