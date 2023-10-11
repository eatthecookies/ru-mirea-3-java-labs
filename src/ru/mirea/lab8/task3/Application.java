package ru.mirea.lab8.task3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Application extends JFrame {
    private ImageIcon[] frames;
    private int currentFrameIndex = 0;
    private JLabel animationLabel;
    public Application()
    {
        super("Application");
        setSize(270, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frames = new ImageIcon[]{
                new ImageIcon("src/ru/mirea/lab8/task3/1.jpg"),
                new ImageIcon("src/ru/mirea/lab8/task3/2.jpg"),
                new ImageIcon("src/ru/mirea/lab8/task3/3.jpg"),
                new ImageIcon("src/ru/mirea/lab8/task3/4.jpg"),
        };

        animationLabel = new JLabel(frames[0]);
        add(animationLabel);

        Timer timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentFrameIndex = (currentFrameIndex + 1) % frames.length;
                animationLabel.setIcon(frames[currentFrameIndex]);
            }
        });

        timer.start();

        setVisible(true);
    }
}