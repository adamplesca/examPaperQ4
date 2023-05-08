// EXAM PAPER QUESTIION 2017-2018
// Adam Plesca
// 8/5/23

public class Hotel{
	//data members (only visible to this class)
	private String name, email, allowed;
	private int age, nights, price;
	//constructor, assigns values to varibales
	public Hotel(){
		name = "";
		email = "";
		age = 0;
		nights = 0;
		price = 0;
		allowed = "";
	}
	//setters, these set values that are input in the main class by the user(one for each input by the user)
	public void setName(String name){
		this.name = name;
	}
	public void setEmail(String email){
			this.email = email;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setNights(int nights){
		this.nights = nights;
	}
	//calculates if the users info(input) is eligeble
	public void compute(){
	    if (age >= 18) {
	        boolean foundAtSymbol = false;
	        for (int i = 0; i < email.length(); i++) {
	            if (email.charAt(i) == '@') {
	                foundAtSymbol = true;
	                break;
	            }
	        }
	        if (foundAtSymbol) {
	            allowed = email;
	            price = nights * 90;
	        }

	    }
	}
	//getters, they get back a value to the main method to complete the whole application.
	public int getPrice(){
		return price;
	}
	public String getAllowed(){
		return allowed;
	}
}