package pojos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "courses_tbl")
public class Course extends BaseEntity{
	@Column(name="title",length = 30,unique = true)
	private String courseTitle;
	@Column(name="start_date")
	private LocalDate startDate;
	@Column(name="end_date")
	private LocalDate endDate;
	
	private Double fees;
	
	private Integer capacity;
	
	@OneToMany(mappedBy = "chosenCourse",cascade = CascadeType.ALL,orphanRemoval = true)
	private List<Admission> coursesAdmissions = new ArrayList<>();

	public Course(String courseTitle, LocalDate startDate, LocalDate endDate, Double fees, Integer capacity) {
		super();
		this.courseTitle = courseTitle;
		this.startDate = startDate;
		this.endDate = endDate;
		this.fees = fees;
		this.capacity = capacity;
	}

	public Course() {
		super();
	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public Double getFees() {
		return fees;
	}

	public void setFees(Double fees) {
		this.fees = fees;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return super.toString()+" Course [courseTitle=" + courseTitle + ", startDate=" + startDate + ", endDate=" + endDate + ", fees="
				+ fees + ", capacity=" + capacity + "]";
	}
}
