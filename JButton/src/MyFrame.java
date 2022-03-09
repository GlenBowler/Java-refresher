import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame /*implements ActionListener*/{
	JButton button;
	MyFrame(){
		
		button= new JButton();
		button.setBounds(200,200,100,50);
		
		// if we used implements and method we create
		//button.addActionListener(this);
		//Same as above just less coding 
		button.addActionListener(e->System.out.println("Clicked on"));
		
		button.setText("Click on me");
		button.setFocusable(false);//fit all the text in button
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
		
		
		this.add(button);
	}
	
	

	
	/*
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button) {
			System.out.println("Clicked on");
		}
	}*/
}
