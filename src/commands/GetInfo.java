package commands;

import view.Console;

public class GetInfo extends Command {
    public GetInfo(Console console) {
        super(console, ". Вывести список игрушек");
    }

    public void execute() {
        console.getInfo();
    }
}