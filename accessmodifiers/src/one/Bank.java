package one;

public class Bank {

	public void display()
	{
		System.out.println("name is: SBI"+"Public");
	}
	
	protected void pincode()
	{
		System.out.println("434343"+"  Protected");
	}
	
	void branchmanager()
	{
		System.out.println("Alex wails"+"   default");
	}
	
	private void totalcash()
	{
		System.out.println("123.56 lakhs"+"  Private");
	}
	public void demo() {
		/**
		 * Everything is accessible in the 
		 * same class.
		 */
	display();
	pincode();
	branchmanager();
	totalcash();
	}
}
