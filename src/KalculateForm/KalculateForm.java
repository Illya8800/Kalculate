package KalculateForm;

import Actions.clearAction;
import Actions.numericAction;
import Operators.Equal;
import Operators.Plus;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class KalculateForm {

    private static JTextField JText;
    private ArrayList<JButton> numBtn; //Для хранения списка JButton

    public void setJText(JTextField JText) {
        this.JText = JText;
    }

    public void setJText(double variable) {
        this.JText.setText(String.valueOf(variable));
    }



    public JFrame createMainForm() {
        JFrame fr = new JFrame("Калькулятор");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(250, 305);
        JPanel myPanel2 = new JPanel();
        numBtn = new ArrayList<>();

        JText = new JTextField();
        JText.setEditable(false);
        fr.getContentPane().add(BorderLayout.NORTH, JText);

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
        numBtn.get(2).setText("%");
        numBtn.get(2).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = JText.getText();
                double temp = Double.parseDouble(s);
                JText.setText("" + temp/100);
            }
        });
        numBtn.get(3).setText("/");
        numBtn.get(7).setText("*");
        numBtn.get(11).setText("-");
        numBtn.get(15).setText("+");//dwko
        numBtn.get(15).addActionListener(new Plus());
        numBtn.get(19).setText("=");
        numBtn.get(19).addActionListener(new Equal());

        numBtn.get(0).setText("AC");
        numBtn.get(0).addActionListener(new clearAction());//Слушатель события
        numBtn.get(1).setText("+/-");
        numBtn.get(1).addActionListener(new ActionListener() { //Меняет положительное и отричательное число
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = JText.getText();
                double temp = Double.parseDouble(s);
                if (temp > 0 && temp != 0){
                    JText.setText("-" + s);
                } else {
                    temp *= -1;
                    JText.setText("" + temp);
                    if(JText.getText().substring(JText.getText().length() - 2, JText.getText().length()).equals(".0")) {
                        JText.setText(JText.getText().substring(0, JText.getText().length()-2));
                    }
                }
            }
        });
        numBtn.get(18).setText(".");
        numBtn.get(18).addActionListener(new ActionListener() {//Вставляет точку для нецелых чисел
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = JText.getText();
                boolean com = false;
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == '.'){
                        com = true;
                        break;
                    }
                }
                if(!com){ JText.setText(JText.getText() + ".");  }
            }
        });
        numBtn.get(4).setText("7");
        numBtn.get(4).addActionListener(new numericAction());
        numBtn.get(5).setText("8");
        numBtn.get(5).addActionListener(new numericAction());
        numBtn.get(6).setText("9");
        numBtn.get(6).addActionListener(new numericAction());
        numBtn.get(8).setText("4");
        numBtn.get(8).addActionListener(new numericAction());
        numBtn.get(9).setText("5");
        numBtn.get(9).addActionListener(new numericAction());
        numBtn.get(10).setText("6");
        numBtn.get(10).addActionListener(new numericAction());
        numBtn.get(12).setText("1");
        numBtn.get(12).addActionListener(new numericAction());
        numBtn.get(13).setText("2");
        numBtn.get(13).addActionListener(new numericAction());
        numBtn.get(14).setText("3");
        numBtn.get(14).addActionListener(new numericAction());
        numBtn.get(16).setText("0");
        numBtn.get(16).addActionListener(new numericAction());
        numBtn.get(17).setText("00");
        numBtn.get(17).addActionListener(new numericAction());
    }

    public JTextField getText() {
        return JText;
    }


    public void addJText(String text) {
        JText.setText(JText.getText() + text);
    }
}



