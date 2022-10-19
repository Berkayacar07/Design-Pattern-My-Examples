package observer;

public class Subscriber2 implements Observer {
    private Subject channel;

    public Subscriber2(Channel channel) {
        this.channel=channel;
        channel.registerObserver(this);
    }

    @Override
    public void update() {
        System.out.println("New video added: Subscriber 2 !");
    }
}
