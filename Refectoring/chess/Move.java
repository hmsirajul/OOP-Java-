package com.directi.training.codesmells.smelly.chess;

import com.directi.training.codesmells.smelly.Position;

public class Move {

    private final Position from;
    private final Position to;

    public Move(Position from, Position to) {
        this.from = from;
        this.to = to;
    }

    public Position getFrom() {
        return from;
    }

    public Position getTo() {
        return to;
    }

    public boolean isSamePosition() {
        return from.equals(to);
    }

    @Override
    public String toString() {
        return from + " -> " + to;
    }
}