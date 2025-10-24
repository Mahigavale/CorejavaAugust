package Practise;

public class Fourth {

	public static void main(String[] args) {
		
		Car c=new Car();
		Car c2=new Car();
		
		/**
		 * By default  .hashCode() memory references.
		 */
		System.out.println(c.hashCode());
		System.out.println(c2.hashCode());
		
		String str=new String("ab");
		String str2=new String("ab");
		//SCP => single memory => Single Object.
		/**
		 * String has overridden .hashCode() in such a way that
		 * it only considers values and  not the memory references.
		 */
		
		
		System.out.println(str.hashCode());
		System.out.println(str2.hashCode());
		
		/**
		 * == => memory reference
		 */
		System.out.println(str==str2);

	}

}

class Car
{
	int id;
	String company;
}