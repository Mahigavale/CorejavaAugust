package core2;

public class Demo4 {

	public static void main(String[] args) {
		

		Aeroplane indigo=new Aeroplane(); //Instance/Object
		indigo.fly();
		
		System.out.println(indigo.price);
		
	}

}

class Aeroplane{
	 double price=4839393.78;
	 
	 
	 public void fly() {
		 System.out.println("aeroplane get fly");
	 }
	
	
}