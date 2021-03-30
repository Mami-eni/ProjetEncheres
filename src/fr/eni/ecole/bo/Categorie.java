package fr.eni.ecole.bo;
/**
 * 
 * Classe représente les catégories
 *
 */
public class Categorie {
	private int noCategorie;
	private String libelle;
	
	public Categorie() {
		// TODO Auto-generated constructor stub
	}

	public int getNoCategorie() {
		return noCategorie;
	}

	public void setNoCategorie(int noCategorie) {
		this.noCategorie = noCategorie;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	@Override
	public String toString() {
		return "Categorie [noCategorie=" + noCategorie + ", libelle=" + libelle + "]";
	}
	
}
