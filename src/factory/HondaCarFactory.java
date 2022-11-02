package factory;

public class HondaCarFactory extends CarFactory{
    @Override
    public Car createCar(String name) {
        if(name.equals("Civic")){
            return new Civic();
        }else
            throw new RuntimeException("Wrong car name");
    }
}
