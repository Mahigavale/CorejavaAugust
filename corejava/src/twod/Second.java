package twod;

public class Second {

	public static void main(String[] args) {
		
		int[][] arr=new int[4][4];
			
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				arr[i][j]=i+j;  //0+0=>0 1,2,3
				               //1+0=>1, 2,3,4
	                           // 2, 3,4,5
				              // 3,4 ,5, 6
			}
		}

		
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(arr[i][j]+" ");//0+0=>0 1,2,3
				               //1+0=>1, 2,3,4
	                           // 2, 3,4,5
				              // 3,4 ,5, 6
			}
			System.out.println();
		}
	}

}
