package factory;

import java.util.Locale;

public class Car {
    protected String name;
    protected String colour;

    public void prepare(){
        System.out.println("Car parts supplied and started.");
    }
    public void painting(String colour){
        System.out.println("Car is painting with "+colour.toLowerCase());
    }
    public void finish(){
        System.out.println("Car is ready");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
