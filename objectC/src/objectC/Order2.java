package objectC;

public class Order2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Movie movie =new Movie();
		movie.id=100;
		movie.name="DDLJ";
		
		/**
		 * You call Object => toString()=> Default 
		 */
		
		System.out.println(movie);

	}

}

class Movie
{
	int id;
	String name;
	
	public String toString()
	{
		return this.id+this.name;
	}
	
}