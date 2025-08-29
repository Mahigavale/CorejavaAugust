package core3;

public class Array16 {

	public static void main(String[] args) {
		
		int[] arr=new int[5]; //arr.length
		arr[0]=12;
		arr[1]=17;
		arr[2]=11;
		arr[3]=19;
		arr[4]=20;
		
		
		int highest=0;//Zero //helping value
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>highest) //12>0 //17>12 //19>17 //20>19 
			{
				highest=arr[i]; //12 //17 //19 //20
			}
		}
		
		System.out.println(highest);
	}

}
