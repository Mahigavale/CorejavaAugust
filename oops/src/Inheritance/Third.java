package Inheritance;

public class Third {

	public static void main(String[] args) {
		
		//DCE
		
		
		Mustang mustang=new Mustang(new int[] {10},Mustang.arr2);

	}
}

class Mustang
{
	public Mustang(float f)
	{
				this(new int[] {10,20});
		System.out.println("C");
	}
	
	 static int[][] arr2=new int [0][0];
	public Mustang(int[] arr)
	{
		
		//this(new int[] {10,20},arr2);
		
		System.out.println("D");
	}
	
	public Mustang(int[] arr, int[][]arr3)
	{
		this(0.0f);
		System.out.println("E");
	}
}