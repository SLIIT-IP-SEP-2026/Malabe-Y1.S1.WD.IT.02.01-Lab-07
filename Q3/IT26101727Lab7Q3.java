import java.util.Scanner;

public class IT26101727Lab7Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] bill = new double[5];
        double[] discount = new double[5];
        double[] amount = new double[5];

        char payment;

        for (int i = 0; i < bill.length; i++) {

            System.out.print("Enter total bill amount for Customer " + (i + 1) + ": ");
            bill[i] = input.nextDouble();

            System.out.print("Enter payment mode (C/O): ");
            payment = input.next().charAt(0);

            if (payment == 'C' || payment == 'c') {

                discount[i] = bill[i] * 0.05;
                amount[i] = bill[i] - discount[i];

            }
            else if (payment == 'O' || payment == 'o') {

                discount[i] = 0;
                amount[i] = bill[i];

            }
            else {

                System.out.println("Payment Mode is Not Valid");

                discount[i] = 0;
                amount[i] = bill[i];
            }

            System.out.println("Discount: " + discount[i]);
            System.out.println("Amount to be paid: " + amount[i]);
            System.out.println();
        }

        
    }
}
