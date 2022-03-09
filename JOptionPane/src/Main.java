import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		
		// Diff type op JOptionPane mesg
		//JOptionPane.showMessageDialog(null,"This is the message","My Titlte",JOptionPane.PLAIN_MESSAGE);
		//JOptionPane.showMessageDialog(null,"More information","My Titlte",JOptionPane.INFORMATION_MESSAGE);
		//JOptionPane.showMessageDialog(null,"John is this really you?","My Titlte",JOptionPane.QUESTION_MESSAGE);
		//JOptionPane.showMessageDialog(null,"Your PC has virus","My Titlte",JOptionPane.WARNING_MESSAGE);
		//JOptionPane.showMessageDialog(null,"ERROR!!!","My Titlte",JOptionPane.ERROR_MESSAGE);
		
		
		//Input from user
		//Choice
		JOptionPane.showConfirmDialog(null,"Do you even code?","Question to User",JOptionPane.YES_NO_CANCEL_OPTION );
		//System.out.println(JOptionPane.showConfirmDialog(null,"Do you even code?","Question to User",JOptionPane.YES_NO_CANCEL_OPTION )); 
		// yes =0 , no = 1 , cancel =2 , exit button = -1
		//so can store into a var then do it from there
		
		//Enter user data
		String name =JOptionPane.showInputDialog("What is your name: ");
		
		JOptionPane.showOptionDialog(null, "You are awesome", "Secret message", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, 0);
		//(null in beginning) then message, then title, type of answer, type of message, icon do you want  , response ,0 ) 
	}

}
