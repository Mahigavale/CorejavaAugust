package setif;

import java.util.TreeSet;

public class Tree_1 {

	public static void main(String[] args) {
	
		
		
		TreeSet<Book> books=new TreeSet<Book>();
		
		books.add(new Book(1,"ABCde",45.78));
		books.add(new Book(2,"CDE",89.90));
		books.add(new Book(3,"EFG",89.90));
		books.add(new Book(4,"XYZ",89.87));
     	System.out.println(books);		

		
	}
}


class Book implements Comparable<Book>
{
	int id;
	String name;
	double price;
	
	public Book(int id, String name, double price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}

	// 0,1,-1
	@Override
	public int compareTo(Book o) {
		
		String s=this.name;
		String s2=o.name;
		
		System.out.println("calling compare to before adding ..");
		
//		String s=new String();
//		s.charAt(id)
//		System.out.println("Calling compareTo() to check the equality...");
//		return Integer.compare(this.name.length(), o.name.length());
		//0
		//1
		//-1
		
		return this.id-o.id;
	}
	
	
	public String toString()
	{
		return this.name;
	}
	
	public Book()
	{
		System.out.println("***");
	}
}

//