import java.util.Scanner;

public class ExchangeApp {

	public static void main(String[] args) {
		//TODO: declare local variables
		double amount;
		double rate;
		double conversion;
		String answer = "yes";
		
		//TODO: declare objects
		Exchange myExchange = new Exchange();
		
		do {
		
		//TODO: input
		Scanner sc = new Scanner(System.in);
		System.out.println("\tPlease enter amount to be converted: ");
		amount = sc.nextDouble();

		//TODO: setMethod to put sc value
		
		System.out.println("\nPlease enter \nthe conversion rate: ");
		rate = sc.nextDouble();
	
		//TODO: setMethod
		myExchange.setAmount(amount);
		myExchange.setRate(rate);
		myExchange.compute();
		
		//TODO: process
		double result = myExchange.getConversion();
			
		//TODO: output
		System.out.println(+ amount + " at a rate of " + rate + " is " + result);
		System.out.println();
		
		System.out.println("Would you like to convert one more time (YES or No): ");
		answer = sc.next();
		
		}while(answer.equalsIgnoreCase("yes")) ;
		if(answer.equalsIgnoreCase("no")) {
		System.out.println("Goodbye!");
		}	
		
	}//end main
}//end class)
