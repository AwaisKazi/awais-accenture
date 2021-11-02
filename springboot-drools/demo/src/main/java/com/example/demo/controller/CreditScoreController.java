package com.example.demo.controller;

import java.util.ArrayList;
import com.example.demo.model.CreditScore;

import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreditScoreController {

    @Autowired
    private KieSession session;
    
    @PostMapping("/credit-score")
    public ArrayList<CreditScore> getCreditScoreInfo(@RequestBody ArrayList<CreditScore> creditScores) {
        for(CreditScore creditScore : creditScores){
            session.insert(creditScore);
        }
        session.fireAllRules();
        return creditScores;

    }

}
