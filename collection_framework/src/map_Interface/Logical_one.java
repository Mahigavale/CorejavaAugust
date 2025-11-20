package map_Interface;

import java.util.HashMap;
import java.util.Map;

public class Logical_one {

	public static void main(String[] args) {

		//Counting the Occurences.
		//MAGADHIRA
		//{M=1, A=3,G=1,D=1,I=1,R=1, H=1}
		
		
		String str="RADHIKARAWAL";
		
		
	
		String str2=str.toLowerCase();
	 char[] chars=str2.toCharArray();
	 
	 Map<Character, Integer> map=new HashMap<Character,Integer>();
	 
	 
	 
	 //map.contains('M')
	 //M(M=1), A(A=1),G(G=1),
	 for(int i=0;i<chars.length;i++)
	 {
		 int counter=1;
		 if(map.containsKey(chars[i])) {
		 counter=map.get(chars[i])+1;
		 map.put(chars[i], counter);
		 }
		 else
		 {
		 map.put(chars[i], counter);
		 }
	 }
	 
	 System.out.println(map);
	 
	// System.out.println(map.get(' '));
	
	// System.out.println(map.get('R'));
	}
}
