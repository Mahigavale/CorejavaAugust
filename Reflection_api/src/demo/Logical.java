package demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Logical {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Class<?> name = Car.class;
		
		Constructor<?> cs= name.getDeclaredConstructor(int.class);
		
		cs.setAccessible(true);
		Object obj = cs.newInstance(32);
		
		Method method = name.getDeclaredMethod("getname");
		  Field[] f = name.getDeclaredFields();
		  
		  for(Field f1 : f)
			  
		  {
			  f1.setAccessible(true);
			  System.out.println(f1.get(obj));
			  
			  if(f1.get(obj).equals("Mustang"))
			  {
				  f1.set(obj, "Farari");
			  }
		  }
		method.setAccessible(true);
		String str =(String) method.invoke(obj);
		
		System.out.println(str);
		if(str.equals("Mustang"))
		{
			
		}
		

	}
}


class Car
{
	
	private String name="Mustang";
	
	private Car(int i)
	{
		System.out.println("Object created...");
	}
	
	private String getname()
	{
		return this.name;
	}
}