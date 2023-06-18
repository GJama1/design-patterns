package ge.tsu.patterns.factorymethod;

public class ChimpanzeeFactory extends Jungle {
    @Override
    public Monkey createMonkey() {
        return new Chimpanzee();
    }
}