import java.util.Scanner;
public class IT26300571Lab7Q3 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		final double disRate = 0.05;
		final int noOfCustomers = 5;
		double amountToPay;
		
		for ( int customerCount =1; customerCount < noOfCustomers ; customerCount++) {
			System.out.println( "customer:" + customerCount);
			
		System.out.println(" Enter the total bill amount :");
		double totBillAmount = input.nextDouble();
			
			System.out.println( " Enter the mode of payment ( C for cash , O for other) :" );
			char modeOfPay = input.next().toUpperCase().charAt(0);
			
			if (modeOfPay == 'C' ) {
				
				double disAmount = totBillAmount * disRate;
				amountToPay = totBillAmount - disAmount;
				
				System.out.println("Discount is :" + disAmount);
				System.out.println("Amount to be paid is :" + amountToPay);
				
			}
			else if (modeOfPay =='O'){
				amountToPay = totBillAmount;
				System.out.println("No discount applicable");
				System.out.println("Amount to be paid :" + amountToPay);
			}
			else { 
			System.out.println("Payment mode not valid");
			System.out.println();
			
			continue;
			}
			System.out.println();
		}
	}
}

				
				
				
			
			
			
			
		