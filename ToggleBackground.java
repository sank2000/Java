import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class But extends JFrame implements ActionListener
{
    JToggleButton b1= new JToggleButton();
    But()
    {
        super("Toggle Background");
        setSize(400,400);
        setVisible(true);
        setResizable(false);
        setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        b1.setBounds(150, 150, 100, 60);
        b1.addActionListener(this);
        add(b1);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            if(b1.isSelected())
            {
                b1.setText("BLUE");
                getContentPane().setBackground(Color.BLUE);
            }
            else
            {
                b1.setText("BLACK");
                getContentPane().setBackground(Color.BLACK);
            }
        }
    }
}
public class ToggleBackground 
{
    public static void main(String[] args) {
        new But();
    }
}
