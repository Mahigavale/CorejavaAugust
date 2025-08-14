package core;

public class Statictwo {

	public  static void main(String[] args) {
		

		
		Phone phone=new Phone();
		
		phone.phoneprice=1000;
		//System.out.println(phone.phoneprice);//
		
		
		Phone two=new Phone();
	
		//System.out.println(two.phoneprice); //
		
		Phone three=new Phone();
		
		
		System.out.println(phone.phoneprice);
		System.out.println(two.phoneprice);
		System.out.println(three.phoneprice);
		
		
	}

}


class Phone
{
	 static  double phoneprice=3400;
	
	
}