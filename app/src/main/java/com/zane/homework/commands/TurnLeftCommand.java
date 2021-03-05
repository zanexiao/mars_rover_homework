package com.zane.homework.commands;

import com.zane.homework.MarsRover;

public class TurnLeftCommand implements ICommand{
    @Override
    public void execute(MarsRover marsRover) {
        marsRover.turnLeft();
    }
}
