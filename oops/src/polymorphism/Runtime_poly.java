package polymorphism;
public class Runtime_poly {

	public static void main(String[] args) throws ClassNotFoundException {
		
		/**
		 * @Polymorphic Object=>
		 * reference of parent = object of child.
		 */
   Movie movie=new Simple();
   
   movie.Showcollection();
          
	}
}


class Movie
{
	
 
	public void Showcollection()
	{
		System.out.println("Collection from parent");
	}
	
	
}

class Simple extends Movie
{
	public void Showcollection()
	{
		System.out.println("From the child...");
	}
}