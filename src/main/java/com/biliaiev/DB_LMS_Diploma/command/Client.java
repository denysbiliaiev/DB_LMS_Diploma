package com.biliaiev.DB_LMS_Diploma.command;

public class Client {
    Invoker serviceOperationExecutor;

    public Client() {
        this.serviceOperationExecutor = new Invoker();
    }

    public void executeCommand (Commands command) {
        if (command.service == "group") {
            serviceOperationExecutor.executeOperation(new GroupCommand(command));
        }
    }
}
