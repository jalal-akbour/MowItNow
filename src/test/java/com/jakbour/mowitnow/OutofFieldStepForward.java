package com.jakbour.mowitnow;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.jakbour.mowitnow.model.Command;
import com.jakbour.mowitnow.model.Direction;
import com.jakbour.mowitnow.model.Mower;
import com.jakbour.mowitnow.model.Position;

class OutOfFieldStepForward {

    Position limit = new Position(5, 5);

    @Test
    void testRunCmd_AvanceCmdWestLimit_ShouldNotMove() {
        // Given
        Position pos = new Position(0, 3);
        List<Command> cmds = List.of(Command.AVANCE);
        Mower mower = new Mower(pos, Direction.WEST, cmds);

        // When
        mower.runCommands(limit);

        // Then
        assertEquals(0, mower.getPosition().getX());
        assertEquals(3, mower.getPosition().getY());
        assertEquals(Direction.WEST, mower.getDirection());
    }

    @Test
    void testRunCmd_AvanceCmdNorthLimit_ShouldNotMove() {
        // Given
        Position pos = new Position(3, 5);
        List<Command> cmds = List.of(Command.AVANCE);
        Mower mower = new Mower(pos, Direction.NORTH, cmds);

        // When
        mower.runCommands(limit);

        // Then
        assertEquals(3, mower.getPosition().getX());
        assertEquals(5, mower.getPosition().getY());
        assertEquals(Direction.NORTH, mower.getDirection());
    }

    @Test
    void testRunCmd_AvanceCmdEastLimit_ShouldNotMove() {
        // Given
        Position pos = new Position(5, 3);
        List<Command> cmds = List.of(Command.AVANCE);
        Mower mower = new Mower(pos, Direction.EAST, cmds);

        // When
        mower.runCommands(limit);

        // Then
        assertEquals(5, mower.getPosition().getX());
        assertEquals(3, mower.getPosition().getY());
        assertEquals(Direction.EAST, mower.getDirection());
    }

    @Test
    void testRunCmd_AvanceCmdSouthLimit_ShouldNotMove() {
        // Given
        Position pos = new Position(3, 0);
        List<Command> cmds = List.of(Command.AVANCE);
        Mower mower = new Mower(pos, Direction.SOUTH, cmds);

        // When
        mower.runCommands(limit);

        // Then
        assertEquals(3, mower.getPosition().getX());
        assertEquals(0, mower.getPosition().getY());
        assertEquals(Direction.SOUTH, mower.getDirection());
    }
}
