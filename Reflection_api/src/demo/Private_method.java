package demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Private_method {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                  Class<?> cl=Class.forName("demo.Book");  
                Method[]methods=cl.getDeclaredMethods();
                for(Method m:methods)
                {
                	System.out.println(m.getName());
                	System.out.println(m.getParameterCount());
                	System.out.println(m);
                }
                  
           Constructor<?> c=cl.getDeclaredConstructor();
             
           Method m=cl.getDeclaredMethod("add",int.class,int.class);
           
           
           
        Book obj=(Book)c.newInstance();
        m.setAccessible(true);
        m.invoke(obj, 12,12);
        
        
	}
}
class Book{
	
	
	private void add(int i, int j)
	{
		System.out.println("inside the private add method....");
		System.out.println(i+j);
	}
	
	public void add(int i)
	{
		System.out.println(i*2);
	}
}