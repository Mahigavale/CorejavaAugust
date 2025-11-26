package intermediatary_ops;

import java.util.List;
import java.util.Stack;

public class Second {

	public static void main(String[] args) {

		List<String>  list=new Stack<String>();
		
		list.add("Latur");
		list.add("Tuljapur");
		list.add("Gulbarga");
		list.add("Vijaypur");
		list.add("Ratnagiri");
		list.add("Rampur");
		list.add("Ranapur");
		
		/**
		 * Ra=> ToUppercase();
		 */
		
	
		 list
		.stream()
		.filter((i)->(i.startsWith("Ra"))).map(String::toUpperCase).forEach((i)->System.out.println(i));
	}
}
