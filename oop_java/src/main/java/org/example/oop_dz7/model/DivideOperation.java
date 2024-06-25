package org.example.oop_dz7.model;

public class DivideOperation implements ComplexOperation{
    @Override
    public ComplexNumber execute(ComplexNumber arg1, ComplexNumber arg2) {
        double divisor = arg2.getReal() * arg2.getReal() + arg2.getImaginary() * arg2.getImaginary();
        double realDivide = (arg1.getReal() * arg2.getReal() + arg1.getImaginary() * arg2.getImaginary()) / divisor;
        double imaginaryDivide = (arg1.getImaginary() * arg2.getReal() - arg1.getReal() * arg2.getImaginary()) / divisor;
        return new ComplexNumber(realDivide, imaginaryDivide);
    }
}
