package MyPackage;

import java.awt.*;
import javax.swing.*;

public class ThirdGui {
    public static void main(String args[]) {
        JFrame frame = new JFrame("ThirdGui");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        // Создаем панель с GridLayout для размещения двух панелей
        JPanel mainPanel = new JPanel(new GridLayout(1, 2));

        JPanel panel1 = new JPanel();
        panel1.setBackground(new Color(51, 172, 172)); // Темно-синий фон
        panel1.setPreferredSize(new Dimension(300, 400));

        // Создаем надпись для первой панели
        JLabel label1 = new JLabel("Black");
        label1.setForeground(new Color(225, 13, 13)); // Белый текст
        label1.setFont(new Font("Serif", Font.BOLD, 24)); // Размер и стиль шрифта

        // Загружаем изображение для первой панели
            ImageIcon imageIcon1 = new ImageIcon("C:/Users/kovko/Downloads/Porsche.jpg");
        JLabel imageLabel1 = new JLabel(imageIcon1);

        // Добавляем надпись и изображение на первую панель
        panel1.add(label1);
        panel1.add(imageLabel1);

        // Создаем вторую панель
        JPanel panel2 = new JPanel();
        panel2.setBackground(new Color(110, 30, 140)); // Темно-красный фон
        panel2.setPreferredSize(new Dimension(300, 400));

        // Создаем надпись для второй панели
        JLabel label2 = new JLabel("Grey");
        label2.setForeground(Color.WHITE); // Желтый текст
        label2.setFont(new Font("Serif", Font.BOLD, 24)); // Размер и стиль шрифта

        // Загружаем изображение для второй панели
        ImageIcon imageIcon2 = new ImageIcon("C:/Users/kovko/Downloads/bmw_e39.jpg/");
        JLabel imageLabel2 = new JLabel(imageIcon2);

        // Добавляем надпись и изображение на вторую панель
        panel2.add(label2);
        panel2.add(imageLabel2);

        // Добавляем обе панели на основную панель
        mainPanel.add(panel1);
        mainPanel.add(panel2);

        // Добавляем основную панель к фрейму
        frame.getContentPane().add(mainPanel);

        // Упакуем во фрейм
        frame.pack();
        frame.setVisible(true);
    }
}