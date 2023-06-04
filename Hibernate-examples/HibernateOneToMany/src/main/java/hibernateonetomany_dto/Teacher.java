package hibernateonetomany_dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Teacher {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   private int teacherId;
	private String teacherName;
	private long teacherNumber;
	private String subject;
	private double teacherSalary;
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public long getTeacherNumber() {
		return teacherNumber;
	}
	public void setTeacherNumber(long teacherNumber) {
		this.teacherNumber = teacherNumber;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public double getTeacherSalary() {
		return teacherSalary;
	}
	public void setTeacherSalary(double teacherSalary) {
		this.teacherSalary = teacherSalary;
	}
	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", teacherName=" + teacherName + ", teacherNumber=" + teacherNumber
				+ ", subject=" + subject + ", teacherSalary=" + teacherSalary + "]";
	}
	
   
}
