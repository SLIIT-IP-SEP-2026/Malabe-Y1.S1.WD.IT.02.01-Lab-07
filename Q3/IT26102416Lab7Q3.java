import java.util.Scanner;

public class IT26102416Lab7Q3 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		for(int i = 1;i <= 5; i++) {
			
			double totalBill;
			double discount;
			double amountToPay;
			char paymentMode;
			
			System.out.println("customer " + i);
			
			System.out.print("Enter total bill amount: ");
			totalBill = input.nextDouble();
			
			System.out.print("Enter mode of payment ( C for cash,0 for other): ");
			paymentMode = input.next().charAt(0);
			
			if (paymentMode == 'C' || paymentMode == 'c') {
				
				discount = totalBill * 0.05;
				amountToPay = totalBill - discount;
				
				
				System.out.println("Discount is : " + discount);
				System.out.println("Amount to be paid: " + amountToPay);
				
			}
			else if (paymentMode == '0' || paymentMode == '0') {
				
				amountToPay = totalBill;
				
				System.out.println("No discount applicable");
				System.out.println("Amount to be paid: " + amountToPay);
			}
			else {
				
				System.out.println("Payment Mode is Not Vali");
				
			}
			System.out.println();
		}
	}
}	
				
				
				
				
			
				
			
			