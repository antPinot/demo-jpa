/**
 * 
 */
package fr.diginamic;

import java.sql.Timestamp;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author antPinot
 *
 */
@Entity
@Table
public class Emprunt {

	@Id
	@Column(name = "ID")
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "ID_CLIENT")
	private Client client;

	@ManyToMany
	@JoinTable(name = "COMPO", joinColumns = @JoinColumn(name = "ID_EMP", referencedColumnName = "ID"), inverseJoinColumns = @JoinColumn(name = "ID_LIV", referencedColumnName = "ID"))
	private Set<Livre> livres;

	@Column(name = "DATE_DEBUT", nullable = false, unique = false)
	private Timestamp dateDebut;

	@Column(name = "DELAI", nullable = true, unique = false)
	private Integer delai;

	@Column(name = "DATE_FIN",nullable = true, unique = false)
	private Timestamp dateFin;

	/**
	 * Constructeur
	 * 
	 */
	public Emprunt() {
	}

	@Override
	public String toString() {
		return "\n Emprunt : id = " + id + ", dateDebut = " + dateDebut + ", delai = " + delai + ", dateFin = "
				+ dateFin + ", Client = " + client;
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

	/**
	 * Getter pour l'attribut dateDebut
	 * 
	 * @return the dateDebut
	 */
	public Timestamp getDateDebut() {
		return dateDebut;
	}

	/**
	 * Setter pour l'attribut dateDebut
	 * 
	 * @param dateDebut the dateDebut to set
	 */
	public void setDateDebut(Timestamp dateDebut) {
		this.dateDebut = dateDebut;
	}

	/**
	 * Getter pour l'attribut delai
	 * 
	 * @return the delai
	 */
	public Integer getDelai() {
		return delai;
	}

	/**
	 * Setter pour l'attribut delai
	 * 
	 * @param delai the delai to set
	 */
	public void setDelai(Integer delai) {
		this.delai = delai;
	}

	/**
	 * Getter pour l'attribut dateFin
	 * 
	 * @return the dateFin
	 */
	public Timestamp getDateFin() {
		return dateFin;
	}

	/**
	 * Setter pour l'attribut dateFin
	 * 
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(Timestamp dateFin) {
		this.dateFin = dateFin;
	}

	/**
	 * Getter pour l'attribut client
	 * 
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}

	/**
	 * Setter pour l'attribut client
	 * 
	 * @param client the client to set
	 */
	public void setClient(Client client) {
		this.client = client;
	}

	/**
	 * Getter pour l'attribut livres
	 * 
	 * @return the livres
	 */
	public Set<Livre> getLivres() {
		return livres;
	}

	/**
	 * Setter pour l'attribut livres
	 * 
	 * @param livres the livres to set
	 */
	public void setLivres(Set<Livre> livres) {
		this.livres = livres;
	}

}
