package org.example;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Raffle {

    private static ArrayList<Toy> toys = new ArrayList<>();
    private static PriorityQueue<Toy> prizes = new PriorityQueue<>();

    private static int idCounter = 0;

    public void addToy() {
        Scanner scan = new Scanner(System.in);
        String name;
        int frequency;
        while (true) {
            System.out.print("Введите наименование игрушки: ");
            name = scan.nextLine();
            if (name.isEmpty()) {
                System.out.println("Некорректный ввод, попробуйте ещё раз");
                break;
            }
            System.out.print("Введите частоту выпадения игрушки: ");
            String value = scan.nextLine();
            if (isDigit(value)) {
                frequency = Integer.parseInt(value);
                if (frequency <= 0) {
                    System.out.println("Некорректный ввод, попробуйте ещё раз");
                } else {
                    Toy toys = new Toy(idCounter, name, frequency);
                    if (!Raffle.toys.contains(toys) || Raffle.toys.size() == 0) {
                        idCounter++;
                        Raffle.toys.add(toys);
                        System.out.println("Игрушка добавлена");
                    } else {
                        System.out.println("Данная игрушка уже есть в списке.");
                    }
                }
            } else {
                System.out.println("Некорректный ввод, попробуйте ещё раз");
            }
            break;
        }
    }

    public void setFrequency() {
        System.out.println(toys.toString());
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите ID игрушки: ");
        String value = scan.nextLine();
        if (isDigit(value)) {
            int selectedId = Integer.parseInt(value);
            if (selectedId >= 0 && selectedId < toys.size()) {
                System.out.println("Игрушка " + toys.get(selectedId).getToysName() +
                        " имеет частоту выпадения " + toys.get(selectedId).getToysChanceFrequency());
                System.out.print("Введите новую частоту выпадения игрушки: ");
                value = scan.nextLine();
                if (isDigit(value)) {
                    int newFrequency = Integer.parseInt(value);
                    toys.get(selectedId).setToysChanceFrequency(newFrequency);
                    System.out.println("Частота выпадения игрушки изменена.");
                } else {
                    System.out.println("Некорректный ввод, попробуйте ещё раз");
                }
            } else {
                System.out.println("Данный ID не найден.");
            }
        } else {
            System.out.println("Некорректный ввод, попробуйте ещё раз");
        }
    }

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public Toy getPrize() {
        if (prizes.size() == 0) {
            Random rnd = new Random();
            for (Toy toys : Raffle.toys) {
                for (int i = 0; i < toys.getToysChanceFrequency(); i++) {
                    Toy temp = new Toy(toys.getToysId(), toys.getToysName(), rnd.nextInt(1, 10));
                    prizes.add(temp);
                }
            }
        }
        return prizes.poll();
    }

    public void raffle() {
        if (toys.size() >= 3) {
            Toy prize = getPrize();
            System.out.println("Ваш приз: " + prize.getToysName());
            saveResult(prize.getInfo());
        } else {
            System.out.println("Необходимо добавить минимум три игрушки.");
        }
    }

    private void saveResult(String text) {
        File file = new File("UPDATE.txt");
        try {
            file.createNewFile();
        } catch (Exception ignored) {
            throw new RuntimeException();
        }
        try (FileWriter fw = new FileWriter("UPDATE.txt", true)) {
            fw.write(text + "\n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
