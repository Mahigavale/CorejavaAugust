package methodsdeep;

public class Calculator {

	public static void main(String[] args) {
		

		 Calc calc=new Calc();
		 
		
		calc.addition(100,100); //arguments
		
		calc.addition(50, 50);
		
		calc.addition(10, 10);
		
		
		calc.substraction(100, 10);
		
		
		calc.multiplication(10, 10, 10);
		
		
		calc.divison(12.0f, 3.0f);
	}

}

class Calc
{
	 public void addition(int num1,int num2) //parameters+return type=> Signature of the Method.
	 {
		 System.out.println(num1+num2);
	 }
	 
	 public void substraction(int num1, int num2)
	 {
		 System.out.println(num1-num2);
	 }
	 
	 public void multiplication(double num1,double num2, double num3)
	 {
		 System.out.println(num1*num2*num3);
	 }
	 
	 public void divison(float num1, float num2)
	 {
		 System.out.println(num1/num2);
	 }
}