package ru.mirea.lab8;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Application extends JFrame{

    public Application()
    {
        super("Application");
        setSize(800, 600);

    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawRect(100, 100, 200, 150); // Рисуем прямоугольник с координатами (100, 100) и размерами 200x150
    }

}
