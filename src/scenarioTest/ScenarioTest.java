package scenarioTest;

import personnages.Gaulois;
import produit.Poisson;
import produit.Produit;
import produit.Sanglier;
import villagegaulois.Etal;
import villagegaulois.IEtal;

public class ScenarioTest {
	public static void main(String[] args) {
		
		Gaulois ordralfabetix = new Gaulois("Ordralfabétix",9);
		Gaulois obelix = new Gaulois("Obélix",20);
		Gaulois asterix = new Gaulois("Asterix", 6);
		
		Sanglier sanglier1 = new Sanglier("sanglier", "kg", 2000, obelix);
		Sanglier sanglier2 = new Sanglier("sanglier", "kg", 1500, obelix);
		Sanglier sanglier3 = new Sanglier("sanglier", "kg", 1000, asterix);
		Sanglier sanglier4 = new Sanglier("sanglier", "kg", 500, asterix);
		
		Sanglier[] sangliersObelix = {sanglier1, sanglier2};
		Sanglier[] sangliersAsterix = {sanglier3, sanglier4};
		
		Poisson poisson1 = new Poisson("lundi", null, null);
		Poisson[] poissons = {poisson1};
		
		Etal<Sanglier> etalSanglier1 = new Etal<>();
		Etal<Sanglier> etalSanglier2 = new Etal<>();
		Etal<Poisson> etalPoisson1 = new Etal<>();
		
		etalSanglier1.installerVendeur(obelix, sangliersObelix, 8);
		etalSanglier2.installerVendeur(asterix, sangliersAsterix, 10);
		etalPoisson1.installerVendeur(ordralfabetix, poissons, 7);
		
	}
	
}
