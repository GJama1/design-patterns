package ge.tsu.patterns.factorymethod;

public class GorillaFactory extends Jungle {
    @Override
    public Monkey createMonkey() {
        return new Gorilla();
    }
}