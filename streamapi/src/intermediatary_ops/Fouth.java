package intermediatary_ops;

import java.util.ArrayList;
import java.util.List;

public class Fouth {

	public static void main(String[] args) {

		Demo d=new Demo();
		d.price=234.56;
		Demo d2=new Demo();
		d2.price=456.78;
		Demo d3=new Demo();
		d3.price=400.56;
		
		List<Demo> list=new ArrayList<Demo>();
		list.add(d3);
		list.add(d2);
		list.add(d);
		
		list.stream().sorted()
		.limit(2)
		.skip(1)
		.forEach((i)->{System.out.println(i);});


	}

}


class Demo implements Comparable<Demo>
{
 double price;
	@Override
	public int compareTo(Demo o) {
		
		return Double.compare(this.price, o.price);
	}
	
	public String toString()
	{
		return this.price+" ::";
	}
}