package com.directi.training.codesmells.smelly;

public enum Color {
    WHITE("W"),
    BLACK("B");

    private final String colorCode;

    Color(String colorCode) {
        this.colorCode = colorCode;
    }

    @Override
    public String toString() {
        return colorCode;
    }
}