package twod;

public class First {

	public static void main(String[] args) {
		// 45 67 43 21
		// 32 45 11 12
		// 11 56 99 76 =>99(2,2)
		
		int[][] arr=new int[3][3];
		// new int[row][columns] ;;;;;
		
		arr[0][0]=1;
		arr[0][1]=2;
		arr[0][2]=3;
			
		arr[1][0]=4;
		arr[1][1]=5;
		arr[1][2]=6;
		
		arr[2][0]=7;
		arr[2][1]=8;
		arr[2][2]=9;
		
		
		
		for(int i=0;i<3;i++)// i=0> 
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			//Syso => Jump to the next row;
			System.out.println();
		}
		
		
	}

}
