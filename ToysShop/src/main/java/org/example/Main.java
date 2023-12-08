package org.example;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Raffle raffle = new Raffle();
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("""
                    Меню:
                    1 - Добавление новой игрушки
                    2 - Изменение частоты выпадения игрушки
                    3 - Розыгрыш игрушек и сохранение результатов розыгрыша
                    0 - Выход
                    >\s""");
            var selection = scan.next();
            switch (selection) {
                case "1" -> raffle.addToy();
                case "2" -> raffle.setFrequency();
                case "3" -> raffle.raffle();
                case "0" -> {
                    System.out.println("До свидания");
                    System.exit(0);
                }
                default -> System.out.println("Данного пункта нет в меню, попробуйте ещё раз");
            }
        }
    }
}