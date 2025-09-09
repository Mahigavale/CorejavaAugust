package stringclass;

public class Check {

	public static void main(String[] args) {
		
		String str="hi this is The Java full stack Class and it is awesome";
		
		// the/java/class
		
		boolean result=true;
		if(str.contains("the") || str.contains("java") || str.contains("class"))
		{
			result=false;
		}
		if(!result)  //result==false
		{
			System.out.println("not eligible");
		}
		else
		{
			System.out.println("welcome to the class.");
		}
	}

}
