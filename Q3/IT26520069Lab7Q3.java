
import java.util.Scanner;

public class IT26520069Lab7Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Customer " + i);

            System.out.print("Enter total bill amount: ");
            double bill = input.nextDouble();

            System.out.print("Enter mode of payment (C for cash, O for other): ");
            char mode = input.next().charAt(0);

            double discount = 0;
            double amountToPay = bill;

            if (mode == 'C' || mode == 'c') {
                discount = bill * 0.05;
                amountToPay = bill - discount;

                System.out.println("Discount is : " + discount);
                System.out.println("Amount to be paid: " + amountToPay);

            } else if (mode == 'O' || mode == 'o') {
                System.out.println("No discount applicable");
                System.out.println("Amount to be paid: " + amountToPay);

            } else {
                System.out.println("Payment Mode is Not Valid");
            }

            System.out.println();
        }

        input.close();
    }
}
