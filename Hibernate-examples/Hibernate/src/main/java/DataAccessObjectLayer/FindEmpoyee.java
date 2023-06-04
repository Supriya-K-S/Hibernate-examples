package DataAccessObjectLayer;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import DataTransferObjectLayer.Employee;

public class FindEmpoyee {
	public static void main(String[] args) {
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("supriya");
		//EntityManagerFactory emf =  Persistence.createEntityManagerFactory(persistence-unit name);
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
	
		et.begin();
	    Employee e1 = em.find(Employee.class, 1);
	    System.out.println(e1);
		et.commit();
		
	}
}
