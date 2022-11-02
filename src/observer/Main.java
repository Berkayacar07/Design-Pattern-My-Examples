package observer;

public class Main {
    public static void main(String[] args) {
        Channel channel = new Channel();
        Subscriber1 subscriber1 = new Subscriber1(channel);
        Subscriber2 subscriber2 = new Subscriber2(channel);
        channel.addVideo("Operating System");
        channel.removeObserver(subscriber2);
        channel.removeObserver(subscriber1);
        channel.addVideo("Design Pattern");
    }
}
