/**
 * 
 */
package fr.diginamic;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @author antPinot
 *
 */
@Entity
@Table
public class Livre {

	@Id
	@Column(name = "ID")
	private Integer id;
	
	@ManyToMany(mappedBy = "livres")
	private Set<Emprunt> emprunts;
	
	@Column(name="TITRE", length = 255, nullable = false, unique = false)
	private String titre;
	
	@Column(name="AUTEUR", length = 100, nullable = false, unique = false)
	private String auteur;

	/**
	 * Constructeur
	 * 
	 */
	public Livre() {
	}

	@Override
	public String toString() {
		return "\nLivre : id = " + id + " titre = " + titre + ", auteur = " + auteur;
	}

	/**
	 * Getter pour l'attribut id
	 * 
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Setter pour l'attribut id
	 * 
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
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

	/**Getter pour l'attribut titre
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}

	/**Setter pour l'attribut titre
	 * @param titre the titre to set
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}

	/**Getter pour l'attribut auteur
	 * @return the auteur
	 */
	public String getAuteur() {
		return auteur;
	}

	/**Setter pour l'attribut auteur
	 * @param auteur the auteur to set
	 */
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	

}
