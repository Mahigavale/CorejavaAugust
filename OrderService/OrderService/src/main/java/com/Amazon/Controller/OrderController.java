package com.Amazon.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	static int Counter=1;
	/**
	 * GET
	 * POST
	 * DELETE
	 * PUT
	 * PATCH
	 * @return
	 * @throws InterruptedException 
	 */
	@GetMapping("/create")
	public int[] CreateOrder() throws InterruptedException
	{
		
		Thread.sleep(6000);
		System.out.println(Counter++);
		return  new int[] {10,20,30};
	}

	
//	@GetMapping("/-create")
//	public String Create()
//	
//	{
//		return "Dhappa";
//	}
}
