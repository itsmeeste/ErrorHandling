import java.util.InputMismatchException;
import java.util.Scanner;

public class Errors 
{
	
	
	// This method will handle the input mismatch from scanner
	@SuppressWarnings("finally")
	public int inputMismatch()
	{
		Scanner sc = new Scanner(System.in);
		
		
		// Get the input from the scanner
		try
		{
			int value = sc.nextInt();
			return 1;
		}
		catch(InputMismatchException e)
		{
			System.out.println("This is the error");
			System.out.println(e.toString());
		}
		finally
		{
			System.out.println("This will always run after");
			return 5;
		}
	}
	
	// This is the exception for file handling
	public void findingFile()
	{
		
	}
	
	public void ArrayException(int index)
	{
		int [] numbers = {1,2,3,4,5};
		try
		{
			for(int i =0; i < index;i++ )
			{
				System.out.println("Number: " + numbers[i]);
			}
			
		}
		catch(ArrayIndexOutOfBoundsException ao)
		{
			System.out.println(ao);
		}
	}
	
	public int DivideTest(int a, int b)
	{
		try
		{
			return a /b;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return 0;
		}
	}

}
