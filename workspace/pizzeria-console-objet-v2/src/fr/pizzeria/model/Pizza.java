package fr.pizzeria.model;

public class Pizza {

	@ToString
	private int id;
	@ToString
	private String code;
	@ToString
	private String nom;
	@ToString
	private double prix;
	@ToString
	private CategoriePizza categPizza;
	public static int nbPizzas;

	public Pizza() {

	}

	public Pizza(String code, String nom, double prix) {
		super();

		this.setId(nbPizzas);
		this.setCode(code);
		this.setNom(nom);
		this.setPrix(prix);
		nbPizzas++;
	}

	public Pizza(int id, String code, String nom, double prix) {
		this(code, nom, prix);
		nbPizzas++;
		this.setId(id);

	}

	public Pizza(int id, String code, String nom, double prix, CategoriePizza categ) {
		this(id, code, nom, prix);

		nbPizzas++;
		this.setCategPizza(categ);

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public static int getNbPizzas() {
		return nbPizzas;
	}

	public static void setNbPizzas(int nbPizzas) {
		Pizza.nbPizzas = nbPizzas;
	}

	public CategoriePizza getCategPizza() {
		return categPizza;
	}

	public void setCategPizza(CategoriePizza categPizza) {
		this.categPizza = categPizza;
	}

	@Override
	public String toString() {
		return code + "-> " + nom + " (" + prix + "€) Categorie : " + categPizza;
	}

	public String toStringFile() {

		return getId() + ";" + getCode() + ";" + getNom() + ";" + getPrix() + ";" + getCategPizza() + ";";
	}

}
