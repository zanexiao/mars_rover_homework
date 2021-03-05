package com.zane.homework.commands;

import com.zane.homework.MarsRover;

public class TurnRightCommand implements  ICommand {
    @Override
    public void execute(MarsRover marsRover) {
        marsRover.turnRight();
    }
}
