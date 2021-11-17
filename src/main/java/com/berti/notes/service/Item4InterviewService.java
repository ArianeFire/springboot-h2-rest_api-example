package com.berti.notes.service;

import com.berti.notes.model.Interview;
import com.berti.notes.repository.InterviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class Item4InterviewService implements InterviewService {

    @Autowired
    private InterviewRepository inMemoryinterviewRepository;

    // INTER-4 : Reercriture de ces methodes avec l'API Stream (Java 8)
    @Override
    public String getItem() {

        int nbreChiffrePaire = 0;
        int nbreChiffreImpair = 0;

        List<Integer> items = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        for(Integer item : items){
            if(item % 2 == 0){
                nbreChiffrePaire ++;
            } else {
                nbreChiffreImpair ++;
            }
        }

        return String.format(
                "(Nbre Paire : %s / Nbre Impaire : %s) / Retrouver l'implementation de l'interview pour plus",
                nbreChiffrePaire,
                nbreChiffreImpair
        );
    }

    @Override
    public String name() {
        return "item4";
    }
}
