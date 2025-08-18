package core3;

public class Static3 {

	public static void main(String[] args) {

		
		Animal tiger=new Animal();
		tiger.name="Sherkhan";
		tiger.weight="250kg";
	
		
		
		 Animal elephant=new Animal();
	     elephant.name="Jumbo";
	     elephant.weight="1000kg";
		
		
	     
		 Animal aligator=new Animal();
		 aligator.name="boss";
		 aligator.weight="460kg";
	     
		  System.out.println("tiger name:"+tiger.name);
		  System.out.println("tiger weight:"+tiger.weight);
		  
		  System.out.println("**********************************");
		  
		  System.out.println("elephant name:"+elephant.name);
		  System.out.println("elephant weight:"+elephant.weight);
		  
		     
		  System.out.println("********************************");
		     System.out.println(aligator.name);
		     System.out.println(aligator.weight);
		     
		  		
	}

}

class Animal
{
	 static  String name="Animal";
	  
	  static  String weight="100kg";
	
	   public  void display()
	  {
		  System.out.println("hiii");
		  System.out.println(name);
	  }
}