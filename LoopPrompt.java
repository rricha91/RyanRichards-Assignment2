import javax.swing.JOptionPane;
public class LoopPrompt {
	
	//Put scanner in prefix so it still closes
	
	public boolean ageP(Toy toy){
		
		//If the toy is age appropriate, continue driver. 
		//If not, prompt the user to verify their choice.
		if (!toy.ageOK()) {
			char awn;
			
			do {
				awn = Character.toUpperCase(
					JOptionPane.showInputDialog 
					("Aparently \"" + toy.getToy() + "\" arn't marked age appropriate for " + toy.getAge() + " year olds. Is this ok?").charAt(0)
				);
			} while (!valid(awn));
			boolean process = awn==89?true:false;
			
			return process;
		}
		return true;
	}
	
public String cardPrompt(Toy toy){
		
		//Prompts the user if they want to get a card
			char awn;
			do {
				awn = Character.toUpperCase(
					JOptionPane.showInputDialog
					("Would you like me to add a card to your order?").charAt(0)
				);
				
			//verify their awnser works
			} while (!valid(awn));
			
			/* 
			 * if awn=='Y', it will return "yes", 
			 * which will be handed over to the getCard prompt.
			 * 
			 * If not 'Y', it will return an empty string, which will qualify as !"yes"
			 */
			return awn==89?"yes":"";
	}

public String balloonPrompt(Toy toy){
	//Prompts the user if they want to get a card
		char awn;
		do {
			awn = Character.toUpperCase(
				JOptionPane.showInputDialog 
				("And what about a balloon?").charAt(0)
			);
			
		//verify their awnser works
		} while (!valid(awn));
		
		/* 
		 * if awn=='Y', it will return "yes", 
		 * which will be handed over to the getCard prompt.
		 * 
		 * If not 'Y', it will return an empty string, which will qualify as !"yes"
		 */
		return awn==89?"yes":"";
}


	
	public char TP(){
		char awn;		
		do {
			awn = Character.toUpperCase(
					JOptionPane.showInputDialog
					("Would you like to run the program again? (y/n)").charAt(0));
		} while (!valid(awn));
		return awn;
	}

	private boolean valid(char a) {
		if (a==89||a==78) return true;
		else {
			JOptionPane.showMessageDialog(null, "Sorry, I don`t know what that means. Here, le`mme get the prompt set up again for ya.");
			return false;
		}
	}
}
