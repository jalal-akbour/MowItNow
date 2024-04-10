package com.jakbour.mowitnow.model;

public enum Direction {
    WEST("W"),
    NORTH("N"),
    EAST("E"),
    SOUTH("S");

    public final String value;

    public String getValue() {
        return value;
    }

    Direction(String value) {
        this.value = value;
    }

    public Direction turnLeft() {
        return switch (this) {
            case WEST -> SOUTH;
            case NORTH -> WEST;
            case EAST -> NORTH;
            case SOUTH -> EAST;
        };
    }

    public Direction turnRight() {
        return switch (this) {
            case WEST -> NORTH;
            case NORTH -> EAST;
            case EAST -> SOUTH;
            case SOUTH -> WEST;
        };
    }

    public static Direction getById(String value) {
        return switch (value) {
            case "W" -> WEST;
            case "N" -> NORTH;
            case "E" -> EAST;
            case "S" -> SOUTH;
            default -> null;
        };
    }
}