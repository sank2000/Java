import java.awt.*;
import javax.swing.*;
import javax.script.*;
import java.awt.event.*;
class Calc extends JFrame implements ActionListener
{
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19;
    JTextField t1;
    Integer num;
    boolean check=false,add=false,point=false;
    Calc()
    {
        t1 = new JTextField();
        b1 = new JButton();
        b3 = new JButton();
        b2 = new JButton();
        b4 = new JButton();
        b5 = new JButton();
        b6 = new JButton();
        b7 = new JButton();
        b8 = new JButton();
        b9 = new JButton();
        b10 = new JButton();
        b11 = new JButton();
        b12 = new JButton();
        b13 = new JButton();
        b14 = new JButton();
        b15 = new JButton();
        b16 = new JButton();
        b19 = new JButton();
        b17 = new JButton();
        b18 = new JButton();
        getContentPane().setBackground(Color.GRAY);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(480,330);
        setLayout(null);
        setVisible(true);
        setResizable(false);
        t1.setHorizontalAlignment(JTextField.RIGHT);
        t1.setFont(new Font("Arial Black",Font.BOLD,22));
        t1.setEditable(false);
        add(t1);
        t1.setBounds(10, 10, 440, 70);
        b1.setText("9");
        add(b1);
        b1.setBounds(10, 90, 80, 40);
        b1.addActionListener(this);
        b2.setText("8");
        add(b2);
        b2.setBounds(100, 90, 80, 40);
        b2.addActionListener(this);
        b3.setText("7");
        add(b3);
        b3.setBounds(190, 90, 80, 40);
        b3.addActionListener(this);
        b4.setText("/");
        add(b4);
        b4.setBounds(280, 90, 80, 40);
        b4.addActionListener(this);
        b5.setText("4");
        add(b5);
        b5.setBounds(10, 140, 80, 40);
        b5.addActionListener(this);
        b6.setText("5");
        add(b6);
        b6.setBounds(100, 140, 80, 40);
        b6.addActionListener(this);
        b7.setText("6");
        add(b7);
        b7.setBounds(190, 140, 80, 40);
        b7.addActionListener(this);
        b8.setText("+");
        add(b8);
        b8.setBounds(280, 240, 80, 40);
        b8.addActionListener(this);
        b9.setText("1");
        add(b9);
        b9.setBounds(10, 190, 80, 40);
        b9.addActionListener(this);
        b10.setText("2");
        add(b10);
        b10.setBounds(100, 190, 80, 40);
        b10.addActionListener(this);
        b11.setText("3");
        add(b11);
        b11.setBounds(190, 190, 80, 40);
        b11.addActionListener(this);
        b12.setText("-");
        add(b12);
        b12.setBounds(280, 190, 80, 40);
        b12.addActionListener(this);
        b13.setText(".");
        add(b13);
        b13.setBounds(10, 240, 80, 40);
        b13.addActionListener(this);
        b14.setText("0");
        add(b14);
        b14.setBounds(100, 240, 80, 40);
        b14.addActionListener(this);
        b15.setText("%");
        add(b15);
        b15.setBounds(190, 240, 80, 40);
        b15.addActionListener(this);
        b16.setText("*");
        add(b16);
        b16.setBounds(280, 140, 80, 40);
        b16.addActionListener(this);
        b17.setText("CLR");
        add(b17);
        b17.setBounds(370, 90, 80, 40);
        b17.addActionListener(this);
        b18.setText("SCI");
        add(b18);
        b18.setBounds(370, 140, 80, 40);
        b18.addActionListener(this);
        b19.setText("=");
        add(b19);
        b19.setBounds(370, 190, 80, 90);
        b19.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e)
    {
    	if(check)
    	{
    		t1.setText("");
    		check=false;
    		
    	}
        if(e.getActionCommand().equals("1"))
            t1.setText(t1.getText()+"1");
        else if(e.getActionCommand().equals("2"))
            t1.setText(t1.getText()+"2");
        else if(e.getActionCommand().equals("3"))
            t1.setText(t1.getText()+"3");
        else if(e.getActionCommand().equals("4"))
            t1.setText(t1.getText()+"4");
        else if(e.getActionCommand().equals("5"))
            t1.setText(t1.getText()+"5");
        else if(e.getActionCommand().equals("6"))
            t1.setText(t1.getText()+"6");
        else if(e.getActionCommand().equals("7"))
            t1.setText(t1.getText()+"7");
        else if(e.getActionCommand().equals("8"))
            t1.setText(t1.getText()+"8");
        else if(e.getActionCommand().equals("9"))
            t1.setText(t1.getText()+"9");
        else if(e.getActionCommand().equals("0"))
            t1.setText(t1.getText()+"0");
        else if(e.getActionCommand().equals("."))
        {
            t1.setText(t1.getText()+".");
            point = true;
        }
        else if(e.getActionCommand().equals("+"))
              t1.setText(t1.getText()+"+");
        else if(e.getActionCommand().equals("-"))
              t1.setText(t1.getText()+"-");
        else if(e.getActionCommand().equals("*"))
              t1.setText(t1.getText()+"*");
        else if(e.getActionCommand().equals("/"))
        {	
            t1.setText(t1.getText()+"/");
            point = true;
        }
        else if(e.getActionCommand().equals("CLR"))
            t1.setText("");
        else if(e.getActionCommand().equals("%"))
        {
            num = eval();
            if(num!=null)
               t1.setText(t1.getText()+"  = "+(num*0.01)+"%");
        }
        else if(e.getActionCommand().equals("="))
        {
        	if(point) 
        	{
        		ScriptEngineManager obj = new ScriptEngineManager();
                ScriptEngine obj1 = obj.getEngineByName("JavaScript");
                String s = t1.getText();
                try {
                	 t1.setText(t1.getText()+"  = "+obj1.eval(s));
                	 point=false;
                }
                catch(Exception t)
                {
                    t1.setText("Wrong format");
                }
               
        	}
            else
            {
	            num = eval();
	            if(num!=null)
	               t1.setText(t1.getText()+"  = "+num);
	            check=true;
            }
        }
        else if(e.getActionCommand().equals("SCI"))
        {
            num=eval();
            check=true;
            Calc cobj=this;
            Sci obj = new Sci(this);
            if(num!=null)
            {
                JPopupMenu pop = new JPopupMenu();
                String[] str ={"SIN","COS","TAN","SQRT","SQUARE","LOG","LOG 10","EXP"};
                for(int i=0;i<str.length;i++)
                {
                	JMenuItem b= new JMenuItem(str[i]);
                    b.addActionListener(obj);
                    pop.add(b);
                }
                pop.show(cobj,400,200);
            }
                
         }
      }   
    Integer eval()
    {
        ScriptEngineManager obj = new ScriptEngineManager();
        ScriptEngine obj1 = obj.getEngineByName("JavaScript");
        String s = t1.getText();
        try
        {
            return (Integer)obj1.eval(s);
        }
        catch(Exception t)
        {
            t1.setText("Wrong format");
            System.out.println(t);
            return null;
        }
    }
}

class Sci extends JFrame implements ActionListener
{
    Calc obj;
    Sci(Calc C)
    {
        obj=C;
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("COS"))
            obj.t1.setText("COS("+(obj.t1.getText())+") = "+Math.cos(obj.num));
        else if(e.getActionCommand().equals("SIN"))
            obj.t1.setText("SIN("+(obj.t1.getText())+") = "+Math.sin(obj.num));
        else if(e.getActionCommand().equals("LOG"))
            obj.t1.setText("log("+(obj.t1.getText())+") = "+Math.log(obj.num));
        else if(e.getActionCommand().equals("SQRT"))
            obj.t1.setText("SQRT("+(obj.t1.getText())+") = "+Math.sqrt(obj.num));
        else if(e.getActionCommand().equals("TAN"))
            obj.t1.setText("TAN("+(obj.t1.getText())+") = "+Math.tan(obj.num));
        else if(e.getActionCommand().equals("SQUARE"))
            obj.t1.setText("SQUARE("+(obj.t1.getText())+") = "+(obj.num*obj.num));
        else if(e.getActionCommand().equals("LOG 10"))
            obj.t1.setText("LOG 10("+(obj.t1.getText())+") = "+Math.log10(obj.num));
        else if(e.getActionCommand().equals("EXP"))
            obj.t1.setText("EXP("+(obj.t1.getText())+") = "+Math.exp(obj.num));
    }
}
public class Calculator
{
    public static void main(String[] args) {
        new Calc();
    }
}