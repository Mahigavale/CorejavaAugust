package mock_questions;

public class First {

	public static void main(String[] args) {
		
		int[] arr= {1,0,3,0,5,6,0};
		//[1,3,5,6,0,0,0]
		
		int[] arr2=new int[arr.length];
		int count=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] !=0)
			{
				 arr2[count++]=arr[i];
			}
		}

		

      
	}

}
