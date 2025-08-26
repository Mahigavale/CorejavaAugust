package core3;

public class Array10 {

	public static void main(String[] args) {
		
		int[] arr=new int[1000];
		
		//1+2
		//3+3
		//6+4
		//10+5
		//15
		
		int sum=0;
		for(int i=0;i<1000;i++)
		{
			arr[i]=i+1;
		}
		
		
		
	
		for(int i=0;i<1000;i++)
		{
			if(arr[i] >=998)
			{
				sum=sum+arr[i]; 
			}
			
		}

	
		
		System.out.println(sum);
	}

}
