package org.example.oop_dz7.model;

import java.util.HashMap;
import java.util.Map;

public class Model {
    private Map<String, ComplexNumber> complexNumbers;
    private ComplexNumber arg1;
    private ComplexNumber arg2;

    public Model() {
        this.complexNumbers = new HashMap<>();
    }

    public void setArg1(ComplexNumber arg1) {
        this.arg1 = arg1;
        addToComplexNumbers("arg1", arg1);
    }

    public void setArg2(ComplexNumber arg2) {
        this.arg2 = arg2;
        addToComplexNumbers("arg2", arg2);
    }

    public ComplexNumber calculateResult(ComplexOperation operation) {
        ComplexCalculator calculator = new ComplexCalculator(operation);
        ComplexNumber result = calculator.calculate(arg1, arg2);
        addToComplexNumbers("result", result);
        return result;
    }

    private void addToComplexNumbers(String key, ComplexNumber complexNumber) {
        complexNumbers.put(key, complexNumber);
    }

    public Map<String, ComplexNumber> getComplexNumbers() {
        return complexNumbers;
    }
}
