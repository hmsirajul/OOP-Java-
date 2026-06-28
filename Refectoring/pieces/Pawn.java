package com.directi.training.codesmells.smelly.pieces;

import com.directi.training.codesmells.smelly.Color;
import com.directi.training.codesmells.smelly.Position;

public class Pawn extends Piece {

    public Pawn(Color color) {
        super(color);
    }

    @Override
    public boolean isValidMove(Position from, Position to) {

        int rowDiff = to.getRow() - from.getRow();
        int colDiff = Math.abs(to.getColumn() - from.getColumn());

        if (getColor() == Color.WHITE) {
            return rowDiff == -1 && colDiff <= 1;
        } else {
            return rowDiff == 1 && colDiff <= 1;
        }
    }

    @Override
    public String toString() {
        return "p";
    }
}