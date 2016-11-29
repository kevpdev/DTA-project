package fr.pizzeria.ihm;

import java.io.FileNotFoundException;

import fr.pizzeria.excepetion.PizzaException;

public abstract class Option {

	public String libelle;

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public abstract void executeOption() throws PizzaException, FileNotFoundException;

	public abstract void libelleOption();

}
