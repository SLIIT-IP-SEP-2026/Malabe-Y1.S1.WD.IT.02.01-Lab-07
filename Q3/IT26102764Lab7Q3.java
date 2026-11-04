 import java.util.Scanner;
  
 public class IT26102764Lab7Q3{
    
    public static void main(String[] args){

    // define the variables
      final double DISCOUNT_RATE = 0.05;  //5% disscount rate
      final int NUMBER_OF_CUSTOMERS=5;    // number of customers

      double billAmount , amountToPay;
      char paymentMode;
      double discount= 0;
        
   // create the object
        Scanner input = new Scanner (System.in);

    // Process each customer
      for (int customerCount = 1; customerCount<=5; customerCount++){
            System.out.println ("Customer " + customerCount) ;
    
          // Input the total bill amount
            System.out.print ("Enter total bill amount: ");
            billAmount = input.nextDouble();

         // Input the mode of payment
            System.out.print ("Enter mode of payment (C for cash, o for other): ");
            paymentMode = input.next () . toUpperCase (). charAt (0);
    
         //Check the mode of payment and calculate discount
            if (paymentMode =='C') {
     
              // Apply discount
                discount = billAmount * DISCOUNT_RATE;
                amountToPay= billAmount - discount;

                System.out.println("Discount is : " + discount);
                System.out.println("Amount to be paid:"+ amountToPay) ;
            }
             else if (paymentMode == 'O') {
               // No discount
                amountToPay = billAmount;

                System.out.println("No discount applicable");
                System.out.println ("Amount to be paid: " + amountToPay) ;
            }
            else {
              // Invalid payment mode
                System.out.println("Payment Mode is Not Valid");
                System.out.println();
                continue;      // Skip to the next customer
            }

            System.out.println(); // Print a blank line for better readability
        }
    }
}
