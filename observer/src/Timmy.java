public class Timmy implements Subscriber {

    @Override
    public void update(String message) {
        System.out.println("Timmy! " + message);
    }

}
