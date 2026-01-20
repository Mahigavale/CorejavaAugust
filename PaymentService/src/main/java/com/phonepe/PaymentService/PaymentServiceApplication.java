package com.phonepe.PaymentService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.phonepe.PaymentService.TOMO.GooglePay;
import com.phonepe.PaymentService.TOMO.MakePayment;


@SpringBootApplication
public class PaymentServiceApplication {

	public static void main(String[] args) throws InterruptedException {
		 
	ApplicationContext context=SpringApplication.run(PaymentServiceApplication.class, args);
	
	     String[] arr=context.getBeanDefinitionNames();
	     System.out.println("Total Beans Size:"+arr.length);
	     
//	     System.out.println("*************************************");
//	     for(String s :arr)
//	     {
//	    	 System.out.println(s);
//	     }
//	     System.out.println("*************************");
//	     
       MakePayment pay=context.getBean(MakePayment.class);
       
       pay.DoTransaction();
       
//       System.out.println("Creating the Objet of GooglePay");
//       
//       
//       Thread.sleep(5000);
//       
//     GooglePay pay2= context.getBean(GooglePay.class);
//     
     
       
	}

}
