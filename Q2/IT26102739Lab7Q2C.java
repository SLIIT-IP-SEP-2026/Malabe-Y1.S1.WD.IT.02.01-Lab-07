import java.util.Scanner;

public class IT26102739Lab7Q2C
{
	public static void main(String[]args)
	{
		//To control the number of rows, so in this case starting from 5 and decrasing down to 1
		for(int i = 5; i >= 1; i--){
			
			//To control how many times 'i' is printed in the current row
			for(int j = 1; j <= i; j++){
				System.out.print(i);	
			}
			System.out.println();
		}
	}
}