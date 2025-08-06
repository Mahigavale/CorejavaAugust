package core;

public class Dowhile {

	public static void main(String[] args) {
		
		
		
		//ICBO
		int i=21; //initialization      ::Initialization
		while(i<=20)	 //condition
		{
			 System.out.println(i); //block
			 i++;//operation
		}
		
		do      //block    //IBOC
		{
			System.out.println(i);
			i++;    //operation
		}while(i<=20); //condition

	}

}
