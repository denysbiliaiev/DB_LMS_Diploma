package com.biliaiev.DB_LMS_Diploma.presentation.terminal;

public class ViewFactory {
    public static View getView(ViewType viewType) {
        View view = null;

        if (ViewType.TERMINAL.equals(viewType)) {
            view = new Terminal();
        }

        return view;
    }
}
