package ge.tsu.patterns.factorymethod;

public class Gorilla implements Monkey {
    @Override
    public void scream() {
        System.out.println("Gorilla: Ugh ugh ugh!");
    }
}
