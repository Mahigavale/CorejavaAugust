package init2;

public class Diamnond_Problem {

	public static void main(String[] args) {
	
		Universe uni=new Universe();
		uni.dis();
		Galaxy gal=new Galaxy();
		gal.dis();
		
		Milky_way mw=new Milky_way();
		mw.dis();
	}
}


class Universe
{
	String universe_name="ABC";
	
	public void dis()
	{
		System.out.println(this.universe_name);
	}
}
class Galaxy
{
	 String name="Sage";
	 public void dis()
	 {
		 System.out.println(this.name);
	 }
}

class Milky_way  extends Universe
{
	public Milky_way()
	{
		super();
	}
}