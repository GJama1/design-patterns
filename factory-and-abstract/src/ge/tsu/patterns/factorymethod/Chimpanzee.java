package ge.tsu.patterns.factorymethod;

public class Chimpanzee implements Monkey {
    @Override
    public void scream() {
        System.out.println("Chimpanzee: Ooh ooh ooh!");
    }
}
