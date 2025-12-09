package method_reference;


import java.util.function.Supplier;

public class Instance_method_1 {
	
	
	
	/**
	 * 
	 * public  static Integer[] demore(String s, Double d)
	{

		int i1=s.length();
		int i2=d.intValue();
		return new Integer[] {Integer.valueOf(i1),Integer.valueOf(i2)};
	}
	 */

	
	public static void main(String[] args) {
		/**
		 * Instance method reference of specific Object.
		 */
		
		

		String str="ajbu";
		
		Supplier<Integer> getre=str::length;
		
		
	//	System.out.println(getre.get());
		

		Instance is=new Instance();
		
		//Icon<String, Integer[],Double> ic=Instance_method_1::demore;
				
		Icon<String, Integer[],Double> ic=is::demore;
		
		  Integer[] i3=ic.add("heheheh", 678.89d);
		  
		  System.out.println(i3[0]);
		  System.out.println(i3[1]);
				
				
		  //[7,678]
				
				
	}

}

@FunctionalInterface
interface Icon<T,R,U>
{
	    R  add (T t1, U u1);
}


class Instance
{
	public  Integer[] demore(String s, Double d)
	{

		int i1=s.length();
		int i2=d.intValue();
		return new Integer[] {Integer.valueOf(i1),Integer.valueOf(i2)};
	}

}