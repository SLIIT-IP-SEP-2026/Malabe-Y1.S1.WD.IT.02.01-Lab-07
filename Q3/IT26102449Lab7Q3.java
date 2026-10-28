import java.util.Scanner;
public class IT26102449Lab7Q3{
	
	public static final double discount1=0.05;
	public static final double discount2=0.0;
	public static void main(String[]args){
		
		Scanner input=new Scanner(System.in);
		int cu;
		double base,discount,total,discountprice=0.0;
		char mode;
		
		for(cu=1;cu<=5;cu++){
			System.out.println("Customer "+cu);
			System.out.print("Enter total bill amount: ");
			base=input.nextInt();
			System.out.print("Enter mode of payment(C for cash, O for other): ");
			mode=input.next().charAt(0);
			
			if(mode=='C'||mode=='c'){
				discountprice=base*discount1;
				total=base-discountprice;
				System.out.println("Discount is: "+discountprice);
				System.out.println("Amount to be paid: "+total);
			}
			
			else if(mode=='O'||mode=='o'){
				System.out.println("No discount applicable");
				discountprice=base*discount2;
				total=base-discountprice;
				System.out.println("Amount to be paid: "+total);
			}
			
			else{
				System.out.println("Payment Mode is Not Valid");
			}
			System.out.println();
		}
	}
}