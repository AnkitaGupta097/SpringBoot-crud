package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Employee;
import service.EmployeeService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@GetMapping("/")
	public List<Employee>get()
	{
		System.out.println("in controller");
		return service.get();
	}
	
	@PostMapping("/")
	public Employee create(@RequestBody Employee empObj)
	{
		service.save(empObj);
		return empObj;
	}
}
