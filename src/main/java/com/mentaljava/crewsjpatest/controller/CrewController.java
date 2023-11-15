package com.mentaljava.crewsjpatest.controller;

import com.mentaljava.crewsjpatest.domain.Crew;
import com.mentaljava.crewsjpatest.service.CrewService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class CrewController {

    private final CrewService crewService;

    @GetMapping("/crew")
    public String crewList(Model model){
        List<Crew> crews = crewService.findCrew();
        model.addAttribute("crewForm", new Crew());
        return "crew/crewList";
    }

}
