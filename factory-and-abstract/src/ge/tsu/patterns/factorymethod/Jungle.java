package ge.tsu.patterns.factorymethod;

public abstract class Jungle {

    public void anarchy() {
        Monkey monkey = createMonkey();
        monkey.scream();
    }

    public abstract Monkey createMonkey();

}
