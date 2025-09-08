package stringclass;

public class Second {

	public static void main(String[] args) {
		// isblank() and isEmpty();
		          
	
//		String str=new String(" "); //
//		
//		 System.out.println(str.isBlank()+" "+str.length()); //whitespace
//		 System.out.println(str.isEmpty()+" "+str.length()); //length
		
		
		String str=new String("welcome"); //w1lcom6
		//0e23o5e
		for(int i=0;i<str.length();i++)
		{
			//System.out.println(str.charAt(i)=='e');
			if(str.charAt(i)=='e' || str.charAt(i)=='o')
			{
				 System.out.print(str.charAt(i));
			}
			else
			{
				System.out.print(i);
			}
			
		}
		
	
	
	}

}
