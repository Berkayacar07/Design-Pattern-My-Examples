package decorator;

public class IPhone11 extends Phone{

    public IPhone11(ColourEnum defaultColour) {
        this.defaultColour=defaultColour;
        description = "Default Phone: IPhone 11 - 128 GB - "+defaultColour;
    }

    @Override
    public double cost() {
        return 7000.0;
    }
}
