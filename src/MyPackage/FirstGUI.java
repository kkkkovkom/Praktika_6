package MyPackage;

import java.awt.*;
import javax.swing.*;

public class FirstGUI {
    public static void main(String args[]) {
        JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 150);
//создали панель
        JPanel panel= new JPanel();
//задали свойство панели – цвет фона
        panel.setBackground(new Color(0, 0, 0));
// задали свойство панели размеры
        panel.setPreferredSize( new Dimension(200,300));

        JLabel label = new JLabel("Привет МИР!!!");

        // Задали цвет текста
        label.setForeground(new Color(255, 255, 255));

        // Добавили надпись на панель
        panel.add(label);

//добавили панель к фрейму
        frame.getContentPane().add(panel);
//упакуем во фрейм
        frame.pack();
        frame.setVisible(true);
    }

}
