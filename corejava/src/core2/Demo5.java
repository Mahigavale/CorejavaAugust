package core2;

public class Demo5 {

	public static void main(String[] args) {
		
		Library lib=new Library(); //Object
		
		System.out.println(lib.no_of_rooms);
		
		lib.read();

	}

}


 class Library
 {
	 int no_of_rooms=10;
	 
	 public void read()
	 {
		 int i=10;
		while(i>5)
		{
			System.out.println(i);
			i--;
		}
	 }
	 
	 
	 
 }