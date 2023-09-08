package view;

import commands.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Command> commands;
    public Menu(Console console){
        commands = new ArrayList<>();
        commands.add(new AddToy(console));
        commands.add(new GetInfo(console));
        commands.add(new EditProbability(console));
        commands.add(new HoldLottery(console));
        commands.add(new GivePrizeToy(console));
        commands.add(new Finish(console));
    }
    public int getSize(){
        return commands.size();
    }
    public String menu(){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < commands.size(); i++) {
            builder.append(i+1);
            builder.append(commands.get(i).getScript());
            builder.append("\n");
        }
        return builder.toString();
    }
    public void execute(int choice) throws IOException, ClassNotFoundException {
        Command command = commands.get(choice-1);
        command.execute();
    }
}
