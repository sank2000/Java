
import javax.swing.*;
import java.awt.event.*;
class Example extends JFrame implements ActionListener{
JLabel l1,l2,l3,l4;
JTextField t1,t2,t3;
JButton b1;
public Example() { }
public Example(String s)
{ super(s);}
public void setComponents(){
l1= new JLabel("Addition of two numbers");
l2=new JLabel("First Number");
l3=new JLabel("Second Number");
l4 = new JLabel("Result");
t3=new JTextField();
t1=new JTextField();
t2=new JTextField();
b1=new JButton("Add");
setLayout(null);
l1.setBounds(50,50,200,20);
l2.setBounds(50,80,100,20);
l3.setBounds(50,110,100,20);
t1.setBounds(150,80,100,20);
t2.setBounds(150,110,100,20);
b1.setBounds(100,180,85,20);
l4.setBounds(50,140,200,20);
t3.setBounds(150,140,100,20);
b1.addActionListener(this);
add(l1);
add(l2);
add(t1);
add(l3);
add(t2);
add(t3);
add(b1);
add(l4);
}


public void actionPerformed(ActionEvent e)
{
 int a=Integer.parseInt(t1.getText());
int b=Integer.parseInt(t2.getText());
int s =a+b;
t3.setText(s+" ");
}
}
public class Handler {
public static void main(String[] args)
{
Example jf= new Example("Swing example");
jf.setComponents();
jf.setSize(300,300);
jf.setVisible(true);
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
