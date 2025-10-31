package collection_framework;

public class Third {

	public static void main(String[] args) {
		
 Irun<String> run=new Irunimpl();
 
 Irun<Integer> run2=new Irun2();
 
 System.out.println(run.display("Hello"));
 run2.display(34);

	}

}

interface Irun <T>
{
	/**
	 * Return type is Void.
	 * Input Param String .
	 * @param str
	 */
	 String display(T t);
}

class Irunimpl implements  Irun<String>
{

	@Override
	public String display(String str2) {
		
		return ("This is the display method with the implementtation..."+str2);
		
	}
	
	
}
class Irun2 implements Irun<Integer>
{

	@Override
	public String display(Integer t) {
		// TODO Auto-generated method stub
		
		return t.toString();
	}
	
}