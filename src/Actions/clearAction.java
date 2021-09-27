package Actions;

import KalculateForm.KalculateForm;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
    /**
     * Класс отвечает за очистку поля для ввода текста.
     * Кол-во слушателей: 1.*/
public class clearAction implements ActionListener {
    KalculateForm kalculateForm = new KalculateForm();

    @Override
    public void actionPerformed(ActionEvent e) {
        kalculateForm.getTextField().setText("");
    }
}
