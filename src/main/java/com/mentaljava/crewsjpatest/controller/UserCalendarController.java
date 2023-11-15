package com.mentaljava.crewsjpatest.controller;

import com.mentaljava.crewsjpatest.dto.UserCalendarDTO;
import com.mentaljava.crewsjpatest.service.UserCalendarService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserCalendarController {

    private final UserCalendarService userCalendarService;

    public UserCalendarController(UserCalendarService userCalendarService){
        this.userCalendarService = userCalendarService;
    }

    @GetMapping("/user")
    public String findUserCalendarById(int userCalendarId, Model model){
        UserCalendarDTO userCalendar = userCalendarService.findUserCalendarById(userCalendarId);

        model.addAttribute("userCalendar", userCalendar);

        return "user/detail";
    }
}
