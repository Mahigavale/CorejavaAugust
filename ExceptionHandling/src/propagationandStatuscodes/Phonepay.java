package propagationandStatuscodes;

public class Phonepay {

	public static void main(String[] args)  {
		
		try {
		UpiHolder.doPayment("001121",70001);
		}
		catch(InsuffiecentAmountException ex)
		{
			System.out.println(ex.getMessage());
			System.out.println("Code:"+ex.getCode());
			
		}
		catch(InvalidPinException ex)
		{
			System.out.print(ex.getMessage() +" ::"+ ex.getCode()+":code"+ "caused by:"+ ex.getCause());
			
		}

		System.out.println("------------THE END -------------------");
	}

}

class UpiHolder
{
	
	public static void doPayment(String str, int amount) throws InvalidPinException,InsuffiecentAmountException
	{ 
		String pass="001122";
		  int  balance=70000;
		
		if( pass.equals(str)==false)
		{
			throw new InvalidPinException("Wrong UPI password...",100, new Throwable("Worng password entered"));
		}
		
		System.out.println("Intiating payment.....!!!");
		System.out.println("doing payment.....!!");
		
		if(amount>balance)
		{
			throw new InsuffiecentAmountException("low amount",500);
		}
		 balance=balance-amount ;
		
		 System.out.println("now the balance is:"+balance);
		
	}
}