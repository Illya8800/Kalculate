package Operators;

import OperationInterfaces.HardOperations;

public class Sinus implements HardOperations {
    @Override
    public double operation(double F) {
        return Math.sin(F);
    }
}
