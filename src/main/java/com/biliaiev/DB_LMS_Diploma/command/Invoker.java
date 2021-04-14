package com.biliaiev.DB_LMS_Diploma.command;


import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private final List<ICommand> serviceOperations
            = new ArrayList<>();

    public void executeOperation(ICommand serviceOperation) {
        serviceOperations.add(serviceOperation);

        serviceOperation.execute();
    }
}
