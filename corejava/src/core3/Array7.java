package core3;

public class Array7 {

	public static void main(String[] args) {
		
		int[] arr=new int[10000];//400Bytes
		//[4][4][4][4]
           
		
		
		for(int i=0;i<10000;i++)
		{
			arr[i]=i+1; //arr[0]=0+1=> arr[1]=1+1=>arr[99]=>100
		}
		
		
		for(int i=0;i<10000;i++)
		{
			System.out.println("arr["+i+"]"+" <=index: element=>"+arr[i]);
		}
		
		
		System.out.println("arr["+100+"]");
		System.out.println("a"+100+"b"+("::::B"+100+100+"a"+100));
		System.out.println("************");
		System.out.println('A'+1); //65
		System.out.println("A"+1);
		
	}

}
