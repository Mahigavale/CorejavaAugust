package core3;

public class Array15 {

	public static void main(String[] args) {
		
		int num=13;
		
		boolean flag=false;
		
		for(int i=2;i<13;i++)
		{
			if(num%i==0)
			{
				flag=true;
			}	
		}
		if(flag==true)
		{
			System.out.println("Composite");
		}
		else
		{
			System.out.println("Prime");
		}

	}

}
