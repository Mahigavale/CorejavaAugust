package fifs;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Logical_12 {

	public static void main(String[] args) {
		// WelcomeToPune => WElcOmETOPUnE =String=>String
		// LEt's Go=> Let's GO
		
		

		
		 
		
		List<String> list=new ArrayList<String>();
		
		list.add("aeeeKLMOUE");
		list.add("AAeeaaUtTTVCdS");
		list.add("OUTYReEEAAMnUt");
		
		
		list.stream().map(new Converter()).forEach((i)->{System.out.println(i);});
		 //WElcOmETOPUnE
	}

}

class Converter implements Function<String, String> {

		
	public String apply(String str)
	{
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<str.length();i++) {
			if( str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				sb.append(Character.valueOf(str.charAt(i)).toString().toUpperCase());
			}
			else if(str.charAt(i)=='A'|| str.charAt(i)=='E'|| str.charAt(i)=='O'||str.charAt(i)=='I'||str.charAt(i)=='U')
			{
				sb.append(Character.valueOf(str.charAt(i)).toString().toLowerCase());
			}
			else
			{
				sb.append(str.charAt(i));
			}
		
		
                	}
		return sb.toString();
}
}
