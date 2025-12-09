package listif;

import java.util.LinkedList;

public class Remove_elements {

	public static void main(String[] args) {
		
		//UUID
		
		LinkedList<Comment> list=new LinkedList<Comment>();
		
		list.add(new Comment(1,"nice photo !"));
		list.add(new Comment(2,"Nice view"));
		list.add(new Comment(3,"Please leave instagram"));
		
		Comment comment=new Comment("Please leave instagram");
		
		System.out.println(list);
		System.out.println(list.contains(comment));
		
		System.out.println(list.remove(comment));
		System.out.println(list);
		
	}

}

class Comment
{
	int id;
	String content;
	public Comment(int id, String content)
	{
		this.id=id;
		this.content=content;
	}
	
	public Comment(String content)
	{
		this.content=content;
	}
	public String toString()
	{
		return this.id+" :" +this.content;
	}
	
	public boolean equals(Object obj)
	{
		Comment comment=(Comment)obj;
		return this.content.equals(comment.content);
	}
	
}