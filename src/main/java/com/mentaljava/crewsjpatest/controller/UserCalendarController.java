package com.mentaljava.crewsjpatest.controller;

import com.mentaljava.crewsjpatest.domain.UserCalendar;
import com.mentaljava.crewsjpatest.dto.UserCalendarDTO;
import com.mentaljava.crewsjpatest.service.UserCalendarService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class UserCalendarController {

    private final UserCalendarService userCalendarService;

    @GetMapping("/user")
    public String findUserCalendarById(Model model){
        List<UserCalendar> calendars = userCalendarService.findCalendar();
        model.addAttribute("userCalendar", calendars);
        return "user/detail";
    }
}
