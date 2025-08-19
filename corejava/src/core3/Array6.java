package core3;

public class Array6 {

	public static void main(String[] args) {
//[1,2,3....100]
		
		int[] numbers=new int[100];
		
		
		for(int i=0;i<100;i++)
		{
			numbers[i]=i+1;//0,1
			 //1,2
			//2,3
			//99,100
			//50,51
		}
  		
		
		
		System.out.println(numbers[50]);
		
		System.out.println(numbers[99]);
		
	}

}
