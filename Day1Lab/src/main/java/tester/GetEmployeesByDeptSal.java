package tester;
import static utils.HibernateUtils.getFactory;
import java.time.LocalDate;
import java.util.Scanner;
import org.hibernate.SessionFactory;
import dao.EmployeeDaoImpl;
import pojos.Department;
import pojos.Employee;
import static pojos.Department.valueOf;

public class GetEmployeesByDeptSal {

	public static void main(String[] args) {
		try(SessionFactory sf = getFactory();
			Scanner sc = new Scanner(System.in)) 
		{
			EmployeeDaoImpl empDao = new EmployeeDaoImpl();
			System.out.println("Enter Department and Salary");
			empDao.getEmployeesByDeptSal(valueOf(sc.next().toUpperCase()), sc.nextDouble())
			.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
