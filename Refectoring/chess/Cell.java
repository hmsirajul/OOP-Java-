package com.directi.training.codesmells.smelly.chess;

import com.directi.training.codesmells.smelly.Color;
import com.directi.training.codesmells.smelly.pieces.Piece;

public class Cell {

    private Piece piece;
    private final Color color;

    public Cell(Color color) {
        this.color = color;
    }

    public void removePiece() {
        piece = null;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public boolean isEmpty() {
        return piece == null;
    }

    @Override
    public String toString() {
        return piece == null
            ? "." + color + "."
            : piece.getColor().toString() + color + piece.toString();
    }
}