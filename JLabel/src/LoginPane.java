import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class LoginPane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JLabel label =new JLabel();
		label.setText("Please enter your username");
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setForeground(Color.blue);//Changing label text color
		label.setFont(new Font ("MV Boli",Font.PLAIN,20));//set font of text
		label.setIconTextGap(200);//Gap between image and text
		label.setBackground(Color.black);
		label.setVerticalAlignment(JLabel.CENTER);//set vertical position of icon + text within label as groter of kleiner maak
		label.setHorizontalAlignment(JLabel.CENTER);
		
		
		JFrame frame = new JFrame();
		frame.setTitle("Main");//setting titles
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit of application
		frame.setResizable(false);//cant make bigger or smaller
		frame.setSize(500,500);//setting size of box 
		frame.setVisible(true);//make frame visible
		//frame.setLayout(null);
		//Adding label to frame
		frame.add(label); // Moet bo pack wees
		frame.pack();//laat alles fit in frane
	}

}
