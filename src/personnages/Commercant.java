package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int quantiteArgent) {
		super(nom, "the", quantiteArgent);
	}

	public int seFaireExtorquer() {
		parler("J'ai tout perdu !Le monde est trop injuste");
		return getQuantiteArgent();
	}

	public void recevoir(int argent) {
		parler(argent + " sous! Je te remercie genereux donateur!");
		this.gagnerArgent(argent);
	}
}