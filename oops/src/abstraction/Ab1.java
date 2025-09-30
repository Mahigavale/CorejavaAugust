package abstraction;

public class Ab1 {

	public static void main(String[] args) {
		
		
		Tiger tiger=new Tiger();
		
		tiger.race();
		
		System.out.println(tiger.whatyoueat("grass"));
		
		tiger.drink();
		
		Tiger siber=new Tiger();
		
	 System.out.println(	siber.whatyoueat("Corniverous"));
	}

}

 abstract class  Animal
{
	 /**
	  * It declared a two  method behaviours.
	  */
	
	 
	 public Animal()
	 {
		 System.out.println("Object.. hehe");
	 }
	 
	  abstract void race();
   
	 abstract public String whatyoueat(String n);
	
	 
	 public void drink()
	 {
		 System.out.println("I am Drinking... water");
	 }
}
 
 class  Tiger extends Animal
 {
	 
	 
	 public Tiger()
	 {
		 super();
		 System.out.println("Tiger hehe");
	 }
	    void race()
	 {
		 
		 System.out.println("Race implemented..");
	 }
	 public String whatyoueat(String n)
	 {
		 return n;
	 }
	 
	
 }
