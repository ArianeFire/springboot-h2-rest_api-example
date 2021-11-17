package com.berti.notes.service;

import com.berti.notes.model.Interview;
import com.berti.notes.repository.InterviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class InterviewServiceItem3 implements InterviewService {

    @Autowired
    private InterviewRepository inMemoryinterviewRepository;

    // INTER-3 : Code + Class => Correctement Encapsulation ?
    //         : Peut on cacher le details d'implementation du model  Interview ?
    @Override
    public String getItem() {

        Interview interview = inMemoryinterviewRepository.getAbstractInterview();

        if(interview.getSubInterview() != null){
            if(interview.subInterview.getQuestion1() != null){
                return String.format("%s :  %s", interview.getSubInterview().getQuestion1(),
                        "Trouver l'implementation de l'interview pour plus de details.....");
            }
        }

        return "?????";
    }

    @Override
    public String name() {
        return "item3";
    }
}
