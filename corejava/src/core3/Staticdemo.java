package core3;

public class Staticdemo {

	public static void main(String[] args) {
		
		
		Human mahesh=new Human();
		mahesh.name="Mahesh";
		mahesh.height=100;
		mahesh.weight=60;
		mahesh.age=16;
		
		mahesh.alive();
		
		
		Human avi=new Human();
		avi.name="Avinash";
		avi.height=150;
		avi.weight=45;
		avi.age=21;
		
		avi.alive();
		
		
		Human atharva=new Human();
		
		atharva.name="Atharva";
		atharva.height=160;
		atharva.weight=55;
		atharva.age=24;
		
		atharva.alive();
		
		
		System.out.println("avi:"+avi.name);
		System.out.println("MAhesh:"+mahesh.name);
		System.out.println("Atharva:"+atharva.name);
		
		
		
		
		
	}

}

class Human
{
	static String name;
	int height;
	int age;
	int weight;
	
	public  void alive()
	{
		System.out.println("yes I am alive");
		System.out.println(name);
	}
	
}