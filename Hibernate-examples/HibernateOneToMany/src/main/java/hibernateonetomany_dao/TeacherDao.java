package hibernateonetomany_dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hibernateonetomany_dto.Teacher;

public class TeacherDao {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("supriya");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	public Teacher saveTeacher(Teacher teacher)
	{
		et.begin();
		em.persist(teacher);
		et.commit();
		return teacher;
	}
	
	public Teacher findTeacher(int teacherId)
	{
		et.begin();
		Teacher existingTeacher = em.find(Teacher.class, teacherId);
		et.commit();
		return existingTeacher;
	}
	
	public Teacher updateTeacher(Teacher teacher,int teacherId)
	{
		Teacher existingTeacher= em.find(Teacher.class , teacherId);
		if(existingTeacher != null)
		{
			teacher.setTeacherId(teacherId);
			et.begin();
			em.merge(teacher);
			et.commit();
			
			return teacher;
		}
		
		else {
			System.out.println("teacher does not exist with the given id");
			return null;
		}
	}
}
