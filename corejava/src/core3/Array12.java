package core3;

public class Array12 {

	public static void main(String[] args) {
		int [] nums=new int[1100];
		
		
		
		int sum=0;
		for(int i=0;i<1100;i++)
		{
			nums[i]=i+701;
			
		}
		
		
		for(int i=0;i<1100;i++)
		{
			if(nums[i]%11==0)
			{
				sum=sum-nums[i];
			}
		}
		
		System.out.println(sum);

	}

}
