package observer;

public class Subscriber1 implements Observer{
    private Subject channel;

    public Subscriber1(Subject channel) {
        this.channel = channel;
        channel.registerObserver(this);
    }

    @Override
    public void update() {
        System.out.println("New video added: Sucsriber 1 !");
    }
}
