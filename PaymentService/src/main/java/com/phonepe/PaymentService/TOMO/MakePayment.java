package com.phonepe.PaymentService.TOMO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MakePayment {

	
	 
	@Autowired
	@Qualifier("PhonePe")
	 private Payment_Interface payment;
	 
	 
	
	
	public void DoTransaction()
	{
		
		System.out.println("Making the Paymenttt...");
		payment.doPayment();
		System.out.println("Payment done!");
	}
	
	
//	@Autowired
//	public void Setpayment(@Qualifier("PhonePe")Payment_Interface payment)
//	{
//		this.payment=payment;
//		System.out.println("setter I");
//	}
	
	
//	@Autowired
//	public MakePayment( @Qualifier("PhonePe") Payment_Interface payment)
//	{
//		this.payment=payment;
//		System.out.println("Make Payment Object created!!!!");
//		System.out.println("CI");
//	}
//	
//	
	public MakePayment()
	{
		System.out.println("normal payment");
		
	}
}
