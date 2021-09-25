package Operators;

import KalculateForm.KalculateForm;
import Operators.Operator;

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
                Operator.second = Double.parseDouble(kalculateForm.getText().getText());
                kalculateForm.setJText(Operator.first + Operator.second);
                break;
            }
            case 2: {
                break;
            }
            case 3: {
                break;
            }
            case 4: {
                break;
            }
        }

    }

}
