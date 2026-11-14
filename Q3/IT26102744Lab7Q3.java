import java.util.Scanner;

public class IT26102744Lab7Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int c = 1; c <= 5; c++) {
            System.out.println("Customer " + c);
            System.out.print("Enter total bill amount: ");
            double bill = sc.nextDouble();

            System.out.print("Enter mode of payment (C for cash, O for other): ");
            char mode = sc.next().charAt(0);

            if (mode == 'C' || mode == 'c') {
                double discount = bill * 0.05;
                System.out.println("Discount is : " + discount);
                System.out.println("Amount to be paid: " + (bill - discount));
            } else if (mode == 'O' || mode == 'o') {
                System.out.println("No discount applicable");
                System.out.println("Amount to be paid: " + bill);
            } else {
                System.out.println("Payment Mode is Not Valid");
            }
            System.out.println();
        }
        sc.close();
    }
}
