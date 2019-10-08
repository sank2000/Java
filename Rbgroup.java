import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;
class Rgroup extends JFrame implements ActionListener
{
    JRadioButton rb1,rb2,rb3;
    JButton b1;
    ButtonGroup rbg= new ButtonGroup();
    Rgroup()
    {
        setSize(400, 400);
        setResizable(false);
        setLayout(null);
        setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        rb1=new JRadioButton();
        rb2=new JRadioButton();
        rb3=new JRadioButton();
        b1=new JButton();
        add(rb1);
        rb1.setText("RED");
        rb1.setBounds(257, 76, 60, 23);
        add(rb2);
        rb2.setText("BLUE");
        rb2.setBounds(257, 117, 75, 23);
        add(rb3);
        rb3.setText("GREEN");
        rb3.setBounds(257, 158, 80, 23);
        add(b1);
        b1.setText("Click ME!");
        b1.setBounds(100, 120, 100, 23);
        b1.addActionListener(this);
        rbg.add(rb1);
        rbg.add(rb2);
        rbg.add(rb3);
    }
    public void actionPerformed(ActionEvent e)
    {
        if (rb1.isSelected()) {
            getContentPane().setBackground(Color.RED);
            rb1.setBackground(Color.red);
            rb2.setBackground(Color.red);
            rb3.setBackground(Color.red);
        } else if (rb2.isSelected()) {
            getContentPane().setBackground(Color.BLUE);
             rb1.setBackground(Color.BLUE);
            rb2.setBackground(Color.BLUE);
            rb3.setBackground(Color.BLUE);
        } else if (rb3.isSelected()) {
            getContentPane().setBackground(Color.GREEN);
             rb1.setBackground(Color.GREEN);
            rb2.setBackground(Color.GREEN);
            rb3.setBackground(Color.GREEN);
    }
    }
}
public class Rbgroup {
    public static void main(String[] args) {
        new Rgroup();
    }
}
