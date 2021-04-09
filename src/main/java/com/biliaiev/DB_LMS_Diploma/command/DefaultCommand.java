package com.biliaiev.DB_LMS_Diploma.command;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public class DefaultCommand implements ICommand {
    List<Command> commands;
    Command command;

    public DefaultCommand(Command command) {
        commands = new ArrayList<>(Arrays.asList(
            Command.HELP, Command.TERMINATE
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

    public List<Command> getCommands() {
        return commands;
    }

    private static final Logger log = LogManager.getLogger(DefaultCommand.class);

}
