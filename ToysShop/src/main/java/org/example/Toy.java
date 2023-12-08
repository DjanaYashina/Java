package org.example;
import java.util.Objects;

public class Toy implements Comparable<Toy> {

    private int toysId;
    private String toysName;
    private int toysChanceFrequency;

    public Toy(int toyId, String toysName, int toysChanceFrequency) {
        this.toysId = toyId;
        this.toysName = toysName;
        this.toysChanceFrequency = toysChanceFrequency;
    }

    public int getToysId() {
        return toysId;
    }

    public String getToysName() {
        return toysName;
    }

    public int getToysChanceFrequency() {
        return toysChanceFrequency;
    }

    public void setToysChanceFrequency(int toysChanceFrequency) {
        this.toysChanceFrequency = toysChanceFrequency;
    }

    public String getInfo() {
        return String.format("ID Игрушки: %d, Наименование игрушки: %s", toysId, toysName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Toy toys = (Toy) o;
        return toysName.equals(toys.toysName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(toysName);
    }

    @Override
    public int compareTo(Toy o) {
        return Integer.compare(this.toysChanceFrequency, o.toysChanceFrequency);
    }

    @Override
    public String toString() {
        return "{" +
                "Id игрушки = " + toysId +
                ", наименование игрушки = " + toysName +
                ", частота выпадения игрушки =" + toysChanceFrequency +
                '}';
    }
}