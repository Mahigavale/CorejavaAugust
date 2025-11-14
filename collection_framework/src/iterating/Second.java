package iterating;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Second {

	public static void main(String[] args) {
		

		
		List<Author> authors=new ArrayList<Author>();
		
		
		for(int i=0;i<15;i++)
		{
			authors.add(new Author("A",i));
		}
		
		System.out.println(authors);
		
		Iterator<Author> itr=authors.iterator();
		
		
		System.out.println(authors.size());
		while(itr.hasNext())
		{
			Author author=itr.next();
			if(author.mobile>10)
			{
				itr.remove();
			}
			else
			{
				System.out.println("ineligible");
			}
			
		}
		
		System.out.println(authors.size());
		System.out.println(authors);
	}

}

class  Author
{
	String name;
	int mobile;
	
	public Author(String name, int mobile)
	{
		this.name=name;
		this.mobile=mobile;
	}
	public String toString()
	{
		return this.mobile+" ";
	}
}