package com.spacewell.tennisgame.controller;

import com.spacewell.tennisgame.model.ScoreModel;
import com.spacewell.tennisgame.service.TennisService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class TennisControllerTest {

    @Autowired
    TennisController tennisController;

    @Autowired
    TennisService tennisService;

    @Test
    public void updateScoreTest(){
        ScoreModel scoreModel1 = new ScoreModel();
        scoreModel1.setPlayerWon("Server");
        assertEquals("Score Updated", tennisController.updateScore(scoreModel1));
    }

    @Test
    public void getScoreModelTest(){
//        ScoreModel scoreModel1 = new ScoreModel();
//        scoreModel1.setPlayerWon("Server");
        assertNotNull(tennisController.getScoreModel());
    }
}
