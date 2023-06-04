package daolayer;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import school.Student;

public class Studentdao {
	public Student findStudent(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("supriya");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		et.begin();
		Student s = em.find(Student.class, id);
		et.commit();
		return s;

	}

	public Student updateStudent(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("supriya");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Student st = em.find(Student.class, id);
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter the  new number");
		Long number = s.nextLong();
		
		st.setNumber(number);

		et.begin();
		em.merge(st);
		et.commit();
		
		return st;
	}

	public static void main(String[] args) {
		// find method
		Scanner scan = new Scanner(System.in);
//
//		System.out.println("enter the id of the student");
//		int id = scan.nextInt();
//
//		Studentdao dao = new Studentdao(); // dao
//		Student s2 = dao.findStudent(id); // dto
//		System.out.println(s2);

		System.out.println("enter the id of the student, you want to update");
		int id = scan.nextInt();

		Studentdao dao = new Studentdao();
		Student s2 = dao.updateStudent(id);
		System.out.println(s2);

	}

}
