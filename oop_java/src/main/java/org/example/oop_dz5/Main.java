package org.example.oop_dz5;

import org.example.oop_dz5.controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createTeacher("Петрова", "Анна", "Сергеевна");
        controller.createStudent("Иванова", "Галина", "Федоровна");
        controller.createStudent("Соловьев", "Дмитрий", "Ильич");
        controller.createStudent("Чернов", "Петр", "Андреевич");
        controller.getAllStudent();
        System.out.println();
        controller.getAllTeacher();
        System.out.println();
        controller.createStudyGroup();


    }
}
