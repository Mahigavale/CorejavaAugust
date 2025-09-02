package twod;

public class Fourth {

	public static void main(String[] args) {
		
		int[][] arr=new int[5][5];
		
		  
		int num=1;
		
		
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				arr[i][j]=num;
				num++;
			}
			
		}
		
		
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("***********************************");
		
		
		
		int sum=0;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(i==j)
				{
					sum=sum+arr[i][j];
					System.out.print(arr[i][j]);
				}
				else {
				System.out.print(" * ");
				}
			}
			System.out.println();
		}
		System.out.println("Sum:"+sum);
		
		System.out.println("******************************************");
		
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(arr[i][j]%2==0)
				{
					System.out.print("Ev"+" ");
				}
				else
				{
					System.out.print("Od"+" ");
				}
			}
			System.out.println();
		}
	}

}
