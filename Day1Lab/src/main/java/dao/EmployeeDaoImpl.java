package dao;

import pojos.Department;
import pojos.Employee;
import org.hibernate.*;
import static utils.HibernateUtils.getFactory;

import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public String addEmpDetails(Employee newEmp) {
		// newEmp : TRANSIENT entity,pojo
		String mesg = "Employee Insert Failed";
		// 1.Get session of SF
		Session session = getFactory().getCurrentSession();

		// 2.Begin a Transaction
		Transaction tx = session.beginTransaction();

		try {
			// Session API : public Serializable(Obj transientObjRef) throws Hibernate
			// Excepn
			Long empId = (Long) session.save(newEmp);
			// newEmp : PERSISTENT => entity ref added to L1 cache
			tx.commit();// hibernate performs dirty checking => session.flush()
			// DML -> insert -> session.close() -> L1 cache destroyed, returns DB connectn
			// to DB Connectn Pool
			// newEmp : DETACHED(from L1 cache)
			mesg = "Added emp details, ID = " + empId;
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			// rethrow the same excepn to the all caller, so the caller
			// will know about the exception
			throw e;
		}
		return mesg;
	}

	@Override
	public List<Employee> getEmployeesByDeptSal(Department dept, double sal) {
		List<Employee> employees = null;
		String jpql = "select e from Employee e where e.department=:dp and e.salary>:sl";
		Session session = getFactory().getCurrentSession();
		Transaction tx = session.beginTransaction();
		try {
			employees = session.createQuery(jpql, Employee.class)
					.setParameter("dp", dept)
					.setParameter("sl", sal)
					.getResultList();
			tx.commit();
		} catch (RuntimeException e) {
			if(tx!=null)
				tx.rollback();
			throw e;
		}
		return employees;
	}
	
	

}
