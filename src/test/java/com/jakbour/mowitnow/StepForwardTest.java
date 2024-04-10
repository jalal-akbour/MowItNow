package com.jakbour.mowitnow;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.jakbour.mowitnow.model.Direction;
import com.jakbour.mowitnow.model.Mower;
import com.jakbour.mowitnow.model.Position;

class StepForwardTest {

   @Test
   void testStepForward_InWestDirection_ShouldReturnLeftPosition() {
      // Given
      Position p = new Position(1, 1);
      Mower mower = new Mower(p, Direction.WEST);
      // When
      mower.stepForward();

      // Then
      assertEquals(0, mower.getPosition().getX());
      assertEquals(1, mower.getPosition().getY());
   }

   @Test
   void testStepForward_InEastDirection_ShouldReturnRightPosition() {
      // Given
      Position p = new Position(1, 1);
      Mower mower = new Mower(p, Direction.EAST);
      // When
      mower.stepForward();

      // Then
      assertEquals(2, mower.getPosition().getX());
      assertEquals(1, mower.getPosition().getY());
   }

   @Test
   void testStepForward_InSouthDirection_ShouldReturnBottomPosition() {
      // Given
      Position p = new Position(1, 1);
      Mower mower = new Mower(p, Direction.SOUTH);
      // When
      mower.stepForward();

      // Then
      assertEquals(1, mower.getPosition().getX());
      assertEquals(0, mower.getPosition().getY());
   }

   @Test
   void testStepForward_InNorthDirection_ShouldReturnUpPosition() {
      // Given
      Position p = new Position(1, 1);
      Mower mower = new Mower(p, Direction.NORTH);
      // When
      mower.stepForward();

      // Then
      assertEquals(1, mower.getPosition().getX());
      assertEquals(2, mower.getPosition().getY());
   }
}
