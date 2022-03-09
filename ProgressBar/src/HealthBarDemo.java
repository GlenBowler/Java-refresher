import java.awt.*;
import javax.swing.*;


public class HealthBarDemo {
	JFrame frame = new JFrame();
	JProgressBar healthBar= new JProgressBar();
	
	HealthBarDemo(){
		healthBar.setValue(0);
		healthBar.setBounds(0,0,420,50);
		healthBar.setStringPainted(true); // adding percentage to your bar
		frame.add(healthBar);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		
		fill();
	}
	
	public void fill() {
		int counter = 0;
		
		while(counter<=100) {
			healthBar.setValue(counter);
			try {
				Thread.sleep(1000); // adding this to say add each 1 sec another 10 
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			counter+=10;
		}
	}
}
