package com.Amazon.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Amazon.DTO.EmployeeDto;
import com.Amazon.Entity.Employee;

@RestController
@RequestMapping("/employeeController")
public class EmployeeController {
	
	
	List<Employee> uss=new ArrayList<Employee>();
	
	
	
	@PostMapping("/add-employee")
    public Employee addemployee(@RequestBody Employee employee)
    {
		
	     if(employee!=null)
	     {
	    	  uss.add(employee);
	    	  System.out.println("Size of DB:"+uss.size());
	    	  
	    	  System.out.println(employee.getName()+" of Company :"+employee.getCompany().getCompany_name()+"added sucessfully");
	     }
	     
	     return employee;
    }
	
	@GetMapping("/get-all")
	public List<EmployeeDto> getall()
	{
		 return    uss.stream().map((i)->{
			   EmployeeDto dto=new EmployeeDto();
			    dto.setCompany_name(i.getCompany().getCompany_name());
			    dto.setEid(i.getEid());
			    dto.setGst_number(i.getCompany().getGst_number());
			    dto.setName(i.getName());
			    return dto;
		   }).collect(Collectors.toList());
	}

}
