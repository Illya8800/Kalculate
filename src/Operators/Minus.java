package Operators;

import KalculateForm.KalculateForm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Minus extends Operator implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        isOperation((byte) 2);
    }


}