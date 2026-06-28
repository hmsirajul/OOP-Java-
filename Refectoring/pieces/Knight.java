package com.directi.training.codesmells.smelly.pieces;

import com.directi.training.codesmells.smelly.Color;
import com.directi.training.codesmells.smelly.Position;

public class Knight extends Piece {

    public Knight(Color color) {
        super(color);
    }

    @Override
    public boolean isValidMove(Position from, Position to) {
        int rowDiff = Math.abs(from.getRow() - to.getRow());
        int colDiff = Math.abs(from.getColumn() - to.getColumn());

        return (rowDiff == 2 && colDiff == 1)
               || (rowDiff == 1 && colDiff == 2);
    }

    @Override
    public String toString() {
        return "k";
    }
}