package com.directi.training.codesmells.smelly.chess;

import com.directi.training.codesmells.smelly.Color;
import com.directi.training.codesmells.smelly.Direction;
import com.directi.training.codesmells.smelly.Position;
import com.directi.training.codesmells.smelly.pieces.*;

public class ChessBoard {

    private final static int SIZE = 8;

    private final Cell[][] board;
    private boolean kingDead = false;

    private Player player1;
    private Player player2;

    public ChessBoard(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;

        board = new Cell[SIZE][SIZE];
        initBoard();
    }

    private void initBoard() {
        for (int r = 0; r < SIZE; r++) {
            for (int c = 0; c < SIZE; c++) {
                Color color = ((r + c) % 2 == 0) ? Color.WHITE : Color.BLACK;
                board[r][c] = new Cell(color);
            }
        }
    }

    public Cell getCell(Position p) {
        if (isOut(p)) return null;
        return board[p.getRow()][p.getColumn()];
    }

    public boolean isEmpty(Position p) {
        return getCell(p) == null || getCell(p).isEmpty();
    }

    private boolean isOut(Position p) {
        return p.getRow() < 0 || p.getRow() >= SIZE
               || p.getColumn() < 0 || p.getColumn() >= SIZE;
    }

    public Piece getPiece(Position p) {
        if (isOut(p) || isEmpty(p)) return null;
        return getCell(p).getPiece();
    }

    // ================= MOVE VALIDATION =================

    public boolean isValidMove(Move move) {

        Position from = move.getFrom();
        Position to = move.getTo();

        if (isOut(from) || isOut(to)) return false;
        if (isEmpty(from)) return false;
        if (!isEmpty(to) && getPiece(from).getColor() == getPiece(to).getColor()) return false;

        Piece piece = getPiece(from);

        return piece.isValidMove(from, to)
               && isPathClear(from, to, piece);
    }

    private boolean isPathClear(Position from, Position to, Piece piece) {

        if (piece instanceof Knight) return true;

        int rowDir = Integer.compare(to.getRow(), from.getRow());
        int colDir = Integer.compare(to.getColumn(), from.getColumn());

        Position current = new Position(from.getRow() + rowDir, from.getColumn() + colDir);

        while (!current.equals(to)) {
            if (!isEmpty(current)) return false;
            current = new Position(current.getRow() + rowDir, current.getColumn() + colDir);
        }

        return true;
    }

    // ================= MOVE =================

    public void movePiece(Move move) {

        Position from = move.getFrom();
        Position to = move.getTo();

        Piece piece = getPiece(from);

        if (!isEmpty(to)) {
            board[to.getRow()][to.getColumn()].removePiece();
        }

        board[to.getRow()][to.getColumn()].setPiece(piece);
        board[from.getRow()][from.getColumn()].removePiece();

        if (piece instanceof King && !isEmpty(to)) {
            kingDead = true;
        }
    }

    public boolean isKingDead() {
        return kingDead;
    }

    // ================= PRINT =================

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("   ");

        for (int i = 0; i < SIZE; i++) {
            sb.append(" ").append(i + 1).append("  ");
        }

        sb.append("\n");

        for (int r = 0; r < SIZE; r++) {
            sb.append(r + 1).append(" ");

            for (int c = 0; c < SIZE; c++) {
                sb.append(board[r][c]).append(" ");
            }

            sb.append("\n");
        }

        return sb.toString();
    }
}