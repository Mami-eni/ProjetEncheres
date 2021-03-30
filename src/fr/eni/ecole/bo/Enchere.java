package fr.eni.ecole.bo;

import java.time.LocalDate;
/**
 * 
 * Classe repr�sente les ench�res
 *
 */
public class Enchere {
	private int no_enchere;
	private int montant_enchere;
	private LocalDate dateEnchere;
	private Utilisateur util;
	private Article art;
	
	public Enchere() {
		
	}

	

	public int getMontant_enchere() {
		return montant_enchere;
	}



	public void setMontant_enchere(int montant_enchere) {
		this.montant_enchere = montant_enchere;
	}



	public LocalDate getDateEnchere() {
		return dateEnchere;
	}



	public void setDateEnchere(LocalDate dateEnchere) {
		this.dateEnchere = dateEnchere;
	}



	public Utilisateur getUtil() {
		return util;
	}



	public void setUtil(Utilisateur util) {
		this.util = util;
	}



	public Article getArt() {
		return art;
	}



	public void setArt(Article art) {
		this.art = art;
	}



	public int getNo_enchere() {
		return no_enchere;
	}



	public void setNo_enchere(int no_enchere) {
		this.no_enchere = no_enchere;
	}



	@Override
	public String toString() {
		return "Enchere [dateEnch�re=" + dateEnchere + ", montant_enchere=" + montant_enchere + ", util=" + util
				+ ", art=" + art + "]";
	}
	
	
}
