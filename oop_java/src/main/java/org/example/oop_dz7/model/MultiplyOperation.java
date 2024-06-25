package org.example.oop_dz7.model;

public class MultiplyOperation implements ComplexOperation{
    @Override
    public ComplexNumber execute(ComplexNumber arg1, ComplexNumber arg2) {
        double realMultiply = arg1.getReal() * arg2.getReal() - arg1.getImaginary() * arg2.getImaginary();
        double imaginaryMultiply =  arg1.getReal() * arg2.getImaginary() + arg1.getImaginary() * arg2.getReal();
        return new ComplexNumber(realMultiply, imaginaryMultiply);
    }
}
