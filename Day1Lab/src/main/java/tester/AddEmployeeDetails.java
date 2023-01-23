package tester;
import static utils.HibernateUtils.getFactory;

import java.time.LocalDate;
import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.EmployeeDaoImpl;
import pojos.Department;
import pojos.Employee;

public class AddEmployeeDetails {

	public static void main(String[] args) {
		try(SessionFactory sf = getFactory();
			Scanner sc = new Scanner(System.in)) 
		{
			EmployeeDaoImpl empDao = new EmployeeDaoImpl();
			System.out.println("Enter firstName, lastName, department, salary, dob, isPermanent");
			//create transient emp
			Employee newEmp = new Employee(sc.next(), sc.next(), Department.valueOf(sc.next().toUpperCase()),
					sc.nextDouble(), LocalDate.parse(sc.next()), sc.nextBoolean());
			//invoke dao method
			System.out.println(empDao.addEmpDetails(newEmp));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
