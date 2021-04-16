package com.biliaiev.DB_LMS_Diploma;

import com.biliaiev.DB_LMS_Diploma.dao.DaoContext;
import com.biliaiev.DB_LMS_Diploma.dao.DaoType;
import com.biliaiev.DB_LMS_Diploma.presentation.terminal.ViewFactory;
import com.biliaiev.DB_LMS_Diploma.presentation.terminal.ViewType;
import org.apache.commons.cli.*;

public class Runner {
    public static void main(String[] args) {
        Options options = new Options();

        options.addOption("daoType", true, DaoType.values().toString());
        options.addOption("viewType", true, ViewType.values().toString());

        CommandLineParser parser = new DefaultParser();

        try {
            CommandLine cmd = parser.parse(options, args);

            DaoType daoType = DaoType.valueOf(cmd.getOptionValue("daoType", DaoType.IN_MEMORY.name()));
            ViewType viewType = ViewType.valueOf(cmd.getOptionValue("viewType", ViewType.TERMINAL.name()));

            DaoContext.init(daoType);

            ViewFactory.getView(viewType).run();

        } catch(ParseException e) {
            e.printStackTrace();
        }
    }
}
