package org.example.oop_dz7.model;

public class AddOperation implements ComplexOperation {
    @Override
    public ComplexNumber execute(ComplexNumber arg1, ComplexNumber arg2) {
        double realSum = arg1.getReal() + arg2.getReal();
        double imaginarySum = arg1.getImaginary() + arg2.getImaginary();
        return new ComplexNumber(realSum, imaginarySum);
    }
}