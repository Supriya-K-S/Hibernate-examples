package controller;

import java.util.ArrayList;
import java.util.List;

import hibernateonetomany_dao.SchoolDao;
import hibernateonetomany_dao.TeacherDao;
import hibernateonetomany_dto.School;
import hibernateonetomany_dto.Teacher;

public class SchoolTeacherDriver {

	public static void main(String[] args) {
		Teacher teacher1 = new Teacher();
		teacher1.setTeacherName("vicky");
		teacher1.setTeacherNumber(67666878);
		teacher1.setTeacherSalary(1000000);
		teacher1.setSubject("acting");

		Teacher teacher2 = new Teacher();
		teacher2.setTeacherName("salman");
		teacher2.setTeacherNumber(676776767);
		teacher2.setTeacherSalary(20000);
		teacher2.setSubject("driving");

		List<Teacher> teachers = new ArrayList<Teacher>();
		teachers.add(teacher1);
		teachers.add(teacher2);

		School school = new School();
		school.setSchoolName("Narayana");
		school.setSchoolAddress("hyderabad");
		school.setSchoolNumber(78677876);
		school.setTeachers(teachers);

		SchoolDao schooldao = new SchoolDao();

		System.out.println(schooldao.saveSchool(school));

//		SchoolDao dao = new SchoolDao();
//		School existingSchool = dao.findSchool(2);
//		List<Teacher> schoolTeachers = existingSchool.getTeachers();// fetch all teachers present in the school
//
//		// print teacherId,name,phone present in School
//		for (Teacher teacher : schoolTeachers) {
//			System.out.println(
//					teacher.getTeacherId() + " " + teacher.getTeacherName() + " " + teacher.getTeacherNumber());
//		}
//
//		SchoolDao schoolDao = new SchoolDao();
//		School existingschool = schoolDao.findSchool(2);
//		List<Teacher> schoolteachers = existingschool.getTeachers();
//		
//		for(Teacher teacher : schoolteachers)
//		{
//			if(teacher.getTeacherId() == 1)
//			{
//				teacher.setTeacherSalary(3000000);
//				TeacherDao teacherdao = new TeacherDao();
//				System.out.println(teacherdao.updateTeacher(teacher, 1));
//			}
//		}
//		
//		
//		
	}

}
