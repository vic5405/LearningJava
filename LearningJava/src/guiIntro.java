import javax.swing.JOptionPane;

public class guiIntro {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Enter your name");/*This create an input dialog box for user to 
																	  input a value. This will be stored in the string
																	  variable name*/
		JOptionPane.showMessageDialog(null, "Hello "+name);//This creates a dialog box to show the message Hello + name
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter age"));//converts dialog box to integer
		JOptionPane.showMessageDialog(null, "You are "+age+" years old");//shows message + age
		
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter height"));//converts dialog box to double
		JOptionPane.showMessageDialog(null, "You are "+height+" cm tall");//shows message + age
	}

}
