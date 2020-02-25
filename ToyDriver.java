
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Random; 
public class ToyDriver { 
 
 
 	public static void main(String[] args) { 
 		Toy toy = new Toy(); 
 		LoopPrompt loop = new LoopPrompt(); 
 		NumberFormat formDoll = new DecimalFormat("##.00");
 		DecimalFormat formTick = new DecimalFormat("00000");
 		Random rand = new Random();
 		
 		System.out.print("Assignment 2: Birthday Toys"); 
		 
 		JOptionPane.showMessageDialog(null,"Howdy, welcome to the Toys R' Us Birthday Brigade!\nThe first emergancy delivery service for birthday boys and girls!"); 
 		
 		double total=0.00;
 		do {
 			
 			/*
 			 * keeps track of the total cost after the first loop, since I cant modify Toy
 			 * and forgot if there's another way to do this
 			 */
 			if (!(toy.getCost()==0)) total+=toy.getCost();
 			
 				//Get name of child
 				String name = JOptionPane.showInputDialog("Who's the lucky kid you're addressing this to?"); 
 		 
 				//Subtly verify the name
 				JOptionPane.showMessageDialog(null, "We`ve addressed the order to \"" + name + "\"."); 
 
 				
 				//Get the age of the child for the Toy class
 				toy.setAge(Integer.parseInt(JOptionPane.showInputDialog("How old will " + name + " be turning?"))); 
 		 
 				//Subtly verify the age
 				JOptionPane.showMessageDialog(null, toy.getAge() + "?!\nGosh, they grow up so fast."); 
 			 
 			do {
 				//Get the name of the toy and pass it to the Toy class
 				toy.setToy(JOptionPane.showInputDialog("Alright, so what's the name of the toy you're getting them?\n(Remember to only use lowercase letters!)")); 
 			 
 				//Verify the toy name
 				JOptionPane.showMessageDialog(null, "Ordering \"" + toy.getToy() + "\""); 
 	
 			} while(!loop.ageP(toy)); //Run loop prompt to verify the toy is age appropriate
 			
 			// Set cost to whatever the toy's cost is
 			toy.setCost(toy.getToy());
 			
 			// Run loop prompt for add card. Then, return response to toy.addCard
 			toy.addCard(loop.cardPrompt(toy));
 			
 			// Run loop prompt for add balloon. Then, return response to toy.addballoon
 			toy.addBalloon(loop.balloonPrompt(toy));
 		} while (loop.TP()==89);
 		
 		// update the total in Toy to match the actual total.
 		toy.addCost(total);
 		int ticket = rand.nextInt(100000);
 		
 		System.out.printf("\n\tYour total is $" + formDoll.format(toy.getCost())); 
 		System.out.printf("\n\tYour order number is: " + formTick.format(ticket));
 		System.out.printf("\n\n\tProgrammer; Ryan Richards");
	} 

 
} 

