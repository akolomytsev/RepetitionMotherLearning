package kolomytsev.course1.eightCalculator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calculator extends JFrame {

    private JTextField textField;
    public Calculator(){
        initMandatoryComponent();
        setTitle("My Calculator");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);
//        JButton button1 = new JButton("Simple Button #1");
//        JButton button2 = new JButton("Simple Button #2");
        setLayout(new BorderLayout());

        add(initTop(), BorderLayout.NORTH);
        add(initBottom(), BorderLayout.CENTER);
        //add(initBottomRight(), BorderLayout.EAST);

//
//        add(button1, BorderLayout.NORTH);
//        add(button2, BorderLayout.SOUTH);


        setVisible(true);

    }

    private void initMandatoryComponent(){
        textField = new JTextField();
    }

    private JPanel initTop(){
        JPanel top = new JPanel();
        top.setLayout(new BorderLayout());
        textField = new JTextField();
        textField.setEnabled(false);
        top.add(textField, BorderLayout.CENTER);
        return top;
    }

    private JPanel initBottom(){
        JPanel bottom = new JPanel();
        bottom.setLayout(new GridLayout(5,4));

        ActionListener digitButtonListener = new DigitButtonListener(textField);

//        for (int i = 1; i <= 9; i++) {
//            JButton btn = new JButton(String.valueOf(i));
//            btn.addActionListener(digitButtonListener);
//            bottom.add(btn);
//        }
        JButton one = new JButton("1");
        one.addActionListener(digitButtonListener);

        JButton two = new JButton("2");
        two.addActionListener(digitButtonListener);

        JButton three = new JButton("3");
        three.addActionListener(digitButtonListener);

        JButton foo = new JButton("4");
        foo.addActionListener(digitButtonListener);

        JButton five = new JButton("5");
        five.addActionListener(digitButtonListener);

        JButton six = new JButton("6");
        six.addActionListener(digitButtonListener);

        JButton seven = new JButton("7");
        seven.addActionListener(digitButtonListener);

        JButton eight = new JButton("8");
        eight.addActionListener(digitButtonListener);

        JButton nine = new JButton("9");
        nine.addActionListener(digitButtonListener);

        JButton submit = new JButton("=");
        submit.addActionListener(new CalculationListener(textField));

        JButton zero = new JButton("0");
        zero.addActionListener(digitButtonListener);

        JButton multiply = new JButton("*");
        multiply.addActionListener(digitButtonListener);

        JButton delete = new JButton("C");
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
            }
        });

        JButton plus = new JButton("+");
        plus.addActionListener(digitButtonListener);

        JButton minus = new JButton("-");
        minus.addActionListener(digitButtonListener);

        JButton division = new JButton("/");
        division.addActionListener(digitButtonListener);

        // three.addActionListener(digitButtonListener);
        JButton dot = new JButton(".");
        dot.addActionListener(digitButtonListener);

        JButton percent = new JButton("%");
        percent.addActionListener(digitButtonListener);

        JButton squareRoot = new JButton("√");
        squareRoot.addActionListener(digitButtonListener);

        JButton squaring = new JButton("^2");
        squaring.addActionListener(digitButtonListener);


        bottom.add(delete);
        bottom.add(division);
        bottom.add(multiply);
        bottom.add(squaring);
        bottom.add(one);
        bottom.add(two);
        bottom.add(three);
        bottom.add(minus);
        bottom.add(foo);
        bottom.add(five);
        bottom.add(six);
        bottom.add(plus);
        bottom.add(seven);
        bottom.add(eight);
        bottom.add(nine);
        bottom.add(squareRoot);
        bottom.add(percent);
        bottom.add(zero);
        bottom.add(dot);
        bottom.add(submit);

        return bottom;
    }

    private JPanel initBottomRight(){
        JPanel bottomRight = new JPanel();
        bottomRight.setLayout(new GridLayout(4,1));
        ActionListener digitButtonListener = new DigitButtonListener(textField);
        JButton delete = new JButton("C");
        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
            }
        });
        JButton plus = new JButton("+");
        plus.addActionListener(digitButtonListener);
        JButton minus = new JButton("-");
        minus.addActionListener(digitButtonListener);
        JButton division = new JButton("/");
        division.addActionListener(digitButtonListener);
        bottomRight.add(delete);
        bottomRight.add(plus);
        bottomRight.add(minus);
        bottomRight.add(division);


        return bottomRight;
    }
}
