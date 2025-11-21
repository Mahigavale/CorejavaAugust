package collections_class;

public class Second_example {

	public static void main(String[] args) {

		
		Multiplication<Integer> multi=(t1,t2)->{return t1*t2;};
		 System.out.println(multi.multiply(12, 13));
		 Multiplication<String> str=(t1,t2)->{return t1+"haha"+t2;};
		 System.out.println(str.multiply("hello", "bollo"));
		 
		 
		 Printr<int[]> printarray=(t1)->{System.out.println(t1[0]);};
		 
		 
		 printarray.printre(new int[] {1,2});
	}
}



interface Multiplication<T> 
{
	

	  public T multiply(T t1, T t2);
}


interface Printr<T>
{
	public void  printre(T t1);
}