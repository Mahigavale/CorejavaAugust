package one;


public class bank_another {

	public static void main(String[] args) {
		 Bank bank =new Bank();
		 /**
		  * Accessing with the help of the object
		  * in different class of same package.
		  */
		 System.out.println("WIth the OBJECT::");
		 bank.display();
		 bank.pincode();
		 bank.branchmanager();
		 /**
		  * name is: SBI  Public
            434343       Protected
            Alex wails   default
		  */

		 
		 /**
		  * NOW I AM ACCESSING WITH the 
		  * inheritance in the different class
		  * of the same package.
		  */
		 
		 remo re=new remo();
		 
		 System.out.println("********************************");
		 System.out.println("WITH THE INHERITANCE..");
		 re.display();
		 re.pincode();
		 re.branchmanager();
		 /**
		  * name is: SBIPublic
            434343  Protected
            Alex wails   default
		  */
	}

}

class remo extends Bank
{
	
}
