// Concrete Subject (Concrete YouTube Channel)
// ConcreteYouTubeChannel implements the YouTubeChannel interface.
// It maintains a list of subscribers and notifies them when a new video is uploaded.
import java.util.ArrayList;
import java.util.List;

public class ConcreteYouTubeChannel implements YouTubeChannel {
    private List<Subscriber> subscribers = new ArrayList<>();
    private String channelName;

    public ConcreteYouTubeChannel(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers(String videoTitle) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(videoTitle);
        }
    }

    public void uploadVideo(String videoTitle) {
        System.out.println(channelName + " uploaded a new video: " + videoTitle);
        notifySubscribers(videoTitle);
    }
}