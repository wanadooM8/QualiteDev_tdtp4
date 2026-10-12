package com.ethanbernier.tennisGame;

import java.util.ArrayList;
import java.util.List;

public class TennisGame2 implements TennisGame
{
    public int p1point = 0;
    public int p2point = 0;
    
    public String p1res = "";
    public String p2res = "";

    private static final String[] score = {"Fifteen", "Thirty", "Forty"};



    public TennisGame2(String player1Name, String player2Name) {
    }

    public String getScore(){
        //Cas 1 égalité
        if (p1point == p2point) {
            if (p1point >= 3) {
                return "deuce";
            }
            return score[p1point] + "-All";
        }
        // Cas 2 : Avantage ou Victoire (au moins 4 points marqués)
        if (p1point >= 4 || p2point >= 4) {
            int diff = p1point - p2point;
            if (diff == 1) {
                return "Advantage player1";
            }
            if (diff == -1) {
                return "Advantage player2";
            }
            if (diff >= 2) {
                return "Win for player1";
            }
            return "Win for player2";
        }

        // Cas 3 : Jeu normal en cours
        return score[p1point] + "-" + score[p2point];
    }


    
    public void setP1Score(int number){
        
        for (int i = 0; i < number; i++)
        {
            p1Score();
        }
            
    }
    
    public void setP2Score(int number){
        
        for (int i = 0; i < number; i++)
        {
            p2Score();
        }
            
    }
    
    public void p1Score(){
        p1point++;
    }
    
    public void p2Score(){
        p2point++;
    }

    public void wonPoint(String player) {
        if (player.equals("player1") )
            p1Score();
        else
            p2Score();
    }
}