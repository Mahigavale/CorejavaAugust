package stringclass;

public class Scp2 {

	public static void main(String[] args) {
		
		
		// First Type of Initialization : Without NEW.
		
		
		String str="ABC";  //SCP=> Heap 
		
		String str2="ABC";
		
		
		String str3="ABC";
		
		
		String str4="ABC";
		
		
		//here only one  string will  be created and  not 4.
	
		
		//all 4 i.e. str, str2, str3, str4 will refer to the same "ABC"
	
		
		System.out.println((str==str2) &&(str3==str4));
	}
	

}
