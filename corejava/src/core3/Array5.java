package core3;

public class Array5 {

	public static void main(String[] args) {
		
		//[11,12,13,14,15,16,17,18,19,20] =>arr
		// [0, 1, 2, 3, 4 ,5, 6, 7 ,8,9]
		//Size=>10
		//int
		
		int first=11;
		int[] arr=new int[10];
		for(int i=0;i<10;i++) //0=>9=>index
		{ 
			//0,1,2,3,4,5,6,7,8,9
			arr[i]=first; //11
			first++;
			//11,12,13,14,15,16,17,18,19,20 $$ 11=>20=>elements
			
		}
		
		System.out.println(arr[9]);
		

	}

}
