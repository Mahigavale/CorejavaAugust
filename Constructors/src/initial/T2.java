package initial;

public class T2 {

	public static void main(String[] args) {
		
      Matrix mahesh=new Matrix("Pune");
     
      mahesh.printcity();
      System.out.println("*********************");
      
      Matrix aakash=new Matrix("Mumbai");
       aakash.printcity();
	}

}

class Matrix
{
	String city; //Pune //Mumbai
	
	                     //Pune ??Mumbai
	public Matrix(String city_name)
	{  this.city=city_name;
		System.out.println("Object created");
	
	}
	
	public void printcity()
	{
		System.out.println(this.city);//Pune ?? Mumbai
	}
	
}