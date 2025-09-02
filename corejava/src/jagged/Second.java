package jagged;

public class Second {

	public static void main(String[] args) {
		
		int[][] jagged=new int[6][];
		
		
		for(int i=0;i<5;i++)
		{
			jagged[i]=new int[i+1];
		}
    
		jagged[5]=new int[6];
		
		int count =1;
		
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<jagged[i].length;j++)
			{
				jagged[i][j]=count;
				count++;
			}
		}
		
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<jagged[i].length;j++)
			{
				System.out.print(jagged[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}

}
