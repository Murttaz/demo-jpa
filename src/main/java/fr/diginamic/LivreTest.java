package fr.diginamic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class LivreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("bibli");
		EntityManager em= entityManagerFactory.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		
		transaction.begin();
		Livre book=em.find(Livre.class,2);
		if (book !=null) {
			System.out.println(book);
		}
		

	}

}
