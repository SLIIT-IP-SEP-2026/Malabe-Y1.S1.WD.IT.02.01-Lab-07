import java.util.Scanner;

public class IT26102493Lab7Q3
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		double totBill;
		char paymentMode;
		double discount;
		
		
		for(int customer = 1; customer <= 5; customer++)
		{
			System.out.println("Customer " + customer);
			
			System.out.print("Enter Total Bill amount : ");
			totBill = input.nextDouble();
			
			System.out.print("Enter mode of payment (C for cash, O for other) : ");
			paymentMode = input.next().charAt(0); 
			
			if(paymentMode == 'C' || paymentMode == 'c')
			{
				discount = (totBill * 5)/100;
				System.out.println("Discount is " + discount);
				
				double amount = totBill - discount;
				
				System.out.println("Amount to be Paid : " + amount);
				
			}
			
			else if (paymentMode == 'O' || paymentMode == 'o')
			{
				System.out.println("No discount is applicable");
				System.out.println("Amount to be Paid : " + totBill);
			
			}
			 
			else
			{
				System.out.print("Payment Mode is Not Valid");

			}
			
			System.out.println();
		}
	}
}
			
				
				
			
			
			
			