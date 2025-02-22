// Client Class (YouTube App Simulation)
public class YouTubeApp {
    public static void main(String[] args) {
        ConcreteYouTubeChannel myChannel = new ConcreteYouTubeChannel("My Coding Channel");

        ConcreteSubscriber subscriber1 = new ConcreteSubscriber("Alice", myChannel);
        ConcreteSubscriber subscriber2 = new ConcreteSubscriber("Bob", myChannel);
        ConcreteSubscriber subscriber3 = new ConcreteSubscriber("Charlie", myChannel);

        myChannel.uploadVideo("Introduction to Design Patterns");

        myChannel.unsubscribe(subscriber2); // Bob unsubscribes.

        myChannel.uploadVideo("Advanced Spring Boot Concepts");
    }
}

// Output:

// My Coding Channel uploaded a new video: Introduction to Design Patterns
// Alice received notification: New video "Introduction to Design Patterns" uploaded!
// Bob received notification: New video "Introduction to Design Patterns" uploaded!
// Charlie received notification: New video "Introduction to Design Patterns" uploaded!
// My Coding Channel uploaded a new video: Advanced Spring Boot Concepts
// Alice received notification: New video "Advanced Spring Boot Concepts" uploaded!
// Charlie received notification: New video "Advanced Spring Boot Concepts" uploaded!