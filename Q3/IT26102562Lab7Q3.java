import java.util.Scanner;

public class IT26102562Lab7Q3
{
	public static void main(String [] args)
	{
		double amountToPay = 0.0;
		double discount = 0.0 ;
		Scanner input = new Scanner(System.in);
		
		for(int customer=1 ; customer<=5 ; customer++)
		{
			System.out.println("Customer "+ customer);
			System.out.print("Enter total bill payment: ");
			int total = input.nextInt();
			System.out.print("Enter mode of payment (C for cash, O for other): ");
			char mode = input.next().charAt(0);
			
			if (mode == 'C' || mode == 'c')
			{
				discount = total * 0.05;
				amountToPay = total*0.95;
				System.out.println("Discount is : " + discount);
				System.out.print("Amount to be Paid : " + amountToPay);
			}
			else if (mode == 'O' || mode == 'o')
			{
				System.out.println("No discount applicable");
				amountToPay = total;
				System.out.print("Amount to be Paid : " + amountToPay);
			}
			else
			{
				System.out.print("Payment mode is not valid");
			}
			
			System.out.println();			
		}
	}
}