package core2;

public class Finalvariable {

	public static void main(String[] args) {
		
	  final	int age=19;
		
		//age=23;
		 System.out.println(age+12);
		 System.out.println(Movie.price);
		 System.out.println(Movie.name);
		
       Movie arr=new Movie();
       arr.printname();
       
       System.out.println(arr.name);
		 
       
		 
	}

}

class Movie
{
	 static String name="Krish"; //instance
	
	static int price=100;
	
	public static void printname()
	{
		System.out.println("name of the movie is:"+name);
	}
	
	
}
