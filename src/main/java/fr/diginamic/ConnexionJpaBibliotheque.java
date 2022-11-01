/**
 * 
 */
package fr.diginamic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 * @author antPinot
 *
 */
public class ConnexionJpaBibliotheque {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("connexion-bibliotheque");
		EntityManager em = entityManagerFactory.createEntityManager();

		Livre livre = em.find(Livre.class, 2);
		if (livre != null) {
			System.out.println("Le livre associé à l'id n°2 est : " + livre);
		}
		
		Emprunt emprunt = em.find(Emprunt.class, 1);
		if (emprunt != null) {
			System.out.println("Les livres associés à l'emprunt n°1 sont :\n" + emprunt.getLivres());
		}
		
		
		Client client = em.find(Client.class, 1);
		if (client != null) {
			System.out.println("Les emprunts associés au client n°1 sont :\n" + client.getEmprunts());
		}

	}

}
