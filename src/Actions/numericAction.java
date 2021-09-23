package Actions;

import KalculateForm.KalculateForm;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**Класс отвечает за всписания в поле название JButton.
 *
 * */

public class numericAction implements ActionListener {
    KalculateForm kalculateForm = new KalculateForm();

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton)e.getSource();
        kalculateForm.addJText(b.getText());
    }
}
