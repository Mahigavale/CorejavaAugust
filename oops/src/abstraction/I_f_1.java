package abstraction;

public class I_f_1 {

	public static void main(String[] args) {
	
	 I_UPI ip=new Phone_pe();
	 
	System.out.println( ip.sendmoney_to_account("131122", 4423.45));
	}
}


interface  I_UPI
{
	public String sendmoney_to_account(String account_number, double amount);
	
	public String recievemoney(String number, double amount);
	
}
class Phone_pe implements I_UPI
{

	
	public String sendmoney_to_account(String account_number, double amount) {
		
		return "money sent to:"+account_number+":Amount:"+amount;
	}

	
	public String recievemoney(String number, double amount) {
	
		return null;
	}


	
}

class Google_pay implements I_UPI
{

	
	public String sendmoney_to_account(String account_number, double amount) {
		
		return "GOOGLE PAYYYYYYYYYYYYYYYYYYYYYYY"+amount;
	}

	
	public String recievemoney(String number, double amount) {
		
		return null;
	}
	
}