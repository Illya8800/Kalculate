package Operators;

import OperationInterfaces.HardOperations;

public class PI implements HardOperations {
    @Override
    public double operation(double F) {
        return Math.PI;
    }
}
