package fr.diginamic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="region")
public class Region {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "codeRegion", length = 4, nullable = true, unique = false)
	private String codeRegion;
	
	@Column(name = "nom", length = 100, nullable = true, unique = false)
	private String nom;
	
	@Column(name = "population", length = Integer.MAX_VALUE, nullable = true, unique = false)
	private Integer population;
	
	/**Constructeur sans argument
	 * 
	 */
	public Region() {
	}
	
	/**Constructeur
	 * @param codeRegion
	 * @param nom
	 * @param population
	 */
	public Region(String codeRegion, String nom, Integer population) {
		this.codeRegion = codeRegion;
		this.nom = nom;
		this.population = population;
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

	/**Getter pour l'attribut code
	 * @return the code
	 */
	public String getCode() {
		return codeRegion;
	}

	/**Setter pour l'attribut code
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.codeRegion = code;
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

	/**Getter pour l'attribut population
	 * @return the population
	 */
	public int getPopulation() {
		return population;
	}

	/**Setter pour l'attribut population
	 * @param population the population to set
	 */
	public void setPopulation(int population) {
		this.population = population;
	}

	@Override
	public String toString() {
		return "Region [id=" + id + ", codeRegion=" + codeRegion + ", nom=" + nom + ", population=" + population + "]";
	}
	

}
