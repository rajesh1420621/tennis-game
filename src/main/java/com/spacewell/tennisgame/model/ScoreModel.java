package com.spacewell.tennisgame.model;

import org.springframework.context.annotation.Configuration;

import java.io.Serializable;

@Configuration
public class ScoreModel implements Serializable {

    private String playerWon;

    private int point;
    private String scoreFirstPlayer="0";
    private String scoreSecondPlayer="0";

    private String winner = "";

    public ScoreModel() {
    }

    public ScoreModel(String playerWon, int point, String scoreFirstPlayer, String scoreSecondPlayer, String winner) {
        this.playerWon = playerWon;
        this.point = point;
        this.scoreFirstPlayer = scoreFirstPlayer;
        this.scoreSecondPlayer = scoreSecondPlayer;
        this.winner = winner;
    }

    public String getPlayerWon() {
        return playerWon;
    }

    public void setPlayerWon(String playerWon) {
        this.playerWon = playerWon;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public String getScoreFirstPlayer() {
        return scoreFirstPlayer;
    }

    public void setScoreFirstPlayer(String scoreFirstPlayer) {
        this.scoreFirstPlayer = scoreFirstPlayer;
    }

    public String getScoreSecondPlayer() {
        return scoreSecondPlayer;
    }

    public void setScoreSecondPlayer(String scoreSecondPlayer) {
        this.scoreSecondPlayer = scoreSecondPlayer;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    @Override
    public String toString() {
        return "ScoreModel{" +
                "playerWon='" + playerWon + '\'' +
                ", point=" + point +
                ", scoreFirstPlayer='" + scoreFirstPlayer + '\'' +
                ", scoreSecondPlayer='" + scoreSecondPlayer + '\'' +
                ", winner='" + winner + '\'' +
                '}';
    }
}
