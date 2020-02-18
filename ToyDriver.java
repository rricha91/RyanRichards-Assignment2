import javax.swing.JOptionPane;
public class ToyDriver {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,"Welcome to CMSC 03");
		String name = JOptionPane.showInputDialog("Enter Your Name: ");
		
		JOptionPane.showMessageDialog(null, "You entered " + name);
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
		JOptionPane.showMessageDialog(null, "Hi " + "! You are " + age + " years old.");
	}

}
