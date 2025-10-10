package basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Fifth {

	public static void main(String[] args) {
		
		int str;
		
		Scanner scan=new Scanner(System.in);

		
		try {
		str=scan.nextInt();
		System.out.println(str);
		}
		catch(InputMismatchException e)
		{
			System.out.println("in the exception");
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("---THE END---");
		}
		
	}

}
