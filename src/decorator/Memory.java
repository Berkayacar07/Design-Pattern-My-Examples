package decorator;

public class Memory extends PropertyDecorator{
    Phone phone;

    public Memory(Phone phone) {
        this.phone = phone;
    }

    @Override
    public String getDescription() {
        return phone.getDescription() + "\nadded +64 gb hard disk";
    }

    @Override
    public double cost() {
        return 1000.0 + phone.cost();
    }

}
