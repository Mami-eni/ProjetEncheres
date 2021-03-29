package fr.eni.ecole.bo;

import java.time.LocalDate;
/**
 * 
 * Classe repr�sente les ench�res
 *
 */
public class Enchere {
	private int dateEnch�re;
	private LocalDate montant_enchere;
	private Utilisateur util;
	private Article art;
	
	public Enchere() {
		
	}

	public int getDateEnch�re() {
		return dateEnch�re;
	}

	public void setDateEnch�re(int dateEnch�re) {
		this.dateEnch�re = dateEnch�re;
	}

	public LocalDate getMontant_enchere() {
		return montant_enchere;
	}

	public void setMontant_enchere(LocalDate montant_enchere) {
		this.montant_enchere = montant_enchere;
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

	@Override
	public String toString() {
		return "Enchere [dateEnch�re=" + dateEnch�re + ", montant_enchere=" + montant_enchere + ", util=" + util
				+ ", art=" + art + "]";
	}
	
	
}
