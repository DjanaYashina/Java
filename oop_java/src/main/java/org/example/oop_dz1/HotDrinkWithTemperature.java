package org.example.oop_dz1;

public class HotDrinkWithTemperature extends HotDrink{

    private int temperature;

    public HotDrinkWithTemperature(String name, int volume, int temperature){
        super(name, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }


    @Override
    public String toString() {
        return "HotDrinkWithTemperature {" + "наименование напитка - " + getName() + ", объём напитка - " + getVolume() + " мл., температура напитка - " + temperature + "°C}" ;
    }
}
