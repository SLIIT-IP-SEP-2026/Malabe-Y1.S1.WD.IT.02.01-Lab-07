
import java.util.Scanner;

public class IT26102740Lab7Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double bill, discount, amount;
        char mode;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Customer " + i);

            System.out.print("Enter total bill amount: ");
            bill = input.nextDouble();

            System.out.print("Enter mode of payment (C for cash, O for other): ");
            mode = input.next().charAt(0);

            if (mode == 'C' || mode == 'c') {
                discount = bill * 5 / 100;
                amount = bill - discount;

                System.out.println("Discount is : " + discount);
                System.out.println("Amount to be paid: " + amount);
            } 
            else if (mode == 'O' || mode == 'o') {
                System.out.println("No discount applicable");
                System.out.println("Amount to be paid: " + bill);
            } 
            else {
                System.out.println("Payment Mode is Not Valid");
            }

            System.out.println();
        }
    }
}
