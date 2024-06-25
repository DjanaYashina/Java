package org.example.oop_dz7.view;

import org.example.oop_dz7.logger.Logger;
import org.example.oop_dz7.model.ComplexNumber;

import java.util.Scanner;

public class ViewCalculator {
    private Scanner scanner;

    public ViewCalculator() {
        this.scanner = new Scanner(System.in);
    }

    public ComplexNumber readComplexNumber(String prompt) {
        System.out.println(prompt);
        double real = scanner.nextDouble();
        System.out.println("Введите мнимую часть:");
        double imaginary = scanner.nextDouble();
        return new ComplexNumber(real, imaginary);
    }

    public int readMenuChoice() {
        System.out.println("Выберите операцию:");
        System.out.println("1. Сложение");
        System.out.println("2. Умножение");
        System.out.println("3. Деление");

        return scanner.nextInt();
    }

    public boolean wantToContinue() {
        System.out.println("Хотите выполнить еще одну операцию? (Да - y/ Нет - n)");
        String choice = scanner.next().toLowerCase();
        Logger.log("Выбор пользователя: " + choice);
        return choice.equals("y");
    }

    public void displayResult(ComplexNumber result) {
        System.out.println(result);
        Logger.logResult(result.toString());
    }

    public void displayLog(String message) {
        Logger.log(message);
    }
}
