package Operators;

import OperationInterfaces.HardOperations;

public class SQRT implements HardOperations {
    @Override
    public double operation(double F) {
        return Math.sqrt(F);
    }
}
