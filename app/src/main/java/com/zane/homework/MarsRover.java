package com.zane.homework;

import com.zane.homework.commands.CommandParse;
import com.zane.homework.commands.ICommand;
import com.zane.homework.property.Coordinate;
import com.zane.homework.property.Direction;
import com.zane.homework.property.Plateau;

import java.util.List;

/**
 * Desc  :  探测器定义
 * Author: Zhangcx
 * Date  : 3/5/21 2:07 PM
 */
public class MarsRover {

    private Plateau plateau;
    private Coordinate currentCoordinate;
    private Direction currentDirection;

    public MarsRover(Plateau plateau, Coordinate currentCoordinate, Direction currentDirection) {
        this.plateau = plateau;
        this.currentCoordinate = currentCoordinate;
        this.currentDirection = currentDirection;
    }

    public void turnLeft() {
        this.currentDirection = currentDirection.left();
    }

    public void turnRight() {
        this.currentDirection = currentDirection.right();
    }

    public void move() {
        Coordinate afterCoordinate = currentCoordinate.newCoordinateForStep(currentDirection.getStepOnX(), currentDirection.getStepOnY());
        if (plateau.isOutside(afterCoordinate)) {
            currentCoordinate = currentCoordinate.newCoordinateForStep(currentDirection.getStepOnX(), currentDirection.getStepOnY());
        }

    }

    public String output() {
        return currentCoordinate.toString() + " " + currentDirection.toString();
    }

    public void run(String commandString) {
        List<ICommand> commands = new CommandParse(commandString).toCommand();
        for (ICommand command : commands) {
            command.execute(this);
        }
    }

}
