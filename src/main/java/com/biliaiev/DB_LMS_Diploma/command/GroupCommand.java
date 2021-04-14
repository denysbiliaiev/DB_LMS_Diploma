package com.biliaiev.DB_LMS_Diploma.command;

import com.biliaiev.DB_LMS_Diploma.dao.GenericDao;
import com.biliaiev.DB_LMS_Diploma.dao.InMemoryImpl.InMemoryDaoImpl;
import com.biliaiev.DB_LMS_Diploma.domain.Group;
import com.biliaiev.DB_LMS_Diploma.service.GroupService;
import com.biliaiev.DB_LMS_Diploma.service.GroupServiceImpl;

import java.time.LocalDate;

public class GroupCommand implements ICommand {
    Commands command;
    DefaultCommand defaultCommand;
    GroupService groupService;

    public GroupCommand(Commands command) {
        GenericDao<Group> groupDao = new InMemoryDaoImpl<>();
        this.groupService = new GroupServiceImpl(groupDao);
        this.defaultCommand = new DefaultCommand(command);

        this.command = command;
    }

    @Override
    public void execute() {
        switch (command) {
            case CREATE_GROUP:
                groupService.createGroup("", "", LocalDate.now());
                break;
            default:
                this.defaultCommand.execute();
        }
    }
}
