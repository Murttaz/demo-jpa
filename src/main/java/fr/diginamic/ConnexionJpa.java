package fr.diginamic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ConnexionJpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("recensement2");
		EntityManager em= entityManagerFactory.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		
		transaction.begin();
		Region re = em.find(Region.class, 1);
		if (re !=null) {
			System.out.println(re);
		}
	
		
		
		Region r=new Region();
	
		r.setNom("Hauts de France");
		em.persist(r);
		System.out.println(r);
		
		
		
		transaction.commit();
	}

}
