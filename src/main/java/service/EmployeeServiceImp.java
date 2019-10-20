package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.EmployeeDao;
import model.Employee;

@Service
public class EmployeeServiceImp implements EmployeeService{
	
@Autowired
	private EmployeeDao employeeDao;
	
	@Transactional
	@Override
	public List<Employee> get() {
		System.out.println("in service");
	return	employeeDao.get();
		
	}
	@Transactional
	@Override
	public Employee get(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	@Override
	public void save(Employee emp) {
employeeDao.save(emp);
		
	}
	@Transactional
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
