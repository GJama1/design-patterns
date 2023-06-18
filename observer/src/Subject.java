
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public abstract class Subject {

    protected List<Subscriber> subscribers = new ArrayList<>();

    public abstract String getMessage();

    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(getMessage());
        }
    }

    public void addSubscriber(Subscriber subscriber) {
        if (subscribers.contains(subscriber)) return;

        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

}
