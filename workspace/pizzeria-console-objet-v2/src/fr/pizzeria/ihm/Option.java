package fr.pizzeria.ihm;

public abstract class  Option {

	public String libelle;


	public String getLibelle() {
		return libelle;
	}


	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}


	public abstract void executeOption();

	public abstract void libelleOption();

}
