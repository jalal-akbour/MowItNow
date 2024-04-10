package com.jakbour.mowitnow;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.jakbour.mowitnow.model.Command;
import com.jakbour.mowitnow.model.Direction;
import com.jakbour.mowitnow.model.Mower;
import com.jakbour.mowitnow.model.Position;

class MultiCommandTest {

    Position limit = new Position(5, 5);

    @Test
    void testRunCmd_TurnRight4TimesCmd_ShouldHaveSameDirectionAndPosition() {
        // Given
        Position pos = new Position(1, 1);
        List<Command> cmds = List.of(Command.RIGHT, Command.RIGHT, Command.RIGHT, Command.RIGHT);
        Mower mower = new Mower(pos, Direction.NORTH, cmds);

        // When
        mower.runCommands(limit);

        // Then
        assertEquals(1, mower.getPosition().getX());
        assertEquals(1, mower.getPosition().getY());
        assertEquals(Direction.NORTH, mower.getDirection());
    }

    @Test
    void testRunCmd_TurnLeft4TimesCmd_ShouldHaveSameDirectionAndPosition() {
        // Given
        Position pos = new Position(1, 1);
        List<Command> cmds = List.of(Command.LEFT, Command.LEFT, Command.LEFT, Command.LEFT);
        Mower mower = new Mower(pos, Direction.NORTH, cmds);

        // When
        mower.runCommands(limit);

        // Then
        assertEquals(1, mower.getPosition().getX());
        assertEquals(1, mower.getPosition().getY());
        assertEquals(Direction.NORTH, mower.getDirection());
    }

    @Test
    void testRunCmd_TurnLeftAndRightCmd_ShouldHaveSameDirectionAndPosition() {
        // Given
        Position pos = new Position(1, 1);
        List<Command> cmds = List.of(Command.LEFT, Command.RIGHT);
        Mower mower = new Mower(pos, Direction.NORTH, cmds);

        // When
        mower.runCommands(limit);

        // Then
        assertEquals(1, mower.getPosition().getX());
        assertEquals(1, mower.getPosition().getY());
        assertEquals(Direction.NORTH, mower.getDirection());
    }

    @Test
    void testRunCmd_TurnRightAndLeftCmd_ShouldHaveSameDirectionAndPosition() {
        // Given
        Position pos = new Position(1, 1);
        List<Command> cmds = List.of(Command.RIGHT, Command.LEFT);
        Mower mower = new Mower(pos, Direction.NORTH, cmds);

        // When
        mower.runCommands(limit);

        // Then
        assertEquals(1, mower.getPosition().getX());
        assertEquals(1, mower.getPosition().getY());
        assertEquals(Direction.NORTH, mower.getDirection());
    }

    @Test
    void testRunCmd_TurnRightAndStepForwardCmd_ShouldTurnAndStepForward() {
        // Given
        Position pos = new Position(1, 1);
        List<Command> cmds = List.of(Command.RIGHT, Command.AVANCE);
        Mower mower = new Mower(pos, Direction.NORTH, cmds);

        // When
        mower.runCommands(limit);

        // Then
        assertEquals(2, mower.getPosition().getX());
        assertEquals(1, mower.getPosition().getY());
        assertEquals(Direction.EAST, mower.getDirection());
    }

    @Test
    void testRunCmd_TurnLeftAndStepForwardCmd_ShouldTurnAndStepForward() {
        // Given
        Position pos = new Position(1, 1);
        List<Command> cmds = List.of(Command.LEFT, Command.AVANCE);
        Mower mower = new Mower(pos, Direction.NORTH, cmds);

        // When
        mower.runCommands(limit);

        // Then
        assertEquals(0, mower.getPosition().getX());
        assertEquals(1, mower.getPosition().getY());
        assertEquals(Direction.WEST, mower.getDirection());
    }

    @Test
    void testRunCmd_StepForwardAndTurnRightCmd_ShouldStepForwardAndTurn() {
        // Given
        Position pos = new Position(1, 1);
        List<Command> cmds = List.of(Command.AVANCE, Command.RIGHT);
        Mower mower = new Mower(pos, Direction.NORTH, cmds);

        // When
        mower.runCommands(limit);

        // Then
        assertEquals(1, mower.getPosition().getX());
        assertEquals(2, mower.getPosition().getY());
        assertEquals(Direction.EAST, mower.getDirection());
    }

    @Test
    void testRunCmd_StepForwardAndTurnLeftCmd_ShouldStepForwardAndTurn() {
        // Given
        Position pos = new Position(1, 1);
        List<Command> cmds = List.of(Command.AVANCE, Command.LEFT);
        Mower mower = new Mower(pos, Direction.NORTH, cmds);

        // When
        mower.runCommands(limit);

        // Then
        assertEquals(1, mower.getPosition().getX());
        assertEquals(2, mower.getPosition().getY());
        assertEquals(Direction.WEST, mower.getDirection());
    }
}
