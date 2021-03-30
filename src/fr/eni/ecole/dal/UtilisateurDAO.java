package fr.eni.ecole.dal;

import fr.eni.ecole.bo.Utilisateur;

public interface UtilisateurDAO {
	
	Utilisateur selectByNo(int no);

}
