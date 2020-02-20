import javax.swing.JOptionPane;
public class ToyDriver {

	public static void main(String[] args) {
		Toy toy = new Toy();
		LoopPrompt loop = new LoopPrompt();
		
		System.out.print("Assignment 2: Birthday Toys");
		
		JOptionPane.showMessageDialog(null,"Howdy, welcome to the Toys R' Us Birthday Brigade!\nThe first emergancy delivery service for birthday boys and girls!");
		
		do {
			String name = JOptionPane.showInputDialog("Who's the lucky kid you're addressing this to?");
		
			
			JOptionPane.showMessageDialog(null, "We`ve addressed the order to \"" + name + "\".");

			
			toy.setAge(Integer.parseInt(JOptionPane.showInputDialog("How old will " + name + " be turning?")));
		
			
			JOptionPane.showMessageDialog(null, toy.getAge() + "?!\nGosh, they grow up so fast.");
			
			toy.setToy(JOptionPane.showInputDialog("Alright, so what's the name of the toy you're getting them?\n(Remember to only use lowercase letters!)"));
			
			JOptionPane.showMessageDialog(null, "Ordering \"" + toy.getToy() + "\"...");
		} while(!loop.ageP(toy));
		
		
		
	}

}
