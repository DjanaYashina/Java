package org.example.oop_dz1;

public class HotDrink {


    private String name;
    private int volume;


    public HotDrink(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }


    public String getName() {
        return name;
    }


    public int getVolume() {
        return volume;
    }


    @Override
    public String toString() {
        return "HotDrink{" + "наименование напитка - " + name + ", объём напитка - " + volume + " мл.}" ;
    }

}
