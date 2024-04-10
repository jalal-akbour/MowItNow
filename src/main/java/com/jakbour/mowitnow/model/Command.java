package com.jakbour.mowitnow.model;

public enum Command {

    RIGHT("D"),
    LEFT("G"),
    AVANCE("A");

    public final String value;

    public String getValue() {
        return value;
    }

    Command(String value) {
        this.value = value;
    }

    public static Command getById(String value) {
        return switch (value) {
            case "D" -> RIGHT;
            case "G" -> LEFT;
            case "A" -> AVANCE;
            default -> null;
        };
    }
}
