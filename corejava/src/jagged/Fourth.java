package jagged;

public class Fourth {

	public static void main(String[] args) {
		
		int[][] arr=new int[3][3];
		
		int count =1;
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(i==j)
				{
					arr[i][j]=1;
					
				}
				else {
				arr[i][j]=count;
				count++;
				}
			}
		}

		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
		boolean flag=true;
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(i==j && arr[i][j] !=1)
				{
//					if(arr[i][j] !=1)
//					{
//						flag=false;
//					}
					flag=false;
				}
			}
		}
		if(flag==true)
		{
			System.out.println("IDENTITY");
		}
		else
		{
			System.out.println("NOT AN IDENTITY");
		}
	}

}
