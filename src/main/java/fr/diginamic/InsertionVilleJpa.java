package fr.diginamic;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertionVilleJpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("recensement2");
		EntityManager em= entityManagerFactory.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		
		transaction.begin();
		
		//date 
		Date d= (Date) Calendar.getInstance().getTime();
		
		Region r1= new Region();
		r1.setNom("Bretagne");
		em.persist(r1);
		
		Region r2= new Region();
		r2.setNom("Corse");
		em.persist(r2);
		
		Region r= new Region();
		r.setNom("Hauts de France");
		em.persist(r);
		
		Ville q = new Ville();
		q.setNom("Quimper");
		q.setCP(29000);
		q.setCat(Categorie.MOYENNE);
		q.setDater(d);
		em.persist(q);
		q.setRegion(r1);
		System.out.println(q);
		
		Habitant z=new Habitant();
		z.setNom("Pagani");
		z.setPrenom("Horacio");
		em.persist(z);
		q.getHabs().add(z);
		
		transaction.commit();
	}
}
