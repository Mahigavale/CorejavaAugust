package misc2;

import java.util.Optional;

public class misc45 {

	public static void main(String[] args) {
		
		
		Optional<String> op=Optional.ofNullable("null");
		
		System.out.println(op.get());
		
		
		
		
		Sumo sumo=Sumo.ghere(23,45);
		
		System.out.println(sumo.getvalues());
		

	}

	
}
class Sumo
{ 
	int i;
	int j;
	
	private Sumo(int i, int j)
	{
		 this.i=i;
		 this.j=j;
	}
	
	
	public String getvalues()
	{
		return ""+this.i+this.j;
	}
	
	
	public static Sumo ghere(int i , int j)
	{
		   return new Sumo(i,j);
	}
}
