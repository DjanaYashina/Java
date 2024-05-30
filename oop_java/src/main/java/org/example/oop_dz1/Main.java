package org.example.oop_dz1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 1. Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
 2. Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный метод
 getProduct(int name, int volume, int temperature) выдающий продукт соответствующий имени, объему и температуре
 3. В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику заложенную
 в программе
*/
public class Main {
    public static void main(String[] args) {

        VendingMachineHotDrinks vmHotDrinks = new VendingMachineHotDrinks();
        List<HotDrink> hotDrinksList = new ArrayList<>(Arrays.asList(
                new HotDrink("Капучино", 200),
                new HotDrink("Латте", 300),
                new HotDrink("Чай", 200)));
        vmHotDrinks.initProduct(hotDrinksList);

        VendingMachineHotDrinks vendingMachine = new VendingMachineHotDrinks();
        List<HotDrinkWithTemperature> hotDrinksWithTemperatureList = new ArrayList<>(Arrays.asList(
                new HotDrinkWithTemperature("Американо", 300, 80),
                new HotDrinkWithTemperature("Черный кофе", 200, 90),
                new HotDrinkWithTemperature("Какао", 200, 70)));
        vendingMachine.initProductWithTemperature(hotDrinksWithTemperatureList);

        System.out.println(vmHotDrinks.getProduct("Капучино-1", 200));
        System.out.println(vmHotDrinks.getProduct("Латте", 300));
        System.out.println(vmHotDrinks.getProduct("Латте", 200));
        System.out.println(vendingMachine.getProduct("Какао", 200,70));
        System.out.println(vendingMachine.getProduct("Какао", 300,70));
        System.out.println(vendingMachine.getProduct("Какао", 200,80));
        System.out.println(vendingMachine.getProduct("Американо-1", 300,80));

    }
}