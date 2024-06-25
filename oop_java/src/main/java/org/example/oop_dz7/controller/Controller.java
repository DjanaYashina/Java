package org.example.oop_dz7.controller;

import org.example.oop_dz7.model.*;
import org.example.oop_dz7.view.ViewCalculator;

import java.util.HashMap;
import java.util.Map;

public class Controller {
    private Model model;
    private ViewCalculator view;
    private Map<Integer, ComplexOperation> operation;

    public Controller(Model model, ViewCalculator view) {
        this.model = model;
        this.view = view;
        this.operation = initializeOperation();
    }




    public void processUserInput() {
        while (true) {
            ComplexNumber arg1 = view.readComplexNumber("Введите первое комплексное число:");
            ComplexNumber arg2 = view.readComplexNumber("Введите второе комплексное число:");

            int choice = view.readMenuChoice();

            ComplexOperation strategy = operation.get(choice);
            if (strategy != null) {
                model.setArg1(arg1);
                model.setArg2(arg2);
                ComplexNumber result = model.calculateResult(strategy);
                view.displayResult(result);
            } else {
                view.displayLog("Неверный выбор операции.");
            }

            if (!view.wantToContinue()) {
                view.displayLog("Программа завершена.");
                break;
            }
        }
    }

    private Map<Integer, ComplexOperation> initializeOperation() {
        Map<Integer, ComplexOperation> strategies = new HashMap<>();
        strategies.put(1, new AddOperation());
        strategies.put(2, new MultiplyOperation());
        strategies.put(3, new DivideOperation());
        return strategies;
    }
}
