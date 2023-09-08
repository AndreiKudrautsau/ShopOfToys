package model;

import java.io.Serializable;

public class Toy implements Serializable {
    int id;
    String name;
    int quantity;
    double probability;
    public Toy(int id, String name, int quantity, double probability) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.probability = probability;
    }
    public Toy(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Toy() {

    }
    public void setProbability(double probability) {
        this.probability = probability;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }
    public double getProbability() {

        return probability;
    }
    @Override
    public String toString() {
        return "Toy: id=" + id + ", name=" + name;
    }
    public String getInfo (){
        StringBuilder builder = new StringBuilder();
        builder.append("ID: ");
        builder.append(id);
        builder.append(" | ");
        builder.append("Название игрушки: ");
        builder.append(name);
        builder.append(" | ");
        builder.append("Количество игрушек: ");
        builder.append(quantity);
        builder.append(" | ");
        builder.append("Вероятность выпадания: ");
        builder.append(probability);
        builder.append(" | ");
        return builder.toString();
    }
}
