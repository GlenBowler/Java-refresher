import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener {
	JComboBox comboBox;
	
	MyFrame(){
		String [] animals = {"dogs","cats","fish"};
		comboBox = new JComboBox(animals);
		comboBox.addActionListener(this);
		comboBox.addItem("Horse"); // adding to combo box
		//adding to frame
		this.add(comboBox);
		
		//Setting up my frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.pack();
		this.setVisible(true);
		
		 
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==comboBox) {
			System.out.println(comboBox.getSelectedItem());
		}
		
	}

}
