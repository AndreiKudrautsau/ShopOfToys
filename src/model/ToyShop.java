package model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ToyShop implements Serializable{
    private List<Toy> toys = new ArrayList();
    private List<Toy> prizeToys = new ArrayList<>();
    private Random random = new Random();
    private String fileName = "listPrizeToys.dat";

    public void addToy (int id, String name, int quantity, double probability) {
        Toy toy = new Toy(id, name, quantity, probability);
        toys.add(toy);
    }

    public void editProbability(int id, double probability) {
        for (Toy toy : toys) {
            if (toy.getId() == id) {
                toy.setProbability(probability);
            }
        }
    }
    public Toy holdLottery() {
        double totalProbability = 0;
        for (Toy toy : toys) {
            totalProbability += toy.getProbability();
        }
        double randomProbability = random.nextDouble() * totalProbability;
        double sumProbability = 0;
        for (Toy toy : toys) {
            sumProbability += toy.getProbability();
            if (randomProbability <= sumProbability) {
                prizeToys.add(new Toy(toy.id, toy.name));
                toy.setQuantity(toy.getQuantity() - 1);
                prizeToys.toString();
                return toy;
            }
        }
        return null;
    }

    public String getInfo() {
        StringBuilder build = new StringBuilder();
        build.append("В списке игрушек - ");
        build.append(toys.size());
        build.append(" : \n");
        for (Toy toy : toys){
            build.append(toy.getInfo());
            build.append("\n");
        }

        return  build.toString();
    }

    @Override
    public String toString (){
        return getInfo();
    }
    public List getPrizeToys(){
        return prizeToys;
    }

    public void setPrizeToys(List<Toy> prizeToys) {
        this.prizeToys = prizeToys;
    }

    public void givePrizeToy() throws IOException {
        String path = "src/" + fileName;
        WriteRead war = new WriteRead();
        war.writeFile(path, prizeToys.get(0));
        prizeToys.remove(0);
    }
}
