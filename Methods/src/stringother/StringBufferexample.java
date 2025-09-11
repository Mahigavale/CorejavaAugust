package stringother;

public class StringBufferexample {

	public static void main(String[] args) {
		
		
		//String str="ABC";
		
		StringBuffer buffer=new StringBuffer("ABC");
		//=> mutable.
		
		buffer.reverse();
		
		
		buffer.append("jfcrcnkecke");
		
		System.out.println(buffer);
	}

}
