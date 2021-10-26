package sumanth.assignment.main;

import sumanth.assignment.data.Data;
import sumanth.assignment.singleton.Singleton;

public class Main {
    public static void main(String[] args) {
        Data data = new Data();
        data.display();
        data.displayLocal();

        Singleton singleton = Singleton.setStr("sumanth");
        singleton.display();
    }
}
