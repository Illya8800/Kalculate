import KalculateForm.KalculateForm;

import javax.swing.*;

public class main {
    public static void main(String[] args) {

        KalculateForm kalculateForm = new KalculateForm();
        JFrame fr = kalculateForm.createMainForm();
        fr.setVisible(true);
    }
}
