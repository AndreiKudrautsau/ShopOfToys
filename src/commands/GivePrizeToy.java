package commands;

import view.Console;

import java.io.IOException;

public class GivePrizeToy extends Command {
    public GivePrizeToy(Console console){
        super(console, ". Выдать призовую игрушку");
    }
    public void execute() throws IOException {
        console.givePrizeToy();
    }
}
