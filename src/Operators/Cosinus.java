package Operators;

import OperationInterfaces.HardOperations;

public class Cosinus implements HardOperations {
    @Override
    public double operation(double F) {
        return Math.cos(F);
    }
}
