import java.util.Scanner;
public class IT26101731Lab7Q1B{
    public static void main(String[] args){
	    int mark1,mark2,mark3,mark4;
		double avarage;
		String grade="";
		int student=1;
		
		Scanner input=new Scanner(System.in);
		while(student<4){
		    System.out.println("Student "+student);
			System.out.print("Enter marks:");
			mark1=input.nextInt();
		    mark2=input.nextInt();
			mark3=input.nextInt();
			mark4=input.nextInt();
			
			avarage=(mark1+mark2+mark3+mark4)/4.0;
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
			System.out.println();
			student++;
		    }
	    }
    }