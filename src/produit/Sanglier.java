package produit;

import personnages.Gaulois;

public class Sanglier extends Produit {
	private String nom;
	private String unite;
	private int poids;
	private Gaulois chasseur;
	

	public Sanglier(String nom, String unite, int poids, Gaulois chasseur) {
		super (nom, unite);
		this.nom = nom;
		this.unite = unite;
		this.poids = poids;
		this.chasseur = chasseur;
	}
	

	public void descriptionProduit() {
		System.out.println(nom + " de " + poids + unite + " chassé par " + chasseur.getNom() + ".");
	}

}
