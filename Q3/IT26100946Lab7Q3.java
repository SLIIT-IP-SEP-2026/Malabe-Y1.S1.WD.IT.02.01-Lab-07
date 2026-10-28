import java.util.Scanner;
public class IT26100946Lab7Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.println("Customer " + i);
            
            System.out.print("Enter totalal bill amount: ");
            double total = sc.nextDouble();

            System.out.print("Enter mode of payment (C for cash, O for other): ");
            char paymeth = sc.next().charAt(0);
            if (paymeth == 'C' || paymeth == 'c') {
                double discount = total * 0.05;
                double amountToBePaid = total - discount;                
                System.out.println("Discount is : " + discount);
                System.out.println("Amount to be paid: " + amountToBePaid);
            } else if (paymeth == 'O' || paymeth == 'o') {
                System.out.println("No discount applicable");
                System.out.println("Amount to be paid: " + total);
            } else {
                System.out.println("Payment Mode is Not Valid");
            }

            System.out.println(); 
        }

        sc.close();
    }
}