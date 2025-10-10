package functionalifs;

public class First {

	public static void main(String[] args) {
		I_1 i=new Demo();
		I_1 j=new Demo2();
		
		
		Demo3 d3=new Demo3(){

			@Override
			public I_1 getimp() {
				
				i.add();
				return j
						;
			}
			
		};

		d3.getimp();
	}

}

interface I_1
{
	 void add ();
}

interface I_2 extends I_1
{
	
}

 class Demo implements I_2
{

	@Override
	public void add() {
		System.out.println("from demo");
	}
	
}
 
 class Demo2 implements I_2
 {

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
		System.out.println("From demo 2");
	}
	 
 }
 
 
  abstract class Demo3
 {
	    abstract public I_1 getimp();
	
 }