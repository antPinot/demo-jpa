/**
 * 
 */
package fr.diginamic;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author antPinot
 *
 */

@Entity
@Table
public class Client {
	
	@Id
	private Integer id;
	
	@Column(name="NOM", length = 100, nullable = false, unique = false)
	private String nom;
	
	@Column(name="PRENOM", length = 100, nullable = false, unique = false)
	private String prenom;
	
	@OneToMany(mappedBy = "client")
	private Set<Emprunt> emprunts;

	/**Constructeur
	 * 
	 */
	public Client() {
		this.emprunts = new HashSet<Emprunt>();
	}

	@Override
	public String toString() {
		return "\nClient : id = " + id + ", nom = " + nom + ", prenom = " + prenom;
	}

	/**Getter pour l'attribut id
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**Setter pour l'attribut id
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**Getter pour l'attribut nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**Setter pour l'attribut nom
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**Getter pour l'attribut prenom
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**Setter pour l'attribut prenom
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	/**Getter pour l'attribut emprunts
	 * @return the emprunts
	 */
	public Set<Emprunt> getEmprunts() {
		return emprunts;
	}

	/**Setter pour l'attribut emprunts
	 * @param emprunts the emprunts to set
	 */
	public void setEmprunts(Set<Emprunt> emprunts) {
		this.emprunts = emprunts;
	}

}
