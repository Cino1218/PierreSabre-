package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	private int quantiteArgent;

	public Humain(String nom, String boissonFavorite, int quantiteArgent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.quantiteArgent = quantiteArgent;
	}

	private String getNom() {
		return nom;
	}

	protected int getQuantiteArgent() {
		return quantiteArgent;
	}

	private void setQuantiteArgent(int quantiteArgent) {
		this.quantiteArgent = quantiteArgent;
	}

	protected void parler(String texte) {
		System.out.println(nom + ":" + texte);
	}

	public void direBonjour() {
		parler("Bonjour! je m'appel" + nom + "et j'aime boire du " + boissonFavorite);
	}

	public void boire() {
		parler("Mmmm, un bon verre de" + boissonFavorite + " ! GLOUPS !");
	}

	private void perdreArgent(int perte) {
		quantiteArgent -= perte;
	}

	protected void gagnerArgent(int gain) {
		quantiteArgent += gain;
	}

	public void acheter(String bien, int prix) {
		if (prix <= getQuantiteArgent()) {
			parler(" jai " + quantiteArgent + " je vais pouvoir m'acheter " + bien + " a " + prix + " sous ");
			perdreArgent(prix);
		} else {
			parler(" Je n'ai plus que  " + quantiteArgent + " Je ne peux même pas m'offrir " + bien + " a " + prix
					+ " sous");
		}
	}

}
