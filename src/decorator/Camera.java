package decorator;

public class Camera extends PropertyDecorator{
    Phone phone;

    public Camera(Phone phone) {
        this.phone = phone;
    }

    @Override
    public double cost() {
        return phone.cost() + 250.0;
    }

    @Override
    public String getDescription() {
        return phone.getDescription() + "\nadded better camera";
    }
}
