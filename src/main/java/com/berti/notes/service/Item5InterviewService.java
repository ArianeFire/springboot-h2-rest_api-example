package com.berti.notes.service;

import com.berti.notes.repository.InterviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class Item5InterviewService implements InterviewService {

    @Autowired
    private InterviewRepository inMemoryinterviewRepository;

    // INTER-5 :
    @Override
    public String getItem() {
        return "Question : Quelle est ton avis sur nomenclature des services Interview ?";
    }

    @Override
    public String name() {
        return "item5";
    }
}
