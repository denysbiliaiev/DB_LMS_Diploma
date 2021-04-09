package com.biliaiev.DB_LMS_Diploma.command;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public class DefaultCommand implements ICommand {
    List<Commands> commands;
    Commands command;

    public DefaultCommand(Commands command) {
        commands = new ArrayList<>(Arrays.asList(
            Commands.HELP, Commands.TERMINATE
        ));

        this.command = command;
    }

    @Override
    public void execute() {
        switch (command) {
            case HELP:
                executeHelp();
                break;
            case TERMINATE:
                executeTerminate();
                break;
            default:
                executeHelp();
        }
    }

    public void executeHelp() {
        log.info("view all commands");
    }

    public void executeTerminate() {
        log.info("exit with code 0");
    }

    public List<Commands> getCommands() {
        return commands;
    }

    private static final Logger log = LogManager.getLogger(DefaultCommand.class);

}
