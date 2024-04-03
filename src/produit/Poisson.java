package produit;

public class Poisson extends Produit {
	private String nom;
	private String datePeche;

	public Poisson(String nom, String unite, String datePeche) {
		super(nom, unite);
		this.nom = nom;
		this.datePeche = datePeche;
	}
	

	public void descriptionProduit() {
		System.out.println(nom + " pêchés " + datePeche + ".");
	}

}