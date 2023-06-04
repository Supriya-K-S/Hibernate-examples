package hibernateonetomany_dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int schoolId;
    private String schoolName;
    private long schoolNumber;
    private String schoolAddress;
    @OneToMany(cascade = CascadeType.ALL)
    private  List<Teacher> teachers;
	public int getSchoolId() {
		return schoolId;
	}
	public void setSchoolId(int schoolId) {
		this.schoolId = schoolId;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public long getSchoolNumber() {
		return schoolNumber;
	}
	public void setSchoolNumber(long schoolNumber) {
		this.schoolNumber = schoolNumber;
	}
	public String getSchoolAddress() {
		return schoolAddress;
	}
	public void setSchoolAddress(String schoolAddress) {
		this.schoolAddress = schoolAddress;
	}
	public List<Teacher> getTeachers() {
		return teachers;
	}
	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}
	@Override
	public String toString() {
		return "School [schoolId=" + schoolId + ", schoolName=" + schoolName + ", schoolNumber=" + schoolNumber
				+ ", schoolAddress=" + schoolAddress + ", teachers=" + teachers + "]";
	}
	
    
    
    
}
