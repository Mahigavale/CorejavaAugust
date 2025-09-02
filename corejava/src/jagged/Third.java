package jagged;

public class Third {

	public static void main(String[] args) {
		
		//[1]                 =>1=>0
		//[2][3]              =>2=>0,1
		//[4][5][6]           =>3=>0,1,2
		//[7][8][9][10]       =>4=>0,1,2,3
		//[11][12][13][14][15]=>5 =>0,1,2,3,4
		//[16][17][18][19][20][21] =>6 =>0,1,2,3,4,5
		
		
		int [][] jagged=new int[10][];
		jagged[0]=new int[1];
		jagged[1]=new int[2];
		jagged[2]=new int[3];
		jagged[3]=new int[4];
		jagged[4]=new int[5];
		jagged[5]=new int[6];
		jagged[6]=new int[7];
		jagged[7]=new int[8];
		jagged[8]=new int[9];
		jagged[9]=new int[10];
		
		int count=1;
		
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<jagged[i].length;j++)
			{
				 jagged[i][j]=count;
				 count++;
			}
		}
		
		
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<jagged[i].length;j++)
			{
				System.out.print(jagged[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("*****************************");
		
		
		for(int i=9;i>=0;i--)
		{
			for(int j=jagged[i].length-1;j>=0;j--)
			{
				System.out.print(jagged[i][j]+" ");
			}
			System.out.println();
		}
	}

}
