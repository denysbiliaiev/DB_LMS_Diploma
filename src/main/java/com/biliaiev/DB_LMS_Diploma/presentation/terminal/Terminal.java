package com.biliaiev.DB_LMS_Diploma.presentation.terminal;

import com.biliaiev.DB_LMS_Diploma.command.Commands;
import com.biliaiev.DB_LMS_Diploma.command.Client;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Terminal implements View {
    public Client operationClient;

    public Terminal() {
        operationClient = new Client();
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        Commands command;

        while(true) {
            log.info("Temminal view:");

            String commandString = scanner.nextLine();
            command = Commands.getCommand(commandString);

            if (command == null) {
                log.warn("Could not parse command:{}. Enter valid command.{}{}", commandString, System.lineSeparator(), "helper");
                continue;
            }

            operationClient.executeCommand(command);
        }
    }

    private static final Logger log = LogManager.getLogger(Terminal.class);
}
