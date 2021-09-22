package Actions;

import KalculateForm.KalculateForm;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class clearAction implements ActionListener {
    KalculateForm kalculateForm = new KalculateForm();

    @Override
    public void actionPerformed(ActionEvent e) {
        kalculateForm.getText().setText("");
    }
}
