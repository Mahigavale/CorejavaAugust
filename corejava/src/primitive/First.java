package primitive;

public class First {

	public static void main(String[] args) {
		//primitive=>
		//byte,short,int,char, long, float, double, boolean

		
		
		//byte=> 1 byte=> 8 bits
		// -2^n-1 to 2^n-1-1; n=> no.of bits
		//-128 to 127 (-2^7 to 2^7-1)
		byte b=-127;
		byte b1=127;
		
		//short => 2 bytes=>16 bits
		//-2^15 to 2^15-1
		//-32768 to 32767
		
		short s1=32700;
		
		//int, float => 4 bytes=>32 bits
		//-2^31 to 2^31-1
		// -2147483648 to 2147483647 
		
		int i=2147483647;
		
		//long, double => 8 bytes=>64 bits
		// -2^63 to 2^63-1
		//-9223372036854775808
		// 9223372036854775807
		long l=9223372036854775807l;
		
		
		
		float fl=1.12345678910111213f; //6-7 decimal
		double d=1.12345678910111213; //14-15 decimal
		
		System.out.println(fl);
		System.out.println(d);
		
	}

}
