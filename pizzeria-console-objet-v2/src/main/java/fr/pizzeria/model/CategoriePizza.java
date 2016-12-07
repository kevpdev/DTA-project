package fr.pizzeria.model;

public enum CategoriePizza {
	
	VIANDE("Viande"), 
	POISSON("Poisson"), 
	SANS_VIANDE("Sans Viande");
	
	private String nomCateg;
	
	public String getNomCateg() {
		return nomCateg;
	}

	public void setNomCateg(String nomCateg) {
		this.setNomCateg(nomCateg); 
	}

	CategoriePizza(String nomCateg){
		this.nomCateg = nomCateg;
	}
	
	public String toString(){
		return getNomCateg();
	}

}
