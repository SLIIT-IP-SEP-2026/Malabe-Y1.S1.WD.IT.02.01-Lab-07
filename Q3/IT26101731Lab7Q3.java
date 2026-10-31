import java.util.Scanner;
public class IT26101731Lab7Q3{
    public static void main(String[] args){
	
	char type;
	double totalbill,discount,payingamount;
	int number=1;
	final int disRate=5;
	
	Scanner input=new Scanner(System.in);
	while(number<6){
	    System.out.println("Customer "+number);
		System.out.print("Enter total bill amount: ");
		totalbill=input.nextDouble();
		System.out.print("Enter mode of payment (C for cash, O for other): ");
		type=input.next().charAt(0);
		    if(type=='o'||type=='O'){
			    discount=0;
			    System.out.println("No discount applicable");
				}
			else if(type=='c'||type=='C'){
				discount=(totalbill*disRate)/100.0;
			    System.out.println("Discount is: "+discount);
				}
			else{
                System.out.println("Payment mode is not valid");
				number++;
				System.out.println();
				continue;
				}
		payingamount=totalbill-discount;
		System.out.print("Amount to be paid is: "+payingamount);
		number++;
		System.out.println();
		System.out.println();
		}
	}
}