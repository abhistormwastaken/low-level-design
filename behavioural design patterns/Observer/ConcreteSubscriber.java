// Concrete Observers (Concrete Subscribers)
// ConcreteSubscriber implements the Subscriber interface.
// It receives notifications from the channel and prints a message.
public class ConcreteSubscriber implements Subscriber {
    private String subscriberName;

    public ConcreteSubscriber(String subscriberName, YouTubeChannel channel) {
        this.subscriberName = subscriberName;
        channel.subscribe(this);
    }

    @Override
    public void update(String videoTitle) {
        System.out.println(subscriberName + " received notification: New video \"" + videoTitle + "\" uploaded!");
    }
}