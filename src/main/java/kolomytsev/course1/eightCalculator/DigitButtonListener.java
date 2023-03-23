package kolomytsev.course1.eightCalculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class DigitButtonListener implements ActionListener {
    private final JTextField textField;

    public DigitButtonListener(JTextField textField) {
        this.textField = textField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();

        StringBuilder stringBuilder = new StringBuilder(textField.getText());
        stringBuilder.append(button.getText());
        textField.setText(stringBuilder.toString());
    }
}
