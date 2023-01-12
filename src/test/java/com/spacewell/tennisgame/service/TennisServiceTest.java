package com.spacewell.tennisgame.service;

import com.spacewell.tennisgame.model.ScoreModel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TennisServiceTest {

    @Autowired
    private TennisService tennisService;

    @Autowired
    private ScoreModel scoreModel;

    @Test
    public void updateScoreWhenServerScoreZeroAndReceiverScoreZeroAndServerWins(){
        ScoreModel scoreModel1 = new ScoreModel();
        scoreModel1.setPlayerWon("Server");

        scoreModel.setPoint(1);
        scoreModel.setScoreFirstPlayer(String.valueOf(0));
        scoreModel.setScoreSecondPlayer(String.valueOf(0));

        tennisService.updateScore(scoreModel1);
        assertEquals("15", scoreModel.getScoreFirstPlayer());
    }

    @Test
    public void updateScoreWhenServerScoreZeroAndReceiverScoreZeroAndReceiverWins(){
        ScoreModel scoreModel1 = new ScoreModel();
        scoreModel1.setPlayerWon("Receiver");

        scoreModel.setScoreFirstPlayer(String.valueOf(0));
        scoreModel.setScoreSecondPlayer(String.valueOf(0));

        tennisService.updateScore(scoreModel1);
        assertEquals("15", scoreModel.getScoreSecondPlayer());
    }

    @Test
    public void updateScoreWhenServerScore15AndReceiverScore15AndReceiverWins(){
        ScoreModel scoreModel1 = new ScoreModel();
        scoreModel1.setPlayerWon("Receiver");

        scoreModel.setScoreFirstPlayer(String.valueOf(15));
        scoreModel.setScoreSecondPlayer(String.valueOf(15));

        tennisService.updateScore(scoreModel1);
        assertEquals("30", scoreModel.getScoreSecondPlayer());
    }

    @Test
    public void updateScoreWhenServerScore30AndReceiverScore30AndServerWins(){
        ScoreModel scoreModel1 = new ScoreModel();
        scoreModel1.setPlayerWon("Server");

        scoreModel.setScoreFirstPlayer(String.valueOf(30));
        scoreModel.setScoreSecondPlayer(String.valueOf(30));

        tennisService.updateScore(scoreModel1);
        assertEquals("40", scoreModel.getScoreFirstPlayer());
    }

    @Test
    public void updateScoreWhenServerScore40AndReceiverScore40AndReceiverWins(){
        ScoreModel scoreModel1 = new ScoreModel();
        scoreModel1.setPlayerWon("Receiver");

        scoreModel.setScoreFirstPlayer(String.valueOf(40));
        scoreModel.setScoreSecondPlayer(String.valueOf(40));

        tennisService.updateScore(scoreModel1);
        assertEquals("A", scoreModel.getScoreSecondPlayer());
    }

    @Test
    public void updateScoreWhenServerScoreAAndReceiverScore40AndReceiverWins(){
        ScoreModel scoreModel1 = new ScoreModel();
        scoreModel1.setPlayerWon("Receiver");

        scoreModel.setScoreFirstPlayer("A");
        scoreModel.setScoreSecondPlayer(String.valueOf(40));

        tennisService.updateScore(scoreModel1);
        assertEquals("40", scoreModel.getScoreFirstPlayer());
    }

    @Test
    public void updateScoreWhenServerScore40AndReceiverScore30AndServerWins(){
        ScoreModel scoreModel1 = new ScoreModel();
        scoreModel1.setPlayerWon("Server");

        scoreModel.setScoreFirstPlayer("40");
        scoreModel.setScoreSecondPlayer(String.valueOf(30));

        tennisService.updateScore(scoreModel1);
        assertEquals("Server", scoreModel.getWinner());
    }

    @Test
    public void updateScoreWhenServerScore40AndReceiverScoreAAndReceiverWins(){
        ScoreModel scoreModel1 = new ScoreModel();
        scoreModel1.setPlayerWon("Receiver");

        scoreModel.setScoreFirstPlayer("40");
        scoreModel.setScoreSecondPlayer("A");

        tennisService.updateScore(scoreModel1);
        assertEquals("Receiver", scoreModel.getWinner());
    }
}
