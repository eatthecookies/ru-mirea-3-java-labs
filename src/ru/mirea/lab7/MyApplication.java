package ru.mirea.lab7;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyApplication extends JFrame
{
    private int countMilan;
    private int countMadrid;
    JButton but1 = new JButton("AC Milan");
    JButton but2 = new JButton("Real Madrid");
    JLabel lbl1 = new JLabel("Result: 0 X 0");
    JLabel lbl2 = new JLabel("Last Scorer: N/A");
    JLabel lbl3 = new JLabel("Winner: DRAW");

    public MyApplication() {
        super("MyApplication");
        setSize(600,360);
        lbl1.setFont(new Font("Verdana", Font.PLAIN, 20));
        lbl2.setFont(new Font("Verdana", Font.PLAIN, 20));
        lbl3.setFont(new Font("Verdana", Font.PLAIN, 20));
        setLayout(null);

        but1.setBounds(20,70,110,200);
        but2.setBounds(460,70,110,200);

        lbl1.setBounds(230,10,200,100);
        lbl2.setBounds(160,110,300,100);
        lbl3.setBounds(180,210,300,100);

        but1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                countMilan++;
                lbl1.setText("Result: " + countMilan + " X " + countMadrid);
                lbl2.setText("Last Scorer: AC Milan");
                if (countMadrid > countMilan)
                    lbl3.setText("Winner: Real Madrid");
                else if (countMadrid < countMilan)
                    lbl3.setText("Winner: AC Milan");
                else
                    lbl3.setText("Winner: unknown");
            }
            @Override
            public void mousePressed(MouseEvent e) {

            }
            @Override
            public void mouseReleased(MouseEvent e) {

            }
            @Override
            public void mouseEntered(MouseEvent e) {

            }
            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        but2.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                countMadrid++;
                lbl1.setText("Result: " + countMilan + " X " + countMadrid);
                lbl2.setText("Last Scorer: Real Madrid");
                if (countMadrid > countMilan)
                    lbl3.setText("Winner: Real Madrid");
                else if (countMadrid < countMilan)
                    lbl3.setText("Winner: AC Milan");
                else
                    lbl3.setText("Winner: unknown");
            }
            @Override
            public void mousePressed(MouseEvent e) {

            }
            @Override
            public void mouseReleased(MouseEvent e) {

            }
            @Override
            public void mouseEntered(MouseEvent e) {

            }
            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        add(but1);
        add(but2);
        add(lbl1);
        add(lbl2);
        add(lbl3);
    }
    public static void main(String[] args) {
        MyApplication frame = new MyApplication();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
