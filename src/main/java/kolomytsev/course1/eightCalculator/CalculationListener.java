package kolomytsev.course1.eightCalculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import javax.swing.*;

public class CalculationListener implements ActionListener {

    private final JTextField textField;

    public CalculationListener(JTextField textField) {
        this.textField = textField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        BigDecimal result;
        BigDecimal operator1;
        BigDecimal operator2;
        if (textField.getText().contains("+")) {
            String[] operator = textField.getText().split("\\+");
            operator1 = new BigDecimal(operator[0]);
            operator2 = new BigDecimal(operator[1]);
            result = operator1.add(operator2);
            textField.setText(String.valueOf(result));
        } else if (textField.getText().contains("-")) {
            String[] operator = textField.getText().split("-");
            operator1 = new BigDecimal(operator[0]);
            operator2 = new BigDecimal(operator[1]);
            result = operator1.subtract(operator2);
            textField.setText(String.valueOf(result));
        } else if (textField.getText().contains("*")) {
            String[] operator = textField.getText().split("\\*");
            operator1 = new BigDecimal(operator[0]);
            operator2 = new BigDecimal(operator[1]);
            result = operator1.multiply(operator2);
            textField.setText(String.valueOf(result));
        } else if (textField.getText().contains("/")) {
            String[] operator = textField.getText().split("/");
            if (Integer.parseInt(operator[1]) != 0) {
                operator1 = new BigDecimal(operator[0]);
                operator2 = new BigDecimal(operator[1]);
                result = operator1.divide(operator2);
                textField.setText(String.valueOf(result));
            } else {
                textField.setText("ERROR");
            }
        } else if (textField.getText().contains("^2")) {
            String[] operator = textField.getText().split("^2");
            operator1 = new BigDecimal(operator[0]);
            result = operator1.pow(2);
            textField.setText(String.valueOf(result));
        } else if (textField.getText().contains("√")) {
            String[] operator = textField.getText().split("√");
            result = BigDecimal.valueOf(Math.sqrt(Double.parseDouble(operator[0])));
            textField.setText(String.valueOf(result));
        } else if (textField.getText().contains("%")) {
            String[] operator = textField.getText().split("%");
            operator1 = new BigDecimal(operator[0]);
            operator2 = new BigDecimal(operator[1]);
            result = operator1.divide(BigDecimal.valueOf(100)).multiply(operator2);
            textField.setText(String.valueOf(result));
        }
    }
}
