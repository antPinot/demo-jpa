package fr.diginamic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

public class ConnexionJpa {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu_essai");
		EntityManager em = entityManagerFactory.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		
		Region region = em.find(Region.class, 1);
		if (region != null) {
			System.out.println(region);
		}
		
		transaction.begin();
		
		Region licornie = new Region();
		licornie.setNom("Licornie");
		licornie.setPopulation(3);
		licornie.setCode("333");
		em.persist(licornie);
		
		transaction.commit();
		
	}

}
