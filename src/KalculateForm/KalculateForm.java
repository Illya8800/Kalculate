package KalculateForm;

import Actions.clearAction;
import Actions.numericAction;
import OperationInterfaces.HardOperations;
import Operators.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class KalculateForm {

    private HardOperations hardOperations;

    private static JTextField JText;
    private ArrayList<JButton> numBtn; //Для хранения списка JButton

    public void setHardOperation(HardOperations hardOperations) {
        this.hardOperations = hardOperations;
    }

    public void setJText(JTextField JText) {
        this.JText = JText;
    }

    public void setJText(double variable) {
        this.JText.setText(String.valueOf(variable));
    }


    public JFrame createMainForm() {
        JFrame fr = new JFrame("Калькулятор");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(250, 355);
        JPanel myPanel2 = new JPanel();
        numBtn = new ArrayList<>();

        JText = new JTextField();
        JText.setEditable(false);
        fr.getContentPane().add(BorderLayout.NORTH, JText);

        myPanel2.setLayout(new GridLayout(7, 4));

        ButtonGroup myGroup = new ButtonGroup();
        for (int i = 0; i < 28; i++) {
            numBtn.add(new JButton(""));
            myPanel2.setPreferredSize(new Dimension(250, 300));
            myGroup.add(numBtn.get(i));
            myPanel2.add(numBtn.get(i));
        }
        fr.add(myPanel2, BorderLayout.SOUTH);
        setButtonText();
        return fr;
    }

    private void setButtonText() {
        numBtn.get(2).setText("%");
        numBtn.get(2).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = JText.getText();
                double temp = Double.parseDouble(s);
                JText.setText("" + temp / 100);
            }
        });
        numBtn.get(3).setText("/");
        numBtn.get(3).addActionListener(new Division());
        numBtn.get(7).setText("*");
        numBtn.get(7).addActionListener(new Multiple());
        numBtn.get(11).setText("-");
        numBtn.get(11).addActionListener(new Minus());
        numBtn.get(15).setText("+");
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
                if (temp > 0 && temp != 0) {
                    JText.setText("-" + s);
                } else {
                    temp *= -1;
                    JText.setText("" + temp);
                    if (JText.getText().substring(JText.getText().length() - 2, JText.getText().length()).equals(".0")) {
                        JText.setText(JText.getText().substring(0, JText.getText().length() - 2));
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
                    if (s.charAt(i) == '.') {
                        com = true;
                        break;
                    }
                }
                if (!com) {
                    JText.setText(JText.getText() + ".");
                }
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









        numBtn.get(20).setText("√");
        numBtn.get(20).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = JText.getText();
                double temp = Double.parseDouble(s);

                setHardOperation(new SQRT());
                JText.setText(String.valueOf(hardOperations.operation(temp)));
            }
        });

        numBtn.get(21).setText("²");
        numBtn.get(21).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = JText.getText();
                double temp = Double.parseDouble(s);

                setHardOperation(new POW());
                JText.setText(String.valueOf(hardOperations.operation(temp)));
            }
        });

        numBtn.get(22).setText("e");
        numBtn.get(22).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setHardOperation(new Epsilon());
                JText.setText(String.valueOf(hardOperations.operation(0)));
            }
        });

        numBtn.get(23).setText("π");
        numBtn.get(23).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setHardOperation(new PI());
                JText.setText(String.valueOf(hardOperations.operation(0)));
            }
        });

        numBtn.get(24).setText("!");
        numBtn.get(24).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setHardOperation(new Factorial());
                JText.setText(String.valueOf(hardOperations.operation((int) Double.parseDouble(JText.getText()))));
            }
        });

        numBtn.get(25).setText("sin");
        numBtn.get(25).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setHardOperation(new Sinus());
                JText.setText(String.valueOf(hardOperations.operation(Double.parseDouble(JText.getText()))));
            }
        });

        numBtn.get(26).setText("cos");
        numBtn.get(26).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setHardOperation(new Cosinus());
                JText.setText(String.valueOf(hardOperations.operation(Double.parseDouble(JText.getText()))));
            }
        });

        numBtn.get(27).setText("");
        numBtn.get(27).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
    }

    public JTextField getTextField() {
        return JText;
    }


    public void addJText(String text) {
        JText.setText(JText.getText() + text);
    }
}