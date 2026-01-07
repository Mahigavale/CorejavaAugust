package demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Second {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		
		     Class<?> cl=Third.class;
		     
		    for(Constructor<?>c:cl.getDeclaredConstructors())
		    {
		    	System.out.println(c);
		    }
		    
		 Constructor<?> what=cl.getDeclaredConstructor(int.class);
		 
		 what.setAccessible(true);
		 what.newInstance(12);
	}
}

class Third
{
 
	private Third(int i)
	{
		System.out.println("constructor called.....!");
	}
}