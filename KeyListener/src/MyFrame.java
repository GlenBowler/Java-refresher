import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements KeyListener{
	JLabel label;
	ImageIcon icon;
	MyFrame(){
		label = new JLabel();
		label.setBounds(0, 0, 100, 100);
		//label.setBackground(Color.red);
		//label.setOpaque(true);
		
		//icon
		icon = new ImageIcon("rocket.jpg");
		label.setIcon(icon);
		
		this.setVisible(true);
		this.setSize(500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.addKeyListener(this);
		this.getContentPane().setBackground(Color.black);
		
		//Adding to jrame
		this.add(label);
	}
	
	
	@Override
	public void keyTyped(KeyEvent e) {
		// Invoke when key is typed. Use KeyChar, char output
		switch (e.getKeyChar()) {
		case 'a': label.setLocation(label.getX()-10, label.getY());
		break;
		case 'w': label.setLocation(label.getX(), label.getY()-10);
		break;
		case 'd': label.setLocation(label.getX()+10, label.getY());
		break;
		case 's': label.setLocation(label.getX(), label.getY()+10);
		break;
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// when physical key is pressed down. use keycode , int output
		switch (e.getKeyCode()) {
		case 37: label.setLocation(label.getX()-10, label.getY());
		break;
		case 38: label.setLocation(label.getX(), label.getY()-10);
		break;
		case 40: label.setLocation(label.getX(), label.getY()+10);
		break;
		case 39: label.setLocation(label.getX()+10, label.getY());
		break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// When button is released
		System.out.println("You released this key char : "+e.getKeyChar() );
		System.out.println("You released this key code : "+e.getKeyCode() );
		
	}
	
	
}
