import java.util.Scanner;

public class IT26101289Lab7Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {

            System.out.println("Customer " + i);

            System.out.print("Enter total bill amount: ");
            double bill = input.nextDouble();

            System.out.print("Enter payment mode (C/O): ");
            char mode = input.next().charAt(0);

            double discount = 0;
            double amount;

            if (mode == 'C' || mode == 'c') {

                discount = bill * 5 / 100;
                amount = bill - discount;

                System.out.println("Discount: " + discount);
                System.out.println("Amount to pay: " + amount);

            }
            else if (mode == 'O' || mode == 'o') {

                amount = bill;

                System.out.println("Discount: " + discount);
                System.out.println("Amount to pay: " + amount);

            }
            else {

                System.out.println("Payment Mode is Not Valid");

            }
        }

        
    }
}