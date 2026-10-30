import java.util.Scanner;
public class IT26102776Lab7Q3{

 public static void main (String[] args){
	 
	 // Declare and Initialise Constants
	 final double DISCOUNT_RATE = 0.05; // 5% discount rate
	 final int NUMBER_OF_CUSTOMERS = 5; // Number of customers
	 
	 // Declare the variables
	 double billAmount, amountToPay;
	 char paymentMode;
	 
	 // Declare and Initialise Variables
	 double discount = 0;
	 
	 // Create a scanner object for input
	 Scanner input = new Scanner(System.in);
	 
	 // Process each customers
	 for (int customerCount = 1; customerCount <= NUMBER_OF_CUSTOMERS; customerCount++){
		 
		System.out.println("Customer " + customerCount);
		
	    // Input the total bill amount
		System.out.print("Enter the total bill amount: ");
		billAmount = input.nextDouble();
		
		
	    // Input the mode of payment
		System.out.print("Enter the mode of payment ( C for cach, O for other):");
		paymentMode = input.next().toUpperCase().charAt(0);
		
		// Check the mode of payment and calculate the discount
        if (paymentMode == 'C')	{	
		
		// Apply discount
		discount = billAmount * DISCOUNT_RATE;
		amountToPay = billAmount - discount;
		
		System.out.println("Discount is : " + discount);
		System.out.println("Amount to be paid is : " + amountToPay);
		
		}
		else if (paymentMode == 'O'){
			
			// No discount
			amountToPay = billAmount;
			
			System.out.println("No discount applicable");
			System.out.println("Amount to be paid: " + amountToPay);
			
		}
		else{
			
			// invalid payment mode
			System.out.println("Payment Mode is Not Valid");
			System.out.println();
			
			continue; // Skip to the next customer
		}
		
		System.out.println(); // Print a blank line for better readability
		 
	 }
	 
 }

}