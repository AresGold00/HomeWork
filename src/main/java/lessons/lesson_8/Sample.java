package lessons.lesson_8;

import javax.annotation.processing.Generated;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sample {
    public static void main(String[] args) {
        new SampleWindow();
    }

    public static class SampleWindow extends JFrame {
        int counter;
        public SampleWindow() throws HeadlessException {
//            setSize(640, 500);
            setBounds(500,400,640, 500);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
//            setLocation(1000, 400);
            setLocationRelativeTo(null);
            setTitle("My Sample window");
            JPanel panel = new JPanel();
            panel.setLayout(new FlowLayout());
            JButton button1 = new JButton("BUTTON");
            JButton button2 = new JButton("Extra");
            panel.add(button1,BorderLayout.WEST);
            panel.add(button2,BorderLayout.EAST);
            add(panel,BorderLayout.NORTH);
            JLabel label = new JLabel("Press the button");
            label.setFont(new Font("Arial", Font.BOLD, 60));
            add(label);

            button1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
//                    counter--;
                    label.setText("COUNTER:" + --counter);
                }
            });
            button2.addActionListener((e)->label.setText("COUNTER:" + ++counter));
            setVisible(true);
        }
    }
}
