package advanced;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Second {

	public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {
	
	
		
		Custom cust=new Custom();
		
		
		System.out.println(cust.get());
		
		System.out.println(cust.get(10, TimeUnit.SECONDS));
	}
}

class Custom implements Future<String>
{

	@Override
	public boolean cancel(boolean mayInterruptIfRunning) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCancelled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isDone() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String get() throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		return "Demo get";
	}

	@Override
	public String get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
		// TODO Auto-generated method stub
		
		boolean flag=true;
		if(flag)
		{
		throw new TimeoutException("Tera net slow hai kya!");
		}
		while(flag)
		{
			
		}
		return "demo";
	}
	
}