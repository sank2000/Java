import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Flames extends JFrame
{
    JLabel l1,l2,l3;
    JButton b1=new JButton();
    JTextField f1,f2,f3;
    Flames()
    {
        l1=new JLabel();
        l2=new JLabel();
        l3=new JLabel();
        f1=new JTextField();
        f2=new JTextField();
        f3=new JTextField();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBackground(new Color(255, 0, 255));
        setResizable(false);
        setLayout(null);
        setVisible(true);
        setSize(381,340);
        l1.setFont(new Font("Times New Roman", 0, 18));
        l1.setText("FLAMES");
        add(l1);
        l1.setBounds(154, 11, 195, 38);
        l2.setFont(new Font("Times New Roman", 2, 18));
        l2.setText("Second Name");
        add(l2);
        l2.setBounds(27, 129, 106, 36);
        l3.setFont(new Font("Times New Roman", 2, 18));
        l3.setText("First Name");
        add(l3);
        l3.setBounds(35, 67, 106, 36);
        add(f2);
        f2.setBounds(151, 129, 207, 41);
        add(f1);
        f1.setBounds(151, 67, 207, 41);
        b1.setText("Find");
        b1.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent evt) 
            {
                String str1,str2,str="flames";
                int count=0,len1,len2,f_count,temp;
                str1=f1.getText();
                str2=f2.getText();
                str1=str1.replace(" ","").toLowerCase();
                str2=str2.replace(" ","").toLowerCase();
                len1=str1.length();
                len2=str2.length();
                int arr[]=new int[len2];
                for(int i=0;i<len1;i++)
                    for(int j=0;j<len2;j++)
                    {
                        if(str1.charAt(i)==str2.charAt(j) && arr[j]==0)
                        {
                            count++;
                            arr[j]=1;
                            break;
                        }
                    }
                f_count=(len1-count)+(len2-count);
                if(f_count==0)
                    System.out.println("Oops Same name");
                else
                {
                    while(str.length()!=1)
                    {
                        temp = (f_count % str.length())-1;
                        if(temp==-1)
                            str=str.substring(0,str.length()-1);                   
                        else
                        {
                            String temp1,temp2;
                            temp1=str.substring(0,temp);
                            temp2=str.substring(temp+1);
                            str=temp2+temp1;
                        }
                    }
                }
                switch(str.charAt(0))
                {
                    case 'f':
                        f3.setText("Friends");
                        break;
                    case 'l':
                        f3.setText("Lover");
                        break;
                    case 'a':
                        f3.setText("Affection");
                        break;
                    case 'm':
                        f3.setText("Marriage");
                        break;
                    case 'e':
                        f3.setText("Enimes");
                        break;
                    case 's':
                        f3.setText("Siblings");
                        break;
                }
                    }
                });
                add(b1);
                b1.setBounds(135, 186, 123, 31);
                f3.setEditable(false);
                f3.setFont(new Font("Times New Roman", 2, 24)); // NOI18N
                f3.setForeground(new Color(255, 51, 255));
                add(f3);
                f3.setBounds(27, 233, 334, 56);
    }
    public static void main(String[] args) 
    {
        new Flames();
    }
}
