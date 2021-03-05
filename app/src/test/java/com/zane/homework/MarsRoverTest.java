package com.zane.homework;

import com.zane.homework.property.Coordinate;
import com.zane.homework.property.Direction;
import com.zane.homework.property.Plateau;

import org.junit.Assert;
import org.junit.Test;

public class MarsRoverTest {

    @Test
    public void turnLeft() {
        Plateau plateau = new Plateau(5, 5);
        Coordinate coordinate = new Coordinate(1, 2);
        MarsRover rover = new MarsRover(plateau, coordinate, Direction.N);
        rover.turnLeft();
        System.out.println(rover.output());
        Assert.assertEquals("1 2 W", rover.output());
    }

    @Test
    public void  test1(){
        Plateau plateau = new Plateau(5, 5);
        Coordinate coordinate = new Coordinate(1, 2);
        MarsRover rover = new MarsRover(plateau, coordinate, Direction.N);
        rover.run("LMLMLMLMM");
        System.out.println(rover.output());
        Assert.assertEquals("1 3 N", rover.output());
    }

    @Test
    public void  test2(){
        Plateau plateau = new Plateau(5, 5);
        Coordinate coordinate = new Coordinate(3, 3);
        MarsRover rover = new MarsRover(plateau, coordinate, Direction.E);
        rover.run("MMRMMRMRRM");
        System.out.println(rover.output());
        Assert.assertEquals("5 1 E", rover.output());
    }

}
