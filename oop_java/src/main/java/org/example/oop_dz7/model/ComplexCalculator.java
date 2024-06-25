package org.example.oop_dz7.model;

public class ComplexCalculator {
    private ComplexOperation operation;

    public ComplexCalculator(ComplexOperation operation) {
        this.operation = operation;
    }

    public ComplexNumber calculate (ComplexNumber arg1, ComplexNumber arg2){
        return operation.execute(arg1, arg2);
    }
}
