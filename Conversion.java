import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Conversion  {

	public static void main(String[] args) {
		JFrame f = new JFrame("Conversion");
		Label l1 = new Label("Miles");
		Label l2 = new Label("Kilometers");
		TextField t1 = new TextField(7);
		TextField t2 = new TextField(7);
		Button b = new Button("Convert!");
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(b);
		f.setLayout(new GridLayout(1,1));
		b.addActionListener(new ActionListener()
                {
                public void actionPerformed(ActionEvent ae)
                {
                        Double d = Double.parseDouble(t1.getText());
                        Double d1 = 1.609 * d;
                        t2.setText(d1+"");

                }
                }
                );
		
		f.setResizable(false);
		//f.setSize(300, 150);
                f.pack();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	

}