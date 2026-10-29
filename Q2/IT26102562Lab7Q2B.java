public class IT26102562Lab7Q2B
{
	public static void main(String [] args)
	{
		for (int rowCount = 1; rowCount<=5; rowCount++)
		{
			System.out.print(rowCount + " - ");
			
			for (int colCount = 1; colCount<=rowCount ; colCount++)
			{
				System.out.print(" * ");
			}
			
			System.out.println();
		}
	}

}