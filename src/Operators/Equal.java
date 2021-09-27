package Operators;

import KalculateForm.KalculateForm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Equal implements ActionListener {


    @Override
    public void actionPerformed(ActionEvent e) {
        Operator operator = new Operator();
        KalculateForm kalculateForm = new KalculateForm();
        System.out.println(Operator.operatorId);


        switch (Operator.operatorId) {
            case 1: {
                Operator.second = Double.parseDouble(kalculateForm.getTextField().getText());
                kalculateForm.setJText(Operator.first + Operator.second);
                drop();
                break;
            }
            case 2: {
                Operator.second = Double.parseDouble(kalculateForm.getTextField().getText());
                kalculateForm.setJText(Operator.first - Operator.second);
                drop();
                break;
            }
            case 3: {
                Operator.second = Double.parseDouble(kalculateForm.getTextField().getText());
                kalculateForm.setJText(Operator.first * Operator.second);
                drop();
                break;
            }
            case 4: {
                Operator.second = Double.parseDouble(kalculateForm.getTextField().getText());
                kalculateForm.setJText(Operator.first / Operator.second);
                drop();
                break;
            }
        }

    }

    private void drop(){
        KalculateForm kalculateForm = new KalculateForm();

        if(kalculateForm.getTextField().getText().substring(kalculateForm.getTextField().getText().length() - 2, kalculateForm.getTextField().getText().length()).equals(".0")) {
            kalculateForm.getTextField().setText(kalculateForm.getTextField().getText().substring(0, kalculateForm.getTextField().getText().length()-2));
        }
    }

}
