package decorator;

import java.util.Locale;

public class Colour extends PropertyDecorator{
    Phone phone;
    ColourEnum colourEnum;

    public Colour(Phone phone,ColourEnum colourEnum) {
        this.phone = phone;
        this.colourEnum=colourEnum;
    }

    @Override
    public String getDescription() {
        return phone.getDescription()+ "\nchange colur with " +colourEnum.toString().toLowerCase(Locale.ENGLISH);
    }
    public double cost(){
        if(!phone.defaultColour.equals(colourEnum)){
            return 250.0+ phone.cost();
        }
        throw new RuntimeException("Phone is already "+defaultColour);
    }
}
