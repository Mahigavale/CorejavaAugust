package initial;

public class Demo{

	public static void main(String[] args) {
		
		
		Car car=new Car(100.0,200); //default constructor call.
		      //new Car(int num):
		car.display();
	}

}

class Car
{
	int age;
	public void display()
	{
		System.out.println("display method of the car..");
	}
	
	public Car() //Car()
	{
		System.out.println("MAza constructor");
	}
	
	public Car(int num) //Car(int num)
	{
		System.out.println("constructor with int parameter...");
		System.out.println(num);
	}
	
	public  Car(double d, int num)// Car(double d, int num)=> Car(10.0,10)
	{
		System.out.println(d+num);
	}
}