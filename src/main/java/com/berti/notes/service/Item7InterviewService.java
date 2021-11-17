package com.berti.notes.service;

import com.berti.notes.model.Interview;
import com.berti.notes.repository.InterviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Item7InterviewService implements InterviewService {

    // INTER-7 : Identifie tu un patron de conception (Design Pattern) dans le service InterviewServices ?
    @Override
    public String getItem() {
        return "Question :  Identifie tu un patron de conception (Design Pattern) dans le service InterviewServices ?";
    }

    @Override
    public String name() {
        return "item7";
    }
}
