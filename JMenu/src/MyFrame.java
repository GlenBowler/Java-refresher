import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyFrame extends JFrame implements ActionListener{
	
	JMenuItem loadItem;
	JMenuItem saveItem;
	
	MyFrame(){
		//setting up menubar
		JMenuBar menuBar= new JMenuBar();
		
		//adding the drop down items
		JMenu fileMenu = new JMenu("File");
		JMenu editMenu = new JMenu("Edit");
		JMenu helpMenu = new JMenu("Help");
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);
		
		//items drop down from file
		loadItem = new JMenuItem ("Load");
		saveItem = new JMenuItem ("Save");
		
		fileMenu.setMnemonic(KeyEvent.VK_F);// alt + f for file 
		loadItem.setMnemonic(KeyEvent.VK_L);//l for load
		saveItem.setMnemonic(KeyEvent.VK_K);//s for save
		
		fileMenu.add(loadItem);
		fileMenu.add(saveItem);
		
		loadItem.addActionListener(this);
		saveItem.addActionListener(this);
		
		//adding to frame
		this.setJMenuBar(menuBar);
		
		
		//Setting up my frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setSize(420,420);
		this.setLayout(new FlowLayout());
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==loadItem) {
			
		}
		else if(e.getSource()==saveItem) {
			
		}
		
	}

}
