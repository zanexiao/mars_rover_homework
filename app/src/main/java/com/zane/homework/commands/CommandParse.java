package com.zane.homework.commands;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 /**
  * Desc  :  命令解析
  * Author: Zhangcx
  * Date  : 3/5/21 4:45 PM
  */
public class CommandParse {

    private final Map<String, ICommand> commandMap = new HashMap<>();
    List<ICommand> commands = new ArrayList<ICommand>();
    private final String commandString;//输入命令

    public CommandParse(String commandString) {
        this.commandString = commandString;
        commandMap.put("L", new TurnLeftCommand());
        commandMap.put("R", new TurnRightCommand());
        commandMap.put("M", new MoveCommand());
    }

    public List<ICommand> toCommand() {
        if (null == commandString || commandString.isEmpty()) {
            return commands;
        }
        String[] split = commandString.split("");
        for (String c : split) {
            if (null == c) break;
            ICommand command = commandMap.get(c);
            commands.add(command);
        }
        return commands;
    }

}
