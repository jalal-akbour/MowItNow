package com.jakbour.mowitnow;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.jakbour.mowitnow.model.Command;
import com.jakbour.mowitnow.model.Direction;
import com.jakbour.mowitnow.model.Mower;
import com.jakbour.mowitnow.model.Position;

class ExempleTest {

    Position limit = new Position(5,5);

    @Test
    void testcase1() {
        // Given
        Position pos = new Position(1, 2);
        List<Command> cmds = List.of(Command.LEFT, Command.AVANCE, Command.LEFT, Command.AVANCE, Command.LEFT,
                Command.AVANCE, Command.LEFT, Command.AVANCE, Command.AVANCE);
        Mower mower = new Mower(pos, Direction.NORTH, cmds);

        // When
        mower.runCommands(limit);

        // Then
        assertEquals(1, mower.getPosition().getX());
        assertEquals(3, mower.getPosition().getY());
        assertEquals(Direction.NORTH, mower.getDirection());
    }

    @Test
    void testcase2() {
        // Given
        Position pos = new Position(3, 3);
        List<Command> cmds = List.of(Command.AVANCE, Command.AVANCE, Command.RIGHT, Command.AVANCE, Command.AVANCE,
                Command.RIGHT, Command.AVANCE, Command.RIGHT, Command.RIGHT, Command.AVANCE);
        Mower mower = new Mower(pos, Direction.EAST, cmds);

        // When
        mower.runCommands(limit);

        // Then
        assertEquals(5, mower.getPosition().getX());
        assertEquals(1, mower.getPosition().getY());
        assertEquals(Direction.EAST, mower.getDirection());
    }
}
