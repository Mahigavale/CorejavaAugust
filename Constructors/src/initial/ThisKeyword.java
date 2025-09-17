package initial;

public class ThisKeyword {
 
	
	public ThisKeyword()
	{
		
	}
	public static void main(String[] args) {
		
		Axis axis=new Axis("APPA BALWANT");

		
		axis.displayname();
	}

}


class Axis
{
	String name; //instance=> default  values.
	
	public Axis(String constructor_name)
	{
		this.name=constructor_name;
	}
	
	
	public void displayname()
	{
		System.out.println(name);
	}
	
	
}