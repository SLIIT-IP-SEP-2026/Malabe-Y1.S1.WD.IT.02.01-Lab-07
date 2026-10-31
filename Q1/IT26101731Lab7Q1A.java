import java.util.Scanner;
public class IT26101731Lab7Q1A{
    public static void main(String[] args){
	    int mark1,mark2,mark3,mark4;
		double avarage;
		String grade="";
		
		Scanner input=new Scanner(System.in);
		System.out.print("Enter subject mark 1: ");
		mark1=input.nextInt();
		System.out.print("Enter subject mark 2: ");
		mark2=input.nextInt();
		System.out.print("Enter subject mark 3: ");
		mark3=input.nextInt();
		System.out.print("Enter subject mark 4: ");
		mark4=input.nextInt();
		System.out.println();
		
		avarage=(mark1+mark2+mark3+mark4)/4;
		System.out.println("Avarage is: "+avarage);
		
		if(avarage>=75&&avarage<=100){
		    grade="Distinction";
			}
		else if(avarage>=50&&avarage<75){
		    grade="Credit";
			}
		else{
		    grade="Fail";
			}
		System.out.println("Overall grade is: "+grade);
		}
	}
		