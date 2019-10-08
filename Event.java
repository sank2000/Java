import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class Move extends JFrame implements ActionListener,KeyListener
{
    JSeparator js1;
    JLabel l1;
    JPanel p2;
    String str[]={"UP","DOWN","LEFT","RIGHT"};
    Move()
    {
        ImageIcon i1=new ImageIcon("e://1//2.png");
        js1=new JSeparator();
        p2=new JPanel();
        l1 = new JLabel();
        setSize(500,400);
        setVisible(true);
        setResizable(false);
        setLayout(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        p2.setBounds(50,0,400,50);
        l1.setIcon(i1);
        l1.setBounds(100,100,i1.getIconWidth(),i1.getIconHeight());
        add(l1);
        js1.setBounds(0, 50, 500, 2);
        add(js1);
        add(p2);
        p2.setLayout(new GridLayout(1,4,10,0));
        for(int i=0;i<str.length;i++)
        {
            JButton b1=new JButton(str[i]);
            b1.setSize(45, 30);
            b1.addActionListener(this);
            p2.add(b1);
        }
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("UP"))
        {
           if(l1.getY() != 50)
            l1.setBounds(l1.getX(),l1.getY()-25, 100, 100);
        }
        else if(e.getActionCommand().equals("DOWN"))
        {
           if(l1.getY() != 275)
            l1.setBounds(
                    l1.getX(),l1.getY()+25, 100, 100); 
        }
        else if(e.getActionCommand().equals("RIGHT"))
        {
          if(l1.getX() != 375)
                 l1.setBounds(l1.getX()+25,l1.getY(), 100, 100);
        }
        else if(e.getActionCommand().equals("LEFT"))
        {
           if(l1.getX() != 0)
           l1.setBounds(l1.getX()-25,l1.getY(), 100, 100); 
        }
    }
    public void keyPressed(KeyEvent e)
    {
        int keyCode = e.getKeyCode();
        switch(keyCode){ 
            case 38:
                if(l1.getY() != 50)
                    l1.setBounds(l1.getX(),l1.getY()-25, 100, 100); 
                break;
            case 40:
                 if(l1.getY() != 275)
                    l1.setBounds(l1.getX(),l1.getY()+25, 100, 100); 
                break;
            case 37:
                if(l1.getX() != 0)
                    l1.setBounds(l1.getX()-25,l1.getY(), 100, 100); 
                break;
            case 39 :
                if(l1.getX() != 375)
                    l1.setBounds(l1.getX()+25,l1.getY(), 100, 100);
                break;
     }
        
    }
    public void keyReleased(KeyEvent e){}
    public void keyTyped(KeyEvent e) {}
 }
public class Event {
    public static void main(String[] args) {
        new Move();
    }
}
