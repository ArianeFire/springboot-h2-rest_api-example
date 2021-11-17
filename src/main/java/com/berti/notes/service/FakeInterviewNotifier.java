package com.berti.notes.service;

import com.berti.notes.model.Interview;
import org.springframework.stereotype.Service;

@Service
public class FakeInterviewNotifier {

    public void notifier(Interview interview){
        System.out.println("Notification......");
    }

}
