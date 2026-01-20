package com.phonepe.PaymentService.TOMO;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("PhonePe")
@Lazy
public class PhonePe implements Payment_Interface {

	@Override
	public void doPayment() {
		
		System.out.println("Payment done using the Phone Pe!");
	}

	
	public PhonePe()
	{
		System.out.println("Phone pe Object created!!!!");
	}
}
