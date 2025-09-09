package stringclass;

public class Palindrome {

	public static void main(String[] args) {
		
		
		String str="NAYAN"; //'N','A','Y','A','N'
		//N= N
		//A=A
		//Y=Y
		
		
//		String str2=str.concat("Bhardwaj");
//		System.out.println(str2);
//		System.out.println(str);

		
		//System.out.println(str.length());
		
//		char[] chars=new char[str.length()];
//		
//		for(int i=0;i<chars.length;i++)
//		{
//			chars[i]=str.charAt(i);
//		}
//		
//		boolean flag=true;
//		
		
		
		//NAYAN
		
	boolean result=	str.contains("y");
	System.out.println(result);
	
	
	
	String str3="welcome to pune";
	
	System.out.println(str3.contains("pune"));
	}

}
