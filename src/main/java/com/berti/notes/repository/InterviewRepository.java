package com.berti.notes.repository;

import com.berti.notes.model.Interview;
import org.springframework.stereotype.Service;

public interface InterviewRepository {
    default String getRandomInterviewName(){
        return null;
    }

    default Interview getAbstractInterview(){
        Interview interview = new Interview();
        interview.setName("Interview");
        interview.setQuestion1("Interview Question");
        Interview sousInterview = new Interview();
        sousInterview.setName("SubInterview");
        sousInterview.setQuestion1("SubInterviewQuestion");
        interview.setSubInterview(sousInterview);
        return interview;
    }
}
