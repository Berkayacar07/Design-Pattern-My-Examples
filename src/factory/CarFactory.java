package factory;

public abstract class CarFactory {

    public Car orderCar(String name, String colour ,int number){
        System.out.println(number+ " of "+ colour+ " "+ name +" order is received");
        Car car;
        car = createCar(name);
        car.prepare();
        car.painting(colour);
        car.finish();
        System.out.println(number+" "+ colour +" "+ name + " is produced" );
        return car;
    }
    //factory method
    public abstract Car createCar(String name);


}
