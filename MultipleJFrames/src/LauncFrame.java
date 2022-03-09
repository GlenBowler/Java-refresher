import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LauncFrame implements ActionListener{
	JFrame frame = new JFrame();
	JButton button = new JButton("Enter new window");
	LauncFrame (){
		button.setBounds(100,160,200,40);
		button.setFocusable(false);
		button.addActionListener(this);
		frame.add(button);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button) {//if click on button go to new window
			frame.dispose();//close frame when going to next window
			NewWindow newWindow=new NewWindow();
			
		}
	}
}
