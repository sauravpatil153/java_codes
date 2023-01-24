package pojos;

import java.time.LocalDate;
import javax.persistence.*;

@Entity
@Table(name = "employees",uniqueConstraints = 
@UniqueConstraint(columnNames = {"first_name","last_name"}) )
public class Employee {
	@Id//PK
	@GeneratedValue(strategy = GenerationType.IDENTITY)//mysql behaviour auto_incremented ids
	@Column(name = "emp_id")
	private Long empId;
	@Column(name = "first_name",length = 30)
	private String firstName;
	@Column(name = "last_name",length = 30)
	private String lastName;
	@Enumerated(EnumType.STRING)//column type:varchar, enum constants type
	@Column(length = 25,name = "dept")
	private Department department;
	private Double salary;
	private LocalDate dob;
	@Column(name = "is_permanent")
	private Boolean isPermanent;

	public Employee(String firstName, String lastName, Department department, Double salary, LocalDate dob,
			Boolean isPermanent) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.salary = salary;
		this.dob = dob;
		this.isPermanent = isPermanent;
	}
	
	public Employee(Long empId, String firstName, String lastName, Double salary) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public Employee() {
		super();
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long id) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Boolean getIsPermanent() {
		return isPermanent;
	}

	public void setIsPermanent(Boolean isPermanent) {
		this.isPermanent = isPermanent;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", department="
				+ department + ", salary=" + salary + ", dob=" + dob + ", isPermanent=" + isPermanent + "]";
	}
	
}
