package fr.mds.cours.langageobjet.tp14.models;

public class Destroyer extends Boat{

	private final int identifiant = 2;
	private final int taille = 3;
	
	public Destroyer (int nombre) {
		super(nombre);
	}

	public int getIdentifiant() {
		return identifiant;
	}

	public int getTaille() {
		return taille;
	};

}
