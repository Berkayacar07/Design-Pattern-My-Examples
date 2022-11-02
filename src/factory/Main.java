package factory;

public class Main {
    public static void main(String[] args) {
        CarFactory fordCarFactory = new FordCarFactory();
        CarFactory hondaCarFactory = new HondaCarFactory();

        Car focus = fordCarFactory.orderCar("Focus","White",1);
        System.out.println("------------------------------------------");
        Car civic = hondaCarFactory.orderCar("Civic","Black",1);
        System.out.println("------------------------------------------");
        Car mustang = fordCarFactory.orderCar("Mustang","White",100);
    }

}
