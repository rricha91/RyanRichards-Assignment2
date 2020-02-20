import javax.swing.JOptionPane;
public class LoopPrompt {
	
	//Put scanner in prefix so it still closes
	
	public boolean ageP(Toy toy){
		if (!toy.ageOK()) {
			
			char awn;
			
			do {
				Character.toUpperCase(
					awn = JOptionPane.showInputDialog
					("Aparently \"" + toy.getToy() + "\", correct?").charAt(0)
				);
			} while (!valid(awn));
			
			boolean process = awn==89?true:false;
			return process;
		}
		
		return true;
	}
	
	public char TP(){
		char awn;		
		do {
			Character.toUpperCase(
					awn = JOptionPane.showInputDialog
					("Would you like to run the program again? (y/n)").charAt(0));
		} while (!valid(awn));
		return awn;
	}

	private boolean valid(char a) {
		if (a==89||a==78) return true;
		else {
			System.out.print("\tSorry, I don`t know what that means. Here, le`mme get the prompt set up again for ya.");
			return false;
		}
	}
}