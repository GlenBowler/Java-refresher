import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setTitle("Home page");//setting titles
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit of application
		frame.setResizable(false);//cant make bigger or smaller
		frame.setSize(420,420);//setting size of box 
		frame.setVisible(true);//make frame visible
		
		ImageIcon image = new ImageIcon("/JFrame/Coding-Becomes-Criminal.jpg.webp");//getting image from file
		frame.setIconImage(image.getImage());//change icon of frame 
		frame.getContentPane().setBackground(Color.blue);//change the background color
		//frame.getContentPane().setBackground(new Color(123,50,250);  rgb colorings
		}

}
