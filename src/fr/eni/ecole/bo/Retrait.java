package fr.eni.ecole.bo;
/**
 * 
 * Classe représente les catégories
 *
 */
public class Retrait {
	private String rue;
	private String code_postal;
	private String ville;
	private Article art;
	
	public Retrait() {
		// TODO Auto-generated constructor stub
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getCode_postal() {
		return code_postal;
	}

	public void setCode_postal(String code_postal) {
		this.code_postal = code_postal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public Article getArt() {
		return art;
	}

	public void setArt(Article art) {
		this.art = art;
	}

	@Override
	public String toString() {
		return "Retrait [rue=" + rue + ", code_postal=" + code_postal + ", ville=" + ville + ", art=" + art + "]";
	}
	
	
}
