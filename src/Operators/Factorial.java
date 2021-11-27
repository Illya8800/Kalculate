package Operators;

import OperationInterfaces.HardOperations;

public class Factorial implements HardOperations {
    @Override
    public double operation(double F) {
        double m = 1;
        while (F > 1){
            m = m * F;
            F--;
        }
        return m;
    }
}