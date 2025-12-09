package method_reference;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Second {

	public static void main(String[] args) {
		/**
		 * Static Method reference.
		 */
   Consumer<String> display=Demo::demo;
   
   
      display.accept("hello");
      
      
      Function<String, Integer> fun=Demo::demo2;
      
      System.out.println(fun.apply("abcdkcnkdmowmle,d;,w;,;wd"));
      
      
      Supplier<Long> sup=Demo::method3;
      
      System.out.println(sup.get());
      
      
        
		
	}
}

class Demo
{

	public  static void demo(String t1)
	{
		System.out.println(t1);
	}
	
	public  static void demo(int t1)
	{
		System.out.println("A");
		System.out.println(t1*2);
	}
	
	public static int demo2(String t2)
	{
		
		System.out.println("from the method reference....");
		
		return t2.length();
	}
	public static long method3()
	{
	    double d= Math.random()*1000;
	    System.out.println("d:"+d);
	    long l=(long)d*10;
	    System.out.println(l);
	    return l;
	}
	
	public  static boolean checkBigger(int i)
	{
		return i>10;
	}
	
}