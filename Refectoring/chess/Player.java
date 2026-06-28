package com.directi.training.codesmells.smelly.chess;

import com.directi.training.codesmells.smelly.Color;

public class Player {

    private final String name;
    private int gamesWon;
    private Color color;

    public Player(String name) {
        this.name = name;
        this.gamesWon = 0;
    }

    public String getName() {
        return name;
    }

    public int getGamesWon() {
        return gamesWon;
    }

    public void incrementGamesWon() {
        gamesWon++;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "NAME: " + name + "; GAMES WON: " + gamesWon;
    }
}