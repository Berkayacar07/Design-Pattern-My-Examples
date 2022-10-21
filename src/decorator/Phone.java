package decorator;

public abstract class Phone {
    String description = "Unknown Phone";
    ColourEnum defaultColour=ColourEnum.BLACK;

    public String getDescription() {
        return description;
    }
    public abstract double cost();
}
