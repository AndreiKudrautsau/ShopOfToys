package view;

import presenter.Presenter;

import java.io.IOException;
import java.util.Scanner;

public class Console implements View{
    private Presenter presenter;
    private Scanner sc;
    private boolean work;
    private Menu menu;
    public Console(){
        presenter = new Presenter(this);
        sc = new Scanner(System.in);
        work = true;
        menu = new Menu(this);
    }

    @Override
    public void start() throws
            IOException, ClassNotFoundException {
        while (work){
            System.out.println(menu.menu());
            String choice = sc.nextLine();
            int numChoice = Integer.parseInt(choice);
            menu.execute(numChoice);
        }
    }

    public void addToy() {
        System.out.println("Введите ID:" );
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Введите название:" );
        String name = sc.nextLine();
        System.out.println("Введите количество:" );
        int quantity = Integer.parseInt(sc.nextLine());
        System.out.println("Введите вероятность выпадания:" );
        double probability = Double.parseDouble(sc.nextLine());
        presenter.addToy(id, name, quantity, probability);
    }

    public void getInfo(){
        presenter.getInfo();
    }
    public void finish(){
        System.out.println("Пока!");
        work = false;
    }

    public void editProbability() {
        System.out.println("Введите ID игрушки:" );
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Введите новое значение вероятности выпадания:" );
        double probability = Double.parseDouble(sc.nextLine());
        presenter.editProbability(id, probability);
    }

    public void holdLottery(){
        presenter.holdLottery();
    }
    public void givePrizeToy() throws IOException {
        presenter.givePrizeToy();
    }
    @Override
    public void answer(String text) {
        System.out.println(text);
    }

    public void writeF() throws IOException {
        System.out.println("Введите имя файла для записи данных:" );
        String file = sc.nextLine();
        presenter.writeF(file);
        System.out.println("Данные успешно записаны в файл " + file);
    }

    public void readF() throws IOException, ClassNotFoundException {
        System.out.println("Введите имя файла для загрузки данных:" );
        String file = sc.nextLine();
        presenter.readF(file);
        System.out.println("Данные успешно загружены из файла " + file);
        presenter.getInfo();
    }
}
