import java.awt.*;
import javax.swing.*;
import javax.script.*;
import java.awt.event.*;
class Calcul extends JFrame implements ActionListener
{
    JButton b1,b2,b3;
    JTextField t1;
    Integer num;
    boolean check=false,point = false;
    JPanel p1;
    String[] str = {"7","8","9","/","4","5","6","*","1","2","3","-",".","0","%","+"};
    Calcul()
    {
        super("CALCULATOR");
        p1= new JPanel();
        b1= new JButton();
        b2= new JButton();
        b3= new JButton();
        t1=new JTextField(); 
        t1.setHorizontalAlignment(JTextField.RIGHT);
        t1.setFont(new Font("Berlin Sans FB",Font.PLAIN,25));
        t1.setEditable(false);
        add(t1);
        t1.setBounds(10, 10, 450, 70);
        p1.setBounds(10, 90,360,190);
        p1.setBackground(Color.GRAY);
        p1.setLayout(new GridLayout(4,4,10,10));
        for(int i=0;i<str.length;i++)
        {
            JButton b= new JButton(str[i]);
            b.addActionListener(this);
            p1.add(b);
        }
        add(p1);
        b1.setText("CLR");
        add(b1);
        b1.setBounds(380, 90, 80, 40);
        b1.addActionListener(this);
        b2.setText("SCI");
        add(b2);
        b2.setBounds(380, 140, 80, 40);
        b2.addActionListener(this);
        b3.setText("=");
        add(b3);
        b3.setBounds(380, 190, 80, 90);
        b3.addActionListener(this);
        getContentPane().setBackground(Color.GRAY);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(480,330);
        setLayout(null);
        setVisible(true);
        setResizable(false);
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
            check = true;
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
                check=true;
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
            Calcul cobj=this;
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
    Calcul obj;
    Sci(Calcul C)
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
class Calculator
{
    public static void main(String[] args)
    {
        new Calcul();
    }
}
