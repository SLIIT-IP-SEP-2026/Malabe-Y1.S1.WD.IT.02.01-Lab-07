import java.util.Scanner;

public class IT26102670Lab7Q3
{
	public static void main(String[] args)
	{
		final double DISCOUNT_RATE = 0.05;
		final int NUMBER_OF_CUSTOMERS = 5;
		
		double billAmount, amountToPay;
		char paymentMode;
		
		double discount = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for (int customerCount = 1; customerCount <= NUMBER_OF_CUSTOMERS; customerCount++)
		{
			System.out.println("Customer" + customerCount);
			
			System.out.print("Enter total bill amount:");
			billAmount = sc.nextDouble();
			
			System.out.print("Enter mode of payment (C for cash, 0 for other):" );
			paymentMode = sc.next().toUpperCase().charAt(0);
			
			if (paymentMode == 'C')
			{
				discount = billAmount*DISCOUNT_RATE;
				amountToPay = billAmount - discount;
				
				System.out.println("Discount is :" + discount);
				System.out.println("Amount to be paid :" + amountToPay);
			}
			else if (paymentMode == 'O')
			{
				amountToPay = billAmount;
				
				System.out.println("No discount applicable");
				System.out.println("Amount to be paid :" + amountToPay);
			}
			else
			{
				System.out.println("Payment Mode is Not Vail");
				System.out.println();
				
				continue;
			}
			System.out.println();
		}
	}
}
				
				
				
