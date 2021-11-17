package com.berti.notes.controller;


import com.berti.notes.service.InterviewServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InterviewController {

    @Autowired
    private InterviewServices interviewServices;

    @GetMapping("/interview/{item}")
    public ResponseEntity<String> getItem(@PathVariable String item){
        return ResponseEntity.ok(interviewServices.getItem(item));
    }
}
