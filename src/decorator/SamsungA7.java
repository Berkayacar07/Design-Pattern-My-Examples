package decorator;

public class SamsungA7 extends Phone {
    public SamsungA7(ColourEnum defaultColour) {
        this.defaultColour = defaultColour;
        description = "Default Phone: Samsung A7 - 64 GB - " + defaultColour;
    }

    @Override
    public double cost() {
        return 4000.0;
    }
}
