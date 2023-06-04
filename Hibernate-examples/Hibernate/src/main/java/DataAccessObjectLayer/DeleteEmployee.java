package DataAccessObjectLayer;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import DataTransferObjectLayer.Employee;
public class DeleteEmployee {
	public static void main(String[] args) {
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("supriya");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		Employee e1 = em.find(Employee.class, 1);
		em.remove(e1);
		et.commit();
	}
}
