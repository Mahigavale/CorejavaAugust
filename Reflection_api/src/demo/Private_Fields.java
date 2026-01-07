package demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Private_Fields {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException, InstantiationException, InvocationTargetException {
	
		 Class<?> cl=City.class;
		 Constructor<?> cs=cl.getDeclaredConstructor();
		 
		 Object obj=cs.newInstance();
		 
		 Field[] fields=cl.getDeclaredFields();
		 
		 
		 for(Field f:fields)
		 {
			 System.out.println(f);
		 }
		 Field f=cl.getDeclaredField("name");
		 f.setAccessible(true);
		 f.set(obj, "helloPune");
		 
		 
		 System.out.println(f.get(obj));
		 
	}
}

class City
{
	private String name;
	
	String pincode;
}