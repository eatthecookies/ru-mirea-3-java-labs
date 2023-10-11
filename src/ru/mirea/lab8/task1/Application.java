package ru.mirea.lab8.task1;
import javax.swing.*;

public class Application extends JFrame{

    public Application()
    {
        super("Application");
        add("Center", new MyCanvas());
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

}
