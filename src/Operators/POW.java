package Operators;

import OperationInterfaces.HardOperations;

public class POW implements HardOperations {
    @Override
    public double operation(double F) {
        return Math.pow(F, 2);
    }
}
