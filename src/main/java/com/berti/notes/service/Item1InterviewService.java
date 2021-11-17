package com.berti.notes.service;

import com.berti.notes.repository.InterviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Item1InterviewService implements InterviewService {

    @Autowired
    private InterviewRepository inMemoryinterviewRepository;

    // INTER-1 : Attente est d'avoir le retour de orElse ("Default Interview Item 1")
    @Override
    public String getItem() {
        return Optional.of(inMemoryinterviewRepository.getRandomInterviewName())
                .map(item -> String.format("Item 1 : %s", item))
                .orElse("Default Interview Item 1");
    }

    @Override
    public String name() {
        return "item1";
    }
}
