//package misc;
//
//public class First {
//
//	public static void main(String[] args) {
//		
//		Tiger tiger=new Tiger();
//		
//		tiger.run();
//		
//		
//		Demo.eat("Hello");
//		Demo2.eat("hi");
//		
//		
//		
//	}
//
//}
//
//interface I_animal
//{
//	
//	   int id=123;
// 	void run();
//	
//}
//interface I_carniverous
//{  
//	
//	public int id=123;
//	void run();
//	
//	String name="non-veg";
//	
//}
//
//class  Tiger implements I_animal, I_carniverous
//{
//	public void run() {		
//		
//		int id=I_animal.id;
//		int id2=I_carniverous.id;
//		
//		
//		//int id2=I_animal.id;
//		String name2=I_carniverous.name;
//		System.out.println("run from tiger.....");
//		System.out.println(id2+name2);
//	
//	}
//	
//	
//	
//	public  void eat(String name)
//	{ int count=1;
//		count++;
//		System.out.println(count);
//	}
//
//	
//	
//}
//
//class Demo extends Tiger
//{
//	public static void eat(String name)
//	{
//	//	new Tiger().eat(name);
//	}
//}
//class Demo2 extends Tiger
//{
//	public static void eat(String name,int o)
//	{
//		//new Tiger().eat(name);
//	}
//}