package ge.tsu.patterns.factorymethod;

public class OrangutanFactory extends Jungle {
    @Override
    public Monkey createMonkey() {
        return new Orangutan();
    }
}