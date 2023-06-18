public class Jane implements Subscriber {

    @Override
    public void update(String message) {
        System.out.println("There is a new message for you Jane: " + message);
    }

}
