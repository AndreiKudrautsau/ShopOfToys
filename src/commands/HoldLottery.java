package commands;

import view.Console;

public class HoldLottery extends Command {
    public HoldLottery(Console console){
        super(console, ". Провести розыгрыш");
    }
    public void execute(){
        console.holdLottery();
    }
}
