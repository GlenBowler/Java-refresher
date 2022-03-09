import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class myFrame extends JFrame implements ActionListener{
	JButton button;
	myFrame(){
		button = new JButton("Click me");
		button.addActionListener(this);
		
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.pack();
		this.setVisible(true);
		
		this.add(button);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==button) {
			
			JFileChooser fileChooser = new JFileChooser();
			int resp = fileChooser.showOpenDialog(null);//select file to open
			if (resp ==JFileChooser.APPROVE_OPTION) { // same as setting equal to 0
				File file = new File (fileChooser.getSelectedFile().getAbsolutePath());
				System.out.println(file);
			}
		}
		
	}
	
}
