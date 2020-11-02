package fr.mds.cours.langageobjet.tp14.models;

public abstract class Boat {
	
	protected int nombre;

	public Boat(int nombre) {
		this.nombre = nombre;
	}

	public int getNombre() {
		return nombre;
	}

	public void setNombre(int nombre) {
		this.nombre = nombre;
	}
	
	
}
