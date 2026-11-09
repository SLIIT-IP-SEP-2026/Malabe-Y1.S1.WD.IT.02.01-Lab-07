import java.util.Scanner;
public class IT26102766Lab7Q3{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		int count;
		char mode;
		double totalBill;
		
		for (count = 1; count <= 5; count++){
			System.out.println();
			System.out.println("Customer " + count);
			
			System.out.print("Enter total bill amount : ");
			totalBill = input.nextDouble();
			System.out.print("Enter the mode of payment (C for Cash, O for Others) : ");
			mode = input.next().charAt(0);
			
			if(mode != 'C' && mode != 'O'){
				System.out.print("Payment Mode is Not Valid");
			}
		
			else if(mode == 'C'){	
		        double discount = totalBill * 0.05;
				totalBill = totalBill - discount;
				System.out.println("Discount is : " + discount);
				System.out.print("Amount to be paid : " + totalBill);
			}
			
			else{
				System.out.println("No discount applicable");
				System.out.print("Amount to be paid : " + totalBill);
			}
			
			System.out.println();
				
				
				
			
        }
	}
}



