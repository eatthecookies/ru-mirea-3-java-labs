package ru.mirea.lab8.task2;
import javax.swing.*;
import java.awt.*;
public class Application extends JFrame{
    Image img;
    public Application(String path)
    {
        super("Application");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        img = new ImageIcon(path).getImage();

        setVisible(true);
    }
    public void paint(Graphics g){
        Graphics2D gr = (Graphics2D)g;
        gr.drawImage(img, 0, 0, null);
    }

}
