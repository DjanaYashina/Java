package org.example.oop_dz1;

import java.util.ArrayList;
import java.util.List;

public class VendingMachineHotDrinks implements VendingMachine {

    private List<HotDrink> hotDrinkList;
    private List<HotDrinkWithTemperature> hotDrinkWithTemperatureList;

    public VendingMachineHotDrinks() {
        List<HotDrink> hotDrinkList = new ArrayList<>();
        List<HotDrinkWithTemperature> hotDrinkWithTemperatureList = new ArrayList<>();
        this.hotDrinkList = hotDrinkList;
        this.hotDrinkWithTemperatureList = hotDrinkWithTemperatureList;
    }
    /**
     * Получение напитка из автомата
     *
     * @param name          - название напитка
     * @param volume        - объем напитка
     * @return              - возврат информации о напитке, если указанные параметры совпадают, либо
     *                        возвращает null, если запрошен напиток с неверными параметрами
     */

    @Override
    public HotDrink getProduct(String name, int volume) {
        for (HotDrink hotDrink: hotDrinkList){
            if (hotDrink.getName().equals(name) && hotDrink.getVolume() == volume) {
                return hotDrink;
            }
        }
        return null;
    }

    /**
     * Получение напитка из автомата с указанием дополнительного параметра температуры
     *
     * @param name          - название напитка
     * @param volume        - объем напитка
     * @param temperature   - температура напитка
     * @return              - возврат информации о напитке, если указанные параметры совпадают, либо
     *                        возвращает null, если запрошен напиток с неверными параметрами
     */
    public HotDrinkWithTemperature getProduct(String name, int volume, int temperature){
        for (HotDrinkWithTemperature hotDrinkWithTemperature: hotDrinkWithTemperatureList){
            if(hotDrinkWithTemperature instanceof HotDrinkWithTemperature){
                if(hotDrinkWithTemperature.getName().equals(name) && hotDrinkWithTemperature.getVolume() == volume && hotDrinkWithTemperature.getTemperature() == temperature){
                    return (HotDrinkWithTemperature) hotDrinkWithTemperature;
                }
            }
        }
        return null;
    }

    /**
     * Перегруженный метод инициализации продукта
     *
     * @param list           - лист объектов класса HotDrink, либо класса HotDrinkWithTemperature
     */
    public void initProduct(List<HotDrink> list) {
        this.hotDrinkList = list;
    }
    public void initProductWithTemperature(List<HotDrinkWithTemperature> list) {
        this.hotDrinkWithTemperatureList = list;
    }

}
