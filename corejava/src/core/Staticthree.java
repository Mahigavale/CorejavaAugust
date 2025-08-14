package core;

public class Staticthree {

	public static void main(String[] args) {
		
		Beach mahesh=new Beach();
		mahesh.name="Konkan";
		
		
		Beach sahil=new Beach();
		sahil.name="Goa";
		
		
		System.out.println(mahesh.name);
		System.out.println(sahil.name);
		System.out.println(Beach.name);

	}

}

class Beach
{
	static  String name="Kerala";
}