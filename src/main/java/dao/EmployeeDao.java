package dao;

import java.util.List;

import model.Employee;

public interface EmployeeDao {

	List<Employee>get();
	Employee get(int id);
	void save(Employee emp);
	void delete(int id);
}
