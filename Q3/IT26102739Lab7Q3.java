import java.util.Scanner;

public class IT26102739Lab7Q3
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		//Declare & Initialize the variables
		final int NUMBER_OF_CUSTOMERS = 5;
		final double DISCOUNT_RATE = 0.05;
		
		double billAmount = 0;
		double amountToPay = 0;
		double paymentMode = 0;
		double discount = 0;
		
		// Simpler way - for(int i = 1; i <= 5; i++), and we can print it as ("Customer " + i)
		// Loop iteration for 5 customers 
	
		for(int customerCount = 1; customerCount <= NUMBER_OF_CUSTOMERS; customerCount++)
		{
			System.out.println("Customer " + customerCount);
		
			//Input the total bill amount
			System.out.print("Enter total bill amount: ");
			billAmount = input.nextDouble();
			
			//Input the mode of payment 
			System.out.print("Enter mode of payment (C for Cash, O for other): ");
			paymentMode = input.next().charAt(0);
			
			//Check the mode of payment & calculate the discount
			if(paymentMode == 'C' || paymentMode == 'c')
			{
				//Calculate the 5% discount for the cash payments 
				discount = billAmount * DISCOUNT_RATE;
				amountToPay = billAmount - discount;
				
				System.out.println("Discount is: " + discount);
				System.out.println("Amount to be  paid: " + amountToPay);
				System.out.print("\n"); 
			}
			else if(paymentMode == 'O' || paymentMode == 'o')
			{
				//No discount for other payment modes
				amountToPay = billAmount;
				
				System.out.println("No discount is Applicable");
				System.out.println("Amount to be paid: " + amountToPay);
				System.out.print("\n"); 
			}
			else
			{
				//For Invalid mode of payment
				System.out.println("Payment Mode is not Valid");
			}
			//Print a blank line to seperate the 5 customers
			System.out.print("\n"); 
		}
	}
}