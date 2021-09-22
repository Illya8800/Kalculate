package KalculateForm;

import Actions.numericAction;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class KalculateForm {

    private static JTextField Jtext;
    private ArrayList<JButton> numBtn;




    public JFrame createMainForm() {
        JFrame fr = new JFrame("Калькулятор");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(250, 305);
        JPanel myPanel2 = new JPanel();
        numBtn = new ArrayList<>();

        Jtext = new JTextField();
        fr.getContentPane().add(BorderLayout.NORTH,Jtext);

        myPanel2.setLayout(new GridLayout(5, 4));

        ButtonGroup myGroup = new ButtonGroup();
        for (int i = 0; i < 20; i++) {
            numBtn.add(new JButton(""));
            myPanel2.setPreferredSize(new Dimension(250, 250));
            myGroup.add(numBtn.get(i));
            myPanel2.add(numBtn.get(i));
        }
        fr.add(myPanel2, BorderLayout.SOUTH);
        setButtonText();

        return fr;
    }

    private void setButtonText (){
        numBtn.get(0).setText("AC");
        numBtn.get(1).setText("+/-");
        numBtn.get(2).setText("%");
        numBtn.get(3).setText("/");
        numBtn.get(4).setText("7");
        numBtn.get(4).addActionListener(new numericAction());
        numBtn.get(5).setText("8");
        numBtn.get(6).setText("9");
        numBtn.get(7).setText("*");
        numBtn.get(8).setText("4");
        numBtn.get(9).setText("5");
        numBtn.get(10).setText("6");
        numBtn.get(11).setText("-");
        numBtn.get(12).setText("1");
        numBtn.get(13).setText("2");
        numBtn.get(14).setText("3");
        numBtn.get(15).setText("+");
        numBtn.get(16).setText("0");
        numBtn.get(17).setText("00");
        numBtn.get(18).setText(",");
        numBtn.get(19).setText("=");
    }

    public JTextField getText() {
        return Jtext;
    }

    public ArrayList<JButton> getNumBtn() {
        return numBtn;
    }

    public void setJText(String text) {
        Jtext.setText(text);
}


}



