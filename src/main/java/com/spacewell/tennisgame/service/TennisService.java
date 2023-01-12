package com.spacewell.tennisgame.service;

import com.spacewell.tennisgame.model.ScoreModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TennisService {

    @Autowired
    private ScoreModel scoreModelToBeStored;

    public String updateScore(ScoreModel scoreModel){
        if (scoreModelToBeStored.getPoint() <= 6 &&
                (scoreModelToBeStored.getScoreFirstPlayer().equalsIgnoreCase("0") && scoreModelToBeStored.getScoreSecondPlayer().equalsIgnoreCase("0")) &&
                scoreModel.getPlayerWon().equalsIgnoreCase("Server")){
            scoreModelToBeStored.setScoreFirstPlayer(String.valueOf(15));
        } else if (scoreModelToBeStored.getPoint() <= 6 &&
                (scoreModelToBeStored.getScoreFirstPlayer().equalsIgnoreCase("0") && scoreModelToBeStored.getScoreSecondPlayer().equalsIgnoreCase("0")) &&
                scoreModel.getPlayerWon().equalsIgnoreCase("Receiver")) {
            scoreModelToBeStored.setScoreSecondPlayer(String.valueOf(15));
        } else if (scoreModelToBeStored.getPoint() <= 6 &&
                (scoreModelToBeStored.getScoreFirstPlayer().equalsIgnoreCase("15") && scoreModelToBeStored.getScoreSecondPlayer().equalsIgnoreCase("15")) &&
                scoreModel.getPlayerWon().equalsIgnoreCase("Receiver")) {
            scoreModelToBeStored.setScoreSecondPlayer(String.valueOf(30));
        } else if (scoreModelToBeStored.getPoint() <= 6 &&
                (scoreModelToBeStored.getScoreFirstPlayer().equalsIgnoreCase("30") && scoreModelToBeStored.getScoreSecondPlayer().equalsIgnoreCase("30")) &&
                scoreModel.getPlayerWon().equalsIgnoreCase("Server")) {
            scoreModelToBeStored.setScoreFirstPlayer(String.valueOf(40));
        } else if (scoreModelToBeStored.getPoint() <= 6 &&
                (scoreModelToBeStored.getScoreFirstPlayer().equalsIgnoreCase("40") && scoreModelToBeStored.getScoreSecondPlayer().equalsIgnoreCase("40")) &&
                scoreModel.getPlayerWon().equalsIgnoreCase("Receiver")) {
            scoreModelToBeStored.setScoreSecondPlayer("A");
        } else if (scoreModelToBeStored.getPoint() <= 6 &&
                (scoreModelToBeStored.getScoreFirstPlayer().equalsIgnoreCase("A") && scoreModelToBeStored.getScoreSecondPlayer().equalsIgnoreCase("40")) &&
                scoreModel.getPlayerWon().equalsIgnoreCase("Receiver")) {
            scoreModelToBeStored.setScoreFirstPlayer("40");
        } else if ((scoreModelToBeStored.getScoreFirstPlayer().equalsIgnoreCase("40") && scoreModelToBeStored.getScoreSecondPlayer().equalsIgnoreCase("30")) &&
                scoreModel.getPlayerWon().equalsIgnoreCase("Server")) {
            scoreModelToBeStored.setWinner("Server");
        } else if ((scoreModelToBeStored.getScoreFirstPlayer().equalsIgnoreCase("40") && scoreModelToBeStored.getScoreSecondPlayer().equalsIgnoreCase("A")) &&
                scoreModel.getPlayerWon().equalsIgnoreCase("Receiver")) {
            scoreModelToBeStored.setWinner("Receiver");
        }
        scoreModelToBeStored.setPoint(scoreModelToBeStored.getPoint() + 1);
        return "Score Updated";
    }
}
