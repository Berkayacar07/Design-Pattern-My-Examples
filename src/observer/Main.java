package observer;

public class Main {
    public static void main(String[] args) {
        Channel channel = new Channel();
        Sucsriber1 sucsriber1 = new Sucsriber1(channel);
        channel.addVideo("Operating System");
        channel.addVideo("Design Pattern");
    }
}
