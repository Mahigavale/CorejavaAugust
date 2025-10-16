package propagationandStatuscodes;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
	
		
		try {
		if(10>5)
		{
			throw new NotSundayException("NO_HOLIDAY",new Throwable("today is saturday"),300);
		}
		}
		catch(NotSundayException ex1)
		{
			System.out.println(ex1.getMessage());
			System.out.println(ex1.getCause());
			System.out.println(ex1.getCode());
		}
//		
//		Scanner scan=new Scanner(System.in);
//		int i=scan.nextInt();
//		
//		System.out.println(i);

	}

}
