package dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;




import model.Employee;

@Repository
public class EmployeeDaoImp implements EmployeeDao {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Employee> get() {
	Session currentSession=entityManager.unwrap(Session.class);
		Query<Employee> query=currentSession.createQuery("from employee",Employee.class);
		List<Employee> list=query.getResultList();
		System.out.println("in dao");
		return list;
	}

	@Override
	public Employee get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Employee emp) {
		Session currentSession=entityManager.unwrap(Session.class);
		currentSession.save(emp);
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
