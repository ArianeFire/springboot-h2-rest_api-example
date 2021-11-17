package com.berti.notes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class InterviewServices {

    @Autowired
    private List<InterviewService> interviewServices;

    private Map<String, InterviewService> interviewServiceMap;

    public String getItem(String item){
        return interviewServiceMap.get(item).getItem();
    }

    @PostConstruct
    public void init(){
        interviewServiceMap = interviewServices.stream().collect(Collectors.toMap(InterviewService::name, Function.identity()));
    }
}
