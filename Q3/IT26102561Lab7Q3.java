import java.util.Scanner;
public class IT26102561Lab7Q3 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        for (int custNo = 1; custNo <= 5; custNo++){
            System.out.println("Customer " + custNo);

            System.out.print("Enter total bill amount: ");
            double billAmount = input.nextDouble();
            
            System.out.print("Enter mode of payment (C for cash, O for other): ");
            char modeOfPayment = input.next().charAt(0);

            if (modeOfPayment == 'C' || modeOfPayment == 'c'){
                double discount = (billAmount * 5)/100;
                double amount = billAmount - discount;

                System.out.println("Discount is : " + discount);
                System.out.println("Amount to be paid: " + amount);
            }
            else if (modeOfPayment == 'O' || modeOfPayment == 'o'){
                System.out.println("No discount applicable");
                System.out.println("Amount to be paid: " + billAmount);
            }
            else {
                System.out.println("Payment Mode is Not Valid");
            }

            System.out.println();
        }
    }
}
