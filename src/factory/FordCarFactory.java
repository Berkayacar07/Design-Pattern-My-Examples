package factory;

public class FordCarFactory extends CarFactory {
    @Override
    public Car createCar(String name) {
        if(name.equals("Focus")){
            return new Focus();
        }if(name.equals("Mustang")){
            return new Mustang();
        }else
            throw new RuntimeException("Wrong car name");
    }

}
