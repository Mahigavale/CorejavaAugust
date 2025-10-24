package Practise;

import java.util.Objects;


public class Third {

	public static void main(String[] args) {
		

		Animal animal=new Animal();
		
		animal.id=12;
		animal.name="ab";
		animal.age=10;
		Animal animal2=new Animal();
		
		animal2.id=12;
		animal2.name="ab";
		animal2.age=10;
		
		
		Animal animal3=new Animal();
		animal3.id=12;
		animal3.name="abc";
		animal3.age=10;
		
		
		
//		boolean result=animal3.name instanceof String;
//			
//		System.out.println("***************");
//		System.out.println(result);
//			
//		System.out.println(animal3 instanceof Animal);
//		System.out.println("***********************");
//		
		System.out.println(animal.hashCode());
		
		System.out.println(animal2.hashCode());
		
		System.out.println(animal3.hashCode());
	}
}


class Animal 
{
	
	int id;
	String name;
	int age;
	
	public String getname()
	{
		return this.name;
	}
	
	public int hashCode()
	{
		//return 100+this.id;
		
	return 	Objects.hash(id,name,age);
	/**
	 * Depending upon these values  .hashCode() will generate.
	 */
	//integer.
	}
	
}