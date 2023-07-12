package kolomytsev.course2.four;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
    public MyWindow() {
        setTitle("Test Window");// название
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);// выход по нажатию крестика
        setBounds(300, 300, 400, 400);// размеры окна
        JButton button1 = new JButton("Simple Button #1");// создание кнопок
        JButton button2 = new JButton("Simple Button #2");
        add(button1, BorderLayout.NORTH); // добавоение кнопок в окно

        JTextField textField = new JTextField();
        add(textField, BorderLayout.CENTER);
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println(textField.getText());
            }
        });
        setVisible(true); //Сделать видимым
    }
    public static void main(String[] args) {
        new MyWindow();
    }
}
