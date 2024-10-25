package personnages;


public class Humain {
	private String nom;
	private String boissonFavorite;
	private int quantiteArgent;
	
	public Humain(String nom,String boissonFavorite,int quantiteArgent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.quantiteArgent = quantiteArgent;
	}
	
	private String getNom() {
		return nom;
	}
	
	private int getQuantiteArgent() {
		return quantiteArgent;
	}
	
	private void setQuantiteArgent(int quantiteArgent) {
		this.quantiteArgent = quantiteArgent;
	}
	
	private void parler(String texte) {
		System.out.println(nom+":"+texte);
	}
	
	public void direBonjour() {
		parler("Bonjour! je m'appel" + nom + "et j'aime boire du " + boissonFavorite );
	}
	public void boire() {
		parler("Mmmm, un bon verre de" + boissonFavorite +" ! GLOUPS !");
	}
	
	private void perdreArgent(int perte) {
		quantiteArgent -= perte;
	}
	
	private void gagnerArgent(int gain) {
		quantiteArgent += gain;
	}
	public void acheter(String bien,int prix) {
		
	}
	
}
	
	
	
	
	
	
	
	