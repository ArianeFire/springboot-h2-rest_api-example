package com.berti.notes.service;

import com.berti.notes.model.Interview;
import com.berti.notes.repository.InterviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Item6InterviewService implements InterviewService {

    @Autowired
    private InterviewRepository inMemoryinterviewRepository;

    @Autowired
    private FakeInterviewNotifier notifier;

    // INTER-6 : Avis sur la fonction "isInterviewFake" ?
    @Override
    public String getItem() {
        Interview interview = inMemoryinterviewRepository.getAbstractInterview();

        if(isInterviewFake(interview)){
            throw new IllegalArgumentException();
        }

        return String.format("%s : %s", interview.name, "Retrouver l'implementation pour plus de details sur la question");
    }

    private boolean isInterviewFake(Interview interview) {
        if(interview.isFake()){
            notifier.notifier(interview);
            return true;
        }

        return false;
    }

    @Override
    public String name() {
        return "item6";
    }
}
