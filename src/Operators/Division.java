package Operators;

import KalculateForm.KalculateForm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Division extends Operator implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        isOperation((byte) 4);
    }


}