package fr.eni.ecole.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import fr.eni.ecole.bo.Utilisateur;

public class UtilisateurJDBC implements UtilisateurDAO {
	
	public Utilisateur selectByNo(int no) {
		Utilisateur util = new Utilisateur();
		try(Connection cx = Connect.getConnection()){
			PreparedStatement request = cx.prepareStatement("SELECT no_utilisateur, pseudo, nom, "
					+ "prenom, email, telephone, rue, code_postal, ville, mot_de_passe, credit, administrateur "
					+ "FROM utilisateurs WHERE no_utilisateur = ?");
			request.setInt(1, no);
			ResultSet rs = request.executeQuery();
			rs.next();
			util = utilisateurBuilder(rs);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return util;
	}
	
	public Utilisateur utilisateurBuilder(ResultSet rs) {
		Utilisateur util = new Utilisateur();
		try {
			util.setNoUtilisateur(rs.getInt("no_utilisateur"));
			util.setPseudo(rs.getString("pseudo"));
			util.setNom(rs.getString("nom"));
			util.setPrenom(rs.getString("prenom"));
			util.setEmail(rs.getString("email"));
			util.setTelephone(rs.getString("telephone"));
			util.setRue(rs.getString("rue"));
			util.setCodePostal(rs.getString("code_postal"));
			util.setVille(rs.getString("ville"));
			util.setMotDePasse(rs.getString("mot_de_passe"));
			util.setCredit(rs.getInt("credit"));
			util.setAdministrateur(rs.getBoolean("administrateur"));
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return util;
	}

}
