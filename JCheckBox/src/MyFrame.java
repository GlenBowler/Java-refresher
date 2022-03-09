import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{
	
	JCheckBox checkBox;
	JButton button;	
	MyFrame(){
		//button
		button = new JButton();
		button.setText("Submit");
		button.addActionListener(this);
		
		
		//check box details 
		checkBox = new JCheckBox();
		checkBox.setText("I am not a Robot");//details langs die checkbox
		checkBox.setFocusable(false); // haal die details rondom die textbox weg
		
		
		//Setting up my frame
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		this.pack();
		
		//adding to frame
		this.add(checkBox);
		this.add(button);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
	if(e.getSource()==button) {
		checkBox.isSelected();//return true or false
	}
		
	}

}
