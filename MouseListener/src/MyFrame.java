import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements MouseListener {
	
	JLabel label;
	MyFrame(){
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(null);
		
		
		//Label
		label = new JLabel ();
		label.setBounds(0,0,100,100);
		label.setBackground(Color.red);
		label.setOpaque(true);
		label.addMouseListener(this);
		
		//adding to frame
		this.add(label);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		//Invoked when the mouse button is clicked (pressed and released) on a component
		System.out.println("you clicked on the label");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// Invoked when a mouse button has been pressed on component
		System.out.println("You pressed the mouse");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		//	Invoked when mouse button has been released on a component
		System.out.println("You release the mouse");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// Invoke when mouse enter a component
		System.out.println("You entered the compoment");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// Invoked when mouse exit a component
		System.out.println("You exit the component");
	}
}
