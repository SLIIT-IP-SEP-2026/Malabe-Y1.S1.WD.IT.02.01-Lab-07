import java.util.Scanner;

public class IT26102684Lab7Q3 {
	
    public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
			
            System.out.print("Enter total bill amount for customer " + i + ": ");
            double bill = sc.nextDouble();

            System.out.print("Enter payment mode (C/c for Cash, O/o for Other): ");
            char mode = sc.next().charAt(0);

            if (mode == 'C' || mode == 'c') {
				
                double discount = bill * 0.05;
				
                double amountToPay = bill - discount;
				
                System.out.println("Discount: " + discount);
				
                System.out.println("Amount to Pay: " + amountToPay);
				
            } else if (mode == 'O' || mode == 'o') {
                System.out.println("No discount applied.");
                System.out.println("Amount to Pay: " + bill);
				
            } else {
                System.out.println("Payment Mode is Not Valid");
            }

            System.out.println(" ");
        }

        
    }
}
