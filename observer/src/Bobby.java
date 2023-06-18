public class Bobby implements Subscriber {

    @Override
    public void update(String message) {
        System.out.println("Hello Bobby: " + message);
    }

}
