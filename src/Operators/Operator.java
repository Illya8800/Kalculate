package Operators;

import KalculateForm.KalculateForm;

public class Operator {
    protected static double first;
    protected static double second;
    protected static byte operatorId;

    public Operator() {}

    protected void isOperation(byte operatorId){
        KalculateForm kalculateForm = new KalculateForm();
        Operator.first = Double.parseDouble(kalculateForm.getTextField().getText());
        Operator.operatorId = operatorId;
        kalculateForm.getTextField().setText("");
    }

}
