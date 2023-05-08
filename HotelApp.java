// EXAM PAPER QUESTIION 2017-2018
// Adam Plesca
// 8/5/23

import javax.swing.JOptionPane;

public class HotelApp{
	public static void main(String args[]){
		//data variables (not assigned yet)
	 	String name, email, allowed;
		int age, nights, price;
		//object created to make the main class recognise and use the methods in the Hotel clas (link)
		Hotel Cons = new Hotel();
		//gets user input for name, sends to instantiable class
		name = JOptionPane.showInputDialog(null, "Enter your name: ");
		Cons.setName(name); //sets name
		//gets user input for age, sends to instantiable class to calculate if they can book at this establishment
		age = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your age: "));
		Cons.setAge(age);
		//gets how many nights they want to stay
		nights = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter how many nights your staying: "));
		Cons.setNights(nights);
		//gets users email and checks to see if there is an @ symbol in the Hotel class
		email = JOptionPane.showInputDialog(null, "Enter your email: ");
		Cons.setEmail(email);
		//calls the compute method in order to start the calculations
		Cons.compute();
		//asiggns left over variables and calls the getters for them to get back the value that was calculated
		price = Cons.getPrice();
		allowed = Cons.getAllowed();
		//selection statement if the user is eligeble to book a room
		if(email == allowed){
			JOptionPane.showMessageDialog(null, "Here is the price for the total nights of your stay: $"+price);
		}
		else if(email != allowed){
			JOptionPane.showMessageDialog(null, "You have either: \nNot entered a valid email(it must contain an @ symbol)\nOR\nYou are not old enough to book at our establishment.");
		}
	}
}