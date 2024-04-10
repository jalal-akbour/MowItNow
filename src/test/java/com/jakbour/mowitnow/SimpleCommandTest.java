package com.jakbour.mowitnow;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.jakbour.mowitnow.model.Command;
import com.jakbour.mowitnow.model.Direction;
import com.jakbour.mowitnow.model.Mower;
import com.jakbour.mowitnow.model.Position;

class SimpleCommandTest {

    Position limit = new Position(5 , 5);

    @Test
    void testRunCmd_TurnRightCmd_ShouldReturnMowerNorthOriented() {
        // Given
        Position pos = new Position(1, 1);
        List<Command> cmds = List.of(Command.RIGHT);
        Mower mower = new Mower(pos, Direction.WEST, cmds);

        // When
        mower.runCommands(limit);

        // Then
        assertEquals(1, mower.getPosition().getX());
        assertEquals(1, mower.getPosition().getY());
        assertEquals(Direction.NORTH, mower.getDirection());
    }

    @Test
    void testRunCmd_TurnRightCmd_ShouldReturnMowerEastOriented() {
        // Given
        Position pos = new Position(1, 1);
        List<Command> cmds = List.of(Command.RIGHT);
        Mower mower = new Mower(pos, Direction.NORTH, cmds);

        // When
        mower.runCommands(limit);

        // Then
        assertEquals(1, mower.getPosition().getX());
        assertEquals(1, mower.getPosition().getY());
        assertEquals(Direction.EAST, mower.getDirection());
    }

    @Test
    void testRunCmd_TurnRightCmd_ShouldReturnMowerSouthOriented() {
        // Given
        Position pos = new Position(1, 1);
        List<Command> cmds = List.of(Command.RIGHT);
        Mower mower = new Mower(pos, Direction.EAST, cmds);

        // When
        mower.runCommands(limit);

        // Then
        assertEquals(1, mower.getPosition().getX());
        assertEquals(1, mower.getPosition().getY());
        assertEquals(Direction.SOUTH, mower.getDirection());
    }

    @Test
    void testRunCmd_TurnRightCmd_ShouldReturnMowerWestOriented() {
        // Given
        Position pos = new Position(1, 1);
        List<Command> cmds = List.of(Command.RIGHT);
        Mower mower = new Mower(pos, Direction.SOUTH, cmds);

        // When
        mower.runCommands(limit);

        // Then
        assertEquals(1, mower.getPosition().getX());
        assertEquals(1, mower.getPosition().getY());
        assertEquals(Direction.WEST, mower.getDirection());
    }


    @Test
    void testRunCmd_TurnLeftCmd_ShouldReturnMowerSouthOriented() {
        // Given
        Position pos = new Position(1, 1);
        List<Command> cmds = List.of(Command.LEFT);
        Mower mower = new Mower(pos, Direction.WEST, cmds);

        // When
        mower.runCommands(limit);

        // Then
        assertEquals(1, mower.getPosition().getX());
        assertEquals(1, mower.getPosition().getY());
        assertEquals(Direction.SOUTH, mower.getDirection());
    }

    @Test
    void testRunCmd_TurnLeftCmd_ShouldReturnMowerWestOriented() {
        // Given
        Position pos = new Position(1, 1);
        List<Command> cmds = List.of(Command.LEFT);
        Mower mower = new Mower(pos, Direction.NORTH, cmds);

        // When
        mower.runCommands(limit);

        // Then
        assertEquals(1, mower.getPosition().getX());
        assertEquals(1, mower.getPosition().getY());
        assertEquals(Direction.WEST, mower.getDirection());
    }

    @Test
    void testRunCmd_TurnLeftCmd_ShouldReturnMowerNorthOriented() {
        // Given
        Position pos = new Position(1, 1);
        List<Command> cmds = List.of(Command.LEFT);
        Mower mower = new Mower(pos, Direction.EAST, cmds);

        // When
        mower.runCommands(limit);

        // Then
        assertEquals(1, mower.getPosition().getX());
        assertEquals(1, mower.getPosition().getY());
        assertEquals(Direction.NORTH, mower.getDirection());
    }

    @Test
    void testRunCmd_TurnLeftCmd_ShouldReturnMowerEastOriented() {
        // Given
        Position pos = new Position(1, 1);
        List<Command> cmds = List.of(Command.LEFT);
        Mower mower = new Mower(pos, Direction.SOUTH, cmds);

        // When
        mower.runCommands(limit);

        // Then
        assertEquals(1, mower.getPosition().getX());
        assertEquals(1, mower.getPosition().getY());
        assertEquals(Direction.EAST, mower.getDirection());
    }

    @Test
    void testRunCmd_AvanceNorthCmd_ShouldReturnMowerPassedToUpPosition() {
        // Given
        Position pos = new Position(1, 1);
        List<Command> cmds = List.of(Command.AVANCE);
        Mower mower = new Mower(pos, Direction.NORTH, cmds);

        // When
        mower.runCommands(limit);

        // Then
        assertEquals(1, mower.getPosition().getX());
        assertEquals(2, mower.getPosition().getY());
        assertEquals(Direction.NORTH, mower.getDirection());
    }

    @Test
    void testRunCmd_AvanceEastCmd_ShouldReturnMowerPassedToRightPosition() {
        // Given
        Position pos = new Position(1, 1);
        List<Command> cmds = List.of(Command.AVANCE);
        Mower mower = new Mower(pos, Direction.EAST, cmds);

        // When
        mower.runCommands(limit);

        // Then
        assertEquals(2, mower.getPosition().getX());
        assertEquals(1, mower.getPosition().getY());
        assertEquals(Direction.EAST, mower.getDirection());
    }

    @Test
    void testRunCmd_AvanceSouthCmd_ShouldReturnMowerPassedToBottomPosition() {
        // Given
        Position pos = new Position(1, 1);
        List<Command> cmds = List.of(Command.AVANCE);
        Mower mower = new Mower(pos, Direction.SOUTH, cmds);

        // When
        mower.runCommands(limit);

        // Then
        assertEquals(1, mower.getPosition().getX());
        assertEquals(0, mower.getPosition().getY());
        assertEquals(Direction.SOUTH, mower.getDirection());
    }

    @Test
    void testRunCmd_AvanceWestCmd_ShouldReturnMowerPassedToLeftPosition() {
        // Given
        Position pos = new Position(1, 1);
        List<Command> cmds = List.of(Command.AVANCE);
        Mower mower = new Mower(pos, Direction.WEST, cmds);

        // When
        mower.runCommands(limit);

        // Then
        assertEquals(0, mower.getPosition().getX());
        assertEquals(1, mower.getPosition().getY());
        assertEquals(Direction.WEST, mower.getDirection());
    }

}
