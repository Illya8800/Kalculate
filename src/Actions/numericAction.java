package Actions;

import KalculateForm.KalculateForm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class numericAction implements ActionListener {
    KalculateForm kalculateForm = new KalculateForm();

    @Override
    public void actionPerformed(ActionEvent e) {
    kalculateForm.setJText("");
    }
}
