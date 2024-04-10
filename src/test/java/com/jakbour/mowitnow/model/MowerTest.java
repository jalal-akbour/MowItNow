package com.jakbour.mowitnow.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

class MowerTest {
    @Test
    void testIsMovePossible_AvanceCmdNorth_ShouldReturnFalse() {

        // Given
        Position pos = new Position(3, 5);
        Position limit = new Position(5, 5);
        List<Command> cmds = List.of(Command.AVANCE);
        Mower mower = new Mower(pos, Direction.NORTH, cmds);

        // When
        boolean isMovePossible = mower.isMovePossible(limit);

        // Then
        assertEquals(false, isMovePossible);
    }

    @Test
    void testIsMovePossible_AvanceCmdNorth_ShouldReturnTrue() {

        // Given
        Position pos = new Position(3, 4);
        Position limit = new Position(5, 5);
        List<Command> cmds = List.of(Command.AVANCE);
        Mower mower = new Mower(pos, Direction.NORTH, cmds);

        // When
        boolean isMovePossible = mower.isMovePossible(limit);

        // Then
        assertEquals(true, isMovePossible);

    }

    @Test
    void testIsMovePossible_AvanceCmdEast_ShouldReturnFalse() {

        // Given
        Position pos = new Position(5, 3);
        Position limit = new Position(5, 5);
        List<Command> cmds = List.of(Command.AVANCE);
        Mower mower = new Mower(pos, Direction.EAST, cmds);

        // When
        boolean isMovePossible = mower.isMovePossible(limit);

        // Then
        assertEquals(false, isMovePossible);
    }

    @Test
    void testIsMovePossible_AvanceCmdEast_ShouldReturnTrue() {

        // Given
        Position pos = new Position(4, 3);
        Position limit = new Position(5, 5);
        List<Command> cmds = List.of(Command.AVANCE);
        Mower mower = new Mower(pos, Direction.EAST, cmds);

        // When
        boolean isMovePossible = mower.isMovePossible(limit);

        // Then
        assertEquals(true, isMovePossible);

    }

    @Test
    void testIsMovePossible_AvanceCmdSouth_ShouldReturnFalse() {

        // Given
        Position pos = new Position(3, 0);
        Position limit = new Position(5, 5);
        List<Command> cmds = List.of(Command.AVANCE);
        Mower mower = new Mower(pos, Direction.SOUTH, cmds);

        // When
        boolean isMovePossible = mower.isMovePossible(limit);

        // Then
        assertEquals(false, isMovePossible);
    }

    @Test
    void testIsMovePossible_AvanceCmdSouth_ShouldReturnTrue() {

        // Given
        Position pos = new Position(3, 1);
        Position limit = new Position(5, 5);
        List<Command> cmds = List.of(Command.AVANCE);
        Mower mower = new Mower(pos, Direction.SOUTH, cmds);

        // When
        boolean isMovePossible = mower.isMovePossible(limit);

        // Then
        assertEquals(true, isMovePossible);

    }

    @Test
    void testIsMovePossible_AvanceCmdWest_ShouldReturnFalse() {

        // Given
        Position pos = new Position(0, 3);
        Position limit = new Position(5, 5);
        List<Command> cmds = List.of(Command.AVANCE);
        Mower mower = new Mower(pos, Direction.WEST, cmds);

        // When
        boolean isMovePossible = mower.isMovePossible(limit);

        // Then
        assertEquals(false, isMovePossible);
    }

    @Test
    void testIsMovePossible_AvanceCmdWest_ShouldReturnTrue() {

        // Given
        Position pos = new Position(1, 3);
        Position limit = new Position(5, 5);
        List<Command> cmds = List.of(Command.AVANCE);
        Mower mower = new Mower(pos, Direction.WEST, cmds);

        // When
        boolean isMovePossible = mower.isMovePossible(limit);

        // Then
        assertEquals(true, isMovePossible);

    }
}
