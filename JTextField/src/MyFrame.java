import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;



public class MyFrame extends JFrame implements ActionListener {
	
	JButton button;
	JTextField textField;
	MyFrame(){
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(250,40));
		
		
		button = new JButton ("Submit");
		button.addActionListener(this);
		
		this.add(textField);
		this.add(button);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.pack();
		this.setSize(420,420);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			textField.getText(); 
		}
		
	}
}
