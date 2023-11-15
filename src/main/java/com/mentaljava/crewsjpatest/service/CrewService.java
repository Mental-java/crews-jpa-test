package com.mentaljava.crewsjpatest.service;

import com.mentaljava.crewsjpatest.domain.Crew;
import com.mentaljava.crewsjpatest.repository.CrewRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class CrewService {

    private final CrewRepository crewRepository;

    public List<Crew> findCrew() {
        return crewRepository.findAll();
    }
}
