package observer;

public class Sucsriber1 implements Observer{
    private Subject channel;

    public Sucsriber1(Subject channel) {
        this.channel = channel;
        channel.registerObserver(this);
    }

    @Override
    public void update() {
        System.out.println("New video added !");
    }
}
