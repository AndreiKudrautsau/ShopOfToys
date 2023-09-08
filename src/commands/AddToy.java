package commands;


import view.Console;

public class AddToy extends Command {
    public AddToy(Console console){
        super(console, ". Добавить игрушку");
    }
    public void execute(){
         console.addToy();
    }
}

