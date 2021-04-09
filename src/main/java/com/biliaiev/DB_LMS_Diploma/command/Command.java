package com.biliaiev.DB_LMS_Diploma.command;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public enum Command {
    //Default
    HELP("help", "common", "commands list"),
    TERMINATE("terminate", "common","kill process"),

    //Group
    CREATE_GROUP("create", "group","create group");

    String value;
    String service;
    String description;

    Command(String value, String service, String description) {
        this.value = value;
        this.service = service;
        this.description = description;
    }

    public static Set<String> getValues() {
        Set<String> set = new HashSet<>(Arrays.asList(
                HELP.value,
                TERMINATE.value,
                CREATE_GROUP.value
        ));

        return Collections.unmodifiableSet(set);
    }

    public static Command getCommand(String commandString) {
        switch (commandString) {
            case "help" :
                return HELP;
            case "terminate" :
                return TERMINATE;
            case "create group" :
                return CREATE_GROUP;
            default:
                return  null;
        }
    }

    public static String help() {
        StringBuilder sb = new StringBuilder();

        for (Command command : Command.values()) {
            sb.append(System.lineSeparator())
                    .append(command.value)
                    .append(" - ")
                    .append(command.description);
        }

        return sb.toString();
    }
}
