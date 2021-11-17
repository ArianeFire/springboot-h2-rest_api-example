package com.berti.notes.service;

import com.berti.notes.repository.InterviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class InterviewServiceItem2 implements InterviewService {

    @Autowired
    private InterviewRepository inMemoryinterviewRepository;

    // INTER-2 : Attente est de garder le "sout" (System.out....) sans le 'if'
    @Override
    public String getItem() {
        Optional<String> possibleInterViewName = Optional.ofNullable(inMemoryinterviewRepository.getRandomInterviewName());

        if(possibleInterViewName.isPresent()){
            System.out.println("L'interview existe !");
        }

        return possibleInterViewName.orElse("Retrouve l'implemenation de l'interview pour plus de details");
    }

    @Override
    public String name() {
        return "item2";
    }
}
