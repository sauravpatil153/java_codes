package dao;

import java.util.List;
import pojos.Department;
import pojos.Employee;

public interface EmployeeDao {
//add a method to save employee details
	String addEmpDetails(Employee newEmp);
	
	List<Employee> getEmployeesByDeptSal(Department dept, double sal);
	
	List<Employee> getDetailsOfPermanentEmps();
}
