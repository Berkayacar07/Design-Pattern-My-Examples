package observer;

public class Sucsriber2 implements Observer {
    private Subject channel;

    public Sucsriber2(Channel channel) {
        this.channel=channel;
        channel.registerObserver(this);
    }

    @Override
    public void update() {
        System.out.println("New video added: Sucsriber 2 !");
    }
}
