package stringother;

public class Stringreverse {

	public static void main(String[] args) {
		
		String str="HIJK"; //4 //3
		//K
		//J
		//I
		//H
		
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
		System.out.println();
		
		
		StringBuilder sb=new StringBuilder("ABCD");
		
		System.out.println(sb.reverse().reverse().append("jdbjdc").isEmpty());
	}

}
