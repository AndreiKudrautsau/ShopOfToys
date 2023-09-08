package commands;

import view.Console;

public class EditProbability extends Command {
    public EditProbability(Console console){
        super(console, ". Изменить вероятность");
    }
    public void execute(){
        console.editProbability();
    }
}
