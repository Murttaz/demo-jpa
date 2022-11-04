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
			for (Emprunt emp: book.getEmprunts1()) {
				System.out.println(emp);
			}
		}
		
		
		
		Client customer= new Client();
		customer.setNom("Lamborghini");
		customer.setPrenom("Ferucio");
		Adresse a=new Adresse();
		a.setLibelleVoie("8 rue de sicile");
		a.setCodePostal(29000);
		a.setVille("Quimper");
		customer.setAdresse(a);
		em.persist(customer);
		transaction.commit();

	}

}
