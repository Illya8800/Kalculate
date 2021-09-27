package Operators;

import KalculateForm.KalculateForm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Multiple extends Operator implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        KalculateForm kalculateForm = new KalculateForm();
        Operator operator = new Operator();
        Operator.first = Double.parseDouble(kalculateForm.getText().getText());
        Operator.operatorId = 3;
        kalculateForm.getText().setText("");
    }
}