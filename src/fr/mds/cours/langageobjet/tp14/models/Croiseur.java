package fr.mds.cours.langageobjet.tp14.models;

public class Croiseur extends Boat {
	
	private final int identifiant = 2;
	private final int taille = 3;
	
	public Croiseur (int nombre) {
		super(nombre);
	}

	public int getIdentifiant() {
		return identifiant;
	}

	public int getTaille() {
		return taille;
	};
	
}
