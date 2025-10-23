package functionalifs;

public class Inner_demo {

	public static void main(String[] args) {
		
		
		/**
		 * Static ,instance
		 */
		
		Abc abc=new Abc();
		/**
		 * Obj =>Outer
		 */
		
		System.out.println(abc.age);
	
	 Abc.cde cd=abc.new cde();  
	 /**
	  *      Obj.new cde(); => create the object of the instance inner class.
	  */
	 cd.demo(); 
	 /**class name.static class.static method
	  * Static method 
	  */
	//Abc.new fgh().demor();
	 
	 /**
	  * fgh is static.
	  */
	 Abc.fgh acd=new Abc.fgh();
	 acd.demor();
	 
	}

}

 class Abc
{
	  int age;
	 
	 /**
	  * Instance inner class.
	  * Object of outer first.
	  * Outer.inner=outer object.new inner(); 
	  */
	class cde
	{
		public cde()
		{
			System.out.println("cde created.");
		}
	   public void demo()
		{
			System.out.println("this is the inner class method..");
		}
	}
	
	/**
	 * Static inner class.
	 * no need of creating the object of outer class.
	 */
	static class fgh
	{
		public fgh()
		{
			System.out.println("A");
		}
		public void demor()
		{
			System.out.println("hello");
		}
	}
}