package com.zane.homework;

import com.zane.homework.commands.CommandParse;
import com.zane.homework.commands.MoveCommand;
import com.zane.homework.commands.TurnLeftCommand;
import com.zane.homework.commands.TurnRightCommand;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class CommandParseTest {

    @Test
    public void testLeftCommand() {
        CommandParse parse = new CommandParse("L");
        List command = parse.toCommand();
        System.out.println(command.size());
        Assert.assertTrue(command.get(0) instanceof TurnLeftCommand);
    }

    @Test
    public void testRightCommand() {
        CommandParse parse = new CommandParse("R");
        List command = parse.toCommand();
        System.out.println(command.size());
        Assert.assertTrue(command.get(0) instanceof TurnRightCommand);
    }

    @Test
    public void testMoveCommand() {
        CommandParse parse = new CommandParse("M");
        List command = parse.toCommand();
        System.out.println(command.size());
        Assert.assertTrue(command.get(0) instanceof MoveCommand);
    }

    @Test
    public void testCommands() {
        CommandParse parse = new CommandParse("LMLM");
        List command = parse.toCommand();
        System.out.println(command.size());
        Assert.assertEquals(command.size() ,4);
    }

}
