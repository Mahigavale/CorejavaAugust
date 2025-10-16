package advanced;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		
		String str="abcddddd";
		String str2="dabcddd";
		
		
	char[] arr1=	str.toCharArray();
	
	char[] arr2=str2.toCharArray();
	 Arrays.sort(arr1);
	 Arrays.sort(arr2);
	 
	 
	 System.out.println( Arrays.equals(arr1, arr2));
		
	}

}
