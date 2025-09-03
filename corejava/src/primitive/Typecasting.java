package primitive;

public class Typecasting {

	public static void main(String[] args) {
		
		
		// narrowing / explicit type casting
		
		
		double weight=45.56; //8 bytes=>64 bits
		
		
		int wei=(int)weight;     //4 bytes=> 32 bits
		
		//System.out.println(weight); //45.56
		//System.out.println(wei);    //45
		
		
		 float gold=45.678f;
		 byte son=(byte) gold;
		// System.out.println(son); //narrowing =>loosing the data=> explicit type casting
		 //bigger => smaller
 
		  int per=78;  //4 bytes
		 
		 double precentage=per; //8 bytes
		 System.out.println(per);
		 
		 //widening=> implicit type casting => smaller into bigger
		 
		// int age=null;
		 int[] arr=null;
		 
		 String str="Unique";
		 char c='u';
		 String str2="nuique";
		// age.
	}

}
