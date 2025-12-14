package collections_class;

import java.util.function.Function;
import java.util.function.Supplier;

public class Fifth {

	public static void main(String[] args) {
		
		/**
		 * Constructor reference.
		 * 
		 */
		
//		Supplier<StringBuffer> sup=StringBuffer::new;
//		
//		
//		System.out.println(sup.get().append("jjcc").reverse());
		
		Function<String, Van> fun=Van::new;
		//(String s)->(new Van(String s))
		

		
		System.out.println(fun.apply("welcome to Konkan !").getLength());
	}

}


class Van
{
	String demo;
	public Van(String s)
	{
		this.demo=s;
	}
	public int getLength()
	{
		return demo.length();
	}
}

