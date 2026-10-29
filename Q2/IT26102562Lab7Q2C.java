public class IT26102562Lab7Q2C
{
	public static void main(String [] args)
	{
		int num = 5;
		int col = 5;
		
		for(int rowCount=0 ; rowCount<5 ; rowCount++)
		{
			for(int colCount=col ; colCount>=1 ; colCount--)
			{
				System.out.print(num);
			}
			System.out.println();
			num--;
			col--;
		}
	}
}