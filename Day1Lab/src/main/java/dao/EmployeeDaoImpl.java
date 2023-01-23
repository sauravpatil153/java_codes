package dao;

import pojos.Employee;
import org.hibernate.*;
import static utils.HibernateUtils.getFactory;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public String addEmpDetails(Employee newEmp) {
		//newEmp : TRANSIENT entity,pojo
		String mesg = "Employee Insert Failed";
		// 1.Get session of SF
		Session session = getFactory().getCurrentSession();

		// 2.Begin a Transaction
		Transaction tx = session.beginTransaction();

		try {
			// Session API : public Serializable(Obj transientObjRef) throws Hibernate
			// Excepn
			Long empId = (Long) session.save(newEmp);
			//newEmp : PERSISTENT => entity ref added to L1 cache
			tx.commit();//hibernate performs dirty checking => session.flush()
			//DML -> insert -> session.close() -> L1 cache destroyed, returns DB connectn to DB Connectn Pool
			//newEmp : DETACHED(from L1 cache)
			mesg = "Added emp details, ID = " + empId;
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			// rethrow the same excepn to the all caller, so the caller
			// will know about the exception
			throw e;
		}
		return null;
	}

}
