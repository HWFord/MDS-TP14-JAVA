package fr.mds.cours.langageobjet.tp14.models;

public class Corvette extends Boat{
	
	private final int identifiant = 1;
	private final int taille = 1;
	
	public Corvette(int nombre) {
		super(nombre);
	}

	public int getIdentifiant() {
		return identifiant;
	}

	public int getTaille() {
		return taille;
	};
	
	
}
