package pojos;

import java.time.LocalDate;
import javax.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "admissions_tbl",uniqueConstraints = 
{ @UniqueConstraint(columnNames = {"course_id","student_id"})})
public class Admission extends BaseEntity{
	@Column(name = "admission_date")
	@CreationTimestamp
	private LocalDate admissionDate;
	@Column(name = "result_date")
	private LocalDate resultDate;
	@Enumerated
	@Column(name = "admission_status",length = 20)
	private Status admissionStatus;
	@ManyToOne
	@JoinColumn(name = "course_id")
	private Course chosenCourse;
	@ManyToOne
	@JoinColumn(name = "student_id")
	private Student candidate;
	
	public Admission(LocalDate admissionDate, LocalDate resultDate, Status admissionStatus) {
		super();
		this.admissionDate = admissionDate;
		this.resultDate = resultDate;
		this.admissionStatus = admissionStatus;
	}

	public Admission() {
		super();
	}

	public LocalDate getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(LocalDate admissionDate) {
		this.admissionDate = admissionDate;
	}

	public LocalDate getResultDate() {
		return resultDate;
	}

	public void setResultDate(LocalDate resultDate) {
		this.resultDate = resultDate;
	}

	public Status getAdmissionStatus() {
		return admissionStatus;
	}

	public void setAdmissionStatus(Status admissionStatus) {
		this.admissionStatus = admissionStatus;
	}

	public Course getChosenCourse() {
		return chosenCourse;
	}

	public void setChosenCourse(Course chosenCourse) {
		this.chosenCourse = chosenCourse;
	}

	public Student getCandidate() {
		return candidate;
	}

	public void setCandidate(Student candidate) {
		this.candidate = candidate;
	}

	@Override
	public String toString() {
		return super.toString() +" Admission [admissionDate=" + admissionDate + ", resultDate=" + resultDate + ", admissionStatus="
				+ admissionStatus + "]";
	}
	
	
}
