package Home_Works.lesson_8;

import javax.swing.*;
import java.awt.*;

public class My_collection_of_works {

    public static void main(String[] args) {
        new MyWindow2();
    }
}

class MyWindow2 extends JFrame {
    public MyWindow2() {
        setTitle("Test Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);

        JButton button = new JButton("Button 1 (PAGE_START)");
        add(button, BorderLayout.PAGE_START);


        button = new JButton("Button 2 (CENTER)");
        button.setPreferredSize(new Dimension(200, 1000));
        add(button, BorderLayout.CENTER);

        button = new JButton("Button 3 (LINE_START)");
        add(button, BorderLayout.LINE_START);

        button = new JButton("Long-Named Button 4 (PAGE_END)");
        add(button, BorderLayout.PAGE_END);

        button = new JButton("5 (LINE_END)");
        add(button, BorderLayout.LINE_END);
        pack();
        setVisible(true);
    }
}