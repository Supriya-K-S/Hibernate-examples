package hibernateonetomany_dao;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hibernateonetomany_dto.School;

public class SchoolDao {

	EntityManagerFactory emf =  Persistence.createEntityManagerFactory("supriya");
	//EntityManagerFactory emf =  Persistence.createEntityManagerFactory(persistence-unit name);
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	public School saveSchool(School school)
	{
		et.begin();
		em.persist(school);
		et.commit();
		
		return school;
	}
	public School findSchool(int schoolId)
	{
		et.begin();
		School existingSchool = em.find(School.class, schoolId);
		et.commit();
		return existingSchool;
	}
	
	public School  updateSchool(School school, int schoolId)
	{
		School existingSchool = em.find(School.class , schoolId);
		if(existingSchool != null)
		{
			school.setSchoolId(schoolId);
			et.begin();
			em.merge(school);
			et.commit();
		
		return school;
		}
		else
		{
			System.out.println("school not available with given id");
			return null;
		}
	}
	
	public School deleteSchool(int schoolId)
	{
		School existingSchool = em.find(School.class, schoolId);
		if(existingSchool != null)
		{
			et.begin();
			em.remove(existingSchool);
			et.commit();
			return existingSchool;
		}
		else
		{
			System.out.println("school not present with the given id");
			return null;
		}
	}

}
