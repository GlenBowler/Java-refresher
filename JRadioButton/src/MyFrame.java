import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class MyFrame extends JFrame implements ActionListener{
	
	JRadioButton pizzaButton;
	JRadioButton hamburgerButton;
	JRadioButton hotdogButton;
	
	MyFrame(){
		//Radiobutton
		pizzaButton = new JRadioButton("pizza");
		hamburgerButton = new JRadioButton("hamburger");
		hotdogButton = new JRadioButton("hotdog");
		
		ButtonGroup group = new ButtonGroup();
		group.add(hotdogButton);
		group.add(hamburgerButton);
		group.add(pizzaButton);
		
		//add action listener so we can give feedback to user once selected one
		pizzaButton.addActionListener(this);
		hamburgerButton.addActionListener(this);
		hotdogButton.addActionListener(this);
		
		//adding to myFrame
		this.add(pizzaButton);
		this.add(hotdogButton);
		this.add(hamburgerButton);
		
		
		//setting up myframe
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setVisible(true);
		this.pack();
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==pizzaButton) {
			System.out.println("You ordered Pizza");
		}
		else if (e.getSource()==hamburgerButton) {
			System.out.println("You ordered hamburger");
		}
		else if(e.getSource()==hotdogButton) {
			System.out.println("You ordered hotdog");
		}
	}
	
}
