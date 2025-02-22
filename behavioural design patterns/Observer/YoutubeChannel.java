// Subject (YouTube Channel) Interface
public interface YouTubeChannel {
    void subscribe(Subscriber subscriber);
    void unsubscribe(Subscriber subscriber);
    void notifySubscribers(String videoTitle);
}