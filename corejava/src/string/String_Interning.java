package string;

public class String_Interning {

	public static void main(String[] args) {
	
		
		/**
		 * String interning => adding the unique literals in the SCP.
		 * irrespective of the use of the new Keyword.
		 * introduced in the Java 7.
		 * memory optimization.
		 * .intern() => will return the value from the SCP. which is 
		 * being shared by the multiple literals.
		 */
		    String str="AB";
		//SCP=> AB
		    String str2=new String("CE");
		// heap=> scp=> "CD" => interning=>adding the unique literal in the constant pool.
		    String demo=  str2.intern(); //cd=>SCP
		    String str3=new String("CE");
		// SCP=> AB, CD
		    System.out.println(str2.intern()==str3.intern());
	}

}
