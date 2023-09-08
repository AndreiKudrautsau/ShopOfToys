package presenter;

import model.Toy;
import model.ToyShop;
import view.Console;
import view.View;

import java.awt.*;
import java.io.IOException;

public class Presenter {
    private View view;
    private ToyShop toyShop = new ToyShop();;
    private Toy toy;
    public Presenter(Console view) {
        this.view = view;
        }
    public void addToy(int id, String name, int quantity, double probability) {

        toyShop.addToy(id, name, quantity, probability);
    }

    public void getInfo(){
        String textInfo = toyShop.getInfo();
        view.answer(textInfo);
    }

    public void editProbability(int id, double probability){
        toyShop.editProbability(id, probability);
    }

    public void writeF(String file) {
    }

    public void readF(String file) {
    }

    public void holdLottery() {
        toyShop.holdLottery();
        String textInfo = toyShop.getPrizeToys().toString();
        view.answer(textInfo);
    }

    public void givePrizeToy() throws IOException {
        toyShop.givePrizeToy();
        String textInfo = toyShop.getPrizeToys().toString();
        view.answer(textInfo);
    }
}
