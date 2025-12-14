package collections_class;

public class C_r {

	public static void main(String[] args) {
		

		System.out.println("Hii");
		I_cr<Elephant,Integer, String > i=Elephant::new;
		
		System.out.println("hiii");
		System.out.println(i.logic(23, "60").returnStr());
	}
}
interface I_cr<A,B,C>
{
	A logic(B b, C c);
}
class  Elephant
{
	int i;
	String j;
	public Elephant(int i, String j)
	{
		System.out.println("Consrtuctor...");
		this.i=i;
		this.j=j;
	}
	public String returnStr()
	{
		return this.j+" "+this.i;
	}
}
