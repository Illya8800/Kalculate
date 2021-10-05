package Operators;

import KalculateForm.KalculateForm;
import OperationInterfaces.Division;
import OperationInterfaces.Minus;
import OperationInterfaces.Multiple;
import OperationInterfaces.Plus;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Equal implements  ActionListener, Minus, Plus, Multiple, Division {


    @Override
    public void actionPerformed(ActionEvent e) {
        KalculateForm kalculateForm = new KalculateForm();

        switch (Operator.operatorId) {
            case 1 -> {
                Operator.second = Double.parseDouble(kalculateForm.getTextField().getText());
                kalculateForm.setJText(plus(Operator.first, Operator.second));
                drop();
            }
            case 2 -> {
                Operator.second = Double.parseDouble(kalculateForm.getTextField().getText());
                kalculateForm.setJText(minus(Operator.first, Operator.second));
                drop();
            }
            case 3 -> {
                Operator.second = Double.parseDouble(kalculateForm.getTextField().getText());
                kalculateForm.setJText(multiple(Operator.first, Operator.second));
                drop();
            }
            case 4 -> {
                Operator.second = Double.parseDouble(kalculateForm.getTextField().getText());
                kalculateForm.setJText(division(Operator.first, Operator.second));
                drop();
            }
        }

    }

    private void drop(){
        KalculateForm kalculateForm = new KalculateForm();

        if(kalculateForm.getTextField().getText().substring(kalculateForm.getTextField().getText().length() - 2, kalculateForm.getTextField().getText().length()).equals(".0")) {
            kalculateForm.getTextField().setText(kalculateForm.getTextField().getText().substring(0, kalculateForm.getTextField().getText().length()-2));
        }
    }

    @Override
    public double plus(double f, double s) {
        return f+s;
    }

    @Override
    public double minus(double f, double s) {
        return f-s;
    }

    @Override
    public double division(double f, double s) {
        return f/s;
    }

    @Override
    public double multiple(double f, double s) {
        return f*s;
    }

}
