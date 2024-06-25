package org.example.oop_dz7;

import org.example.oop_dz7.controller.Controller;
import org.example.oop_dz7.model.Model;
import org.example.oop_dz7.view.ViewCalculator;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        ViewCalculator view = new ViewCalculator();
        Controller controller = new Controller(model, view);

        controller.processUserInput();
    }

}
