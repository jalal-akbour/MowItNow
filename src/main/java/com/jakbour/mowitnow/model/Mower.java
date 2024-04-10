package com.jakbour.mowitnow.model;

import java.util.List;

public class Mower {
    private Position position;
    private Direction direction;

    private List<Command> cmds;

    public Mower(Position position, Direction direction, List<Command> cmds) {
        this.position = position;
        this.direction = direction;
        this.cmds = cmds;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public Mower(Position position, Direction direction) {
        this.direction = direction;
        this.position = position;
    }

    @Override
    public String toString() {
        return position + " " + direction;
    }

    public Position getPosition() {
        return position;
    }

    public void stepForward() {
        switch (this.direction) {
            case WEST -> position.moveLeft();
            case NORTH -> position.moveUp();
            case EAST -> position.moveRight();
            case SOUTH -> position.moveDown();
        }
    }

    public boolean isMovePossible(Position limit) {
        return switch (this.direction) {
            case WEST -> this.position.getX() > 0;
            case NORTH -> this.position.getY() < limit.getY();
            case EAST -> this.position.getX() < limit.getX();
            case SOUTH -> this.position.getY() > 0;
            default -> false;
        };
    }

    public void runCommands(Position limit) {
        cmds.forEach(command -> {
            switch (command) {
                case RIGHT -> direction = direction.turnRight();
                case LEFT -> direction = direction.turnLeft();
                case AVANCE -> {
                    if (isMovePossible(limit))
                        stepForward();
                }
            }
        });
    }
}
