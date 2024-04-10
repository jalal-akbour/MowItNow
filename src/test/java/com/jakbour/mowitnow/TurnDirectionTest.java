package com.jakbour.mowitnow;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.jakbour.mowitnow.model.Direction;

class TurnDirectionTest {

    /**
     * Tests the behavior of turning left and right from the west direction.
     * It ensures that turning left from the west direction results in facing south,
     * and turning right results in facing north.
     */
    @Test
    void testTurnWestDirection_TurnLeftAndTurnRight_ShouldReturnSideOrientation() {
        // Given
        Direction west = Direction.WEST;

        // When
        Direction left = west.turnLeft();
        Direction right = west.turnRight();

        // Then
        assertEquals(Direction.SOUTH, left);
        assertEquals(Direction.NORTH, right);
    }

    @Test
    void testTurnNorthDirection_TurnLeftAndTurnRight_ShouldReturnSideOrientation() {
        // Given
        Direction north = Direction.NORTH;

        // When
        Direction left = north.turnLeft();
        Direction right = north.turnRight();

        // Then
        assertEquals(Direction.WEST, left);
        assertEquals(Direction.EAST, right);
    }

    @Test
    void testTurnEastDirection_TurnLeftAndTurnRight_ShouldReturnSideOrientation() {
        // Given
        Direction east = Direction.EAST;

        // When
        Direction left = east.turnLeft();
        Direction right = east.turnRight();

        // Then
        assertEquals(Direction.NORTH, left);
        assertEquals(Direction.SOUTH, right);
    }

    @Test
    void testTurnSouthDirection_TurnLeftAndTurnRight_ShouldReturnSideOrientation() {
        // Given
        Direction south = Direction.SOUTH;

        // When
        Direction left = south.turnLeft();
        Direction right = south.turnRight();

        // Then
        assertEquals(Direction.EAST, left);
        assertEquals(Direction.WEST, right);
    }
}
