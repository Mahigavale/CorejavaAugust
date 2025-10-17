package misc;

public class First {

	public static void main(String[] args) {
		
		try {
		
		Student.purchaseBag(1501,9);
		
		}
		catch(  Exception | NotFoundException ex)
		{
			System.out.println(ex.getMessage());
		}
		finally
		{
			 System.out.println("THE END");
		}
//		catch( NotFoundException ex)
//		{
//			System.out.println(ex.getMessage());
//		}
//		catch(ExpensiveException ex)
//		{
//			System.out.println(ex.getMessage());
//		}
	
	}

}

class ExpensiveException extends Exception
{
	public ExpensiveException(String str)
	{
		super(str);
	}
}

class NotFoundException extends Throwable
{
	public  NotFoundException(String str)
	
	{
		super(str);
	}
}



class Student
{
	 static int[] students= {1,2,3,4,5,6,7,10};
	public  static void purchaseBag(double price,int id) throws ExpensiveException,NotFoundException 
	{
		 if(price >1500.00)
		 {
			// System.exit();
			 throw new ExpensiveException("Please reduce the price..");
		 }
		 System.out.println("Purchase approved...");
		 boolean isavailable=false;
			for(int i=0;i<students.length;i++)
			{
				if(students[i]==id)
				{
					 isavailable=true;
				}
			}
			if(!isavailable)
			{
				throw new NotFoundException("no student available");
			}
			
			System.out.println("student found:"+id);
	}
	
//	public static void FindStudentByid(int id) throws NotFoundException
//	{
//		boolean isavailable=false;
//		for(int i=0;i<students.length;i++)
//		{
//			if(students[i]==id)
//			{
//				 isavailable=true;
//			}
//		}
//		if(!isavailable)
//		{
//			throw new NotFoundException("no student available");
//		}
//		
//		System.out.println("student found:"+id);
//	}
}