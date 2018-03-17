package programs;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class But extends Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		But obj=new But();
		obj.setSize(300,300);
		obj.setVisible(true);
	}

		But()
		{
			Button b=new Button("OK");
			add(b);
			b.addActionListener(new ActionListener()
					{
					public void actionPerformed(ActionEvent ae)
					{
				       System.exit(0);
					}
					}
					);
		}
	

}
