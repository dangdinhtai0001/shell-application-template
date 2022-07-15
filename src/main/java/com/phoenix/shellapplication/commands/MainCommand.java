package com.phoenix.shellapplication.commands;

import com.phoenix.shellapplication.facade.ApplicationFacade;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class MainCommand {

    private final ApplicationFacade applicationFacade;

    public MainCommand(@Qualifier("ApplicationFacade") ApplicationFacade applicationFacade) {
        this.applicationFacade = applicationFacade;
    }

    @ShellMethod("Ping.")
    public String ping() {
        return "Pong";
    }
}
