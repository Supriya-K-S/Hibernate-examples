package DataAccessObjectLayer;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import DataTransferObjectLayer.Employee;

public class InsertEmployee {
	public static void main(String[] args) {
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("supriya");
		//EntityManagerFactory emf =  Persistence.createEntityManagerFactory(persistence-unit name);
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		
	Employee e1 = new Employee();
		e1.setId(1);
		e1.setName("supriyaks");
		e1.setPhone(884234);
		
		et.begin();
		em.persist(e1);	   
		et.commit();
		
	}
}
