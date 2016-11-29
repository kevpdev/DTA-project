package fr.pizzeria.ihm;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import fr.pizzeria.excepetion.PizzaException;
import fr.pizzeria.model.CategoriePizza;
import fr.pizzeria.model.Pizza;
import fr.pizzeria.tool.IhmUtil;

public class AddPizza extends Option {

	public IhmUtil ihmUtil;

	public AddPizza(IhmUtil ihmUtil) {
		// TODO Auto-generated constructor stub
		this.setLibelle("2. Ajouter une pizza");
		this.ihmUtil = ihmUtil;
	}

	@Override
	public void executeOption() throws PizzaException, FileNotFoundException {
		// TODO Auto-generated method stub

		System.out.println("Ajout d'une nouvelle pizza");

		System.out.print("Veuillez saisir le code: ");
		String code = ihmUtil.getScanner().next();

		System.out.print("Veuillez saisir le nom: ");
		String nom = ihmUtil.getScanner().next();

		System.out.print("Veuillez saisir le prix: ");
		double prix = ihmUtil.getScanner().nextDouble();

		System.out.println("Liste des catégories: ");
		List<CategoriePizza> listCateg = new ArrayList<>(Arrays.asList(CategoriePizza.values()));

		for (int i = 0; i < listCateg.size(); i++) {

			System.out.println(i + 1 + ". " + listCateg.get(i).toString());

		}

		// listCateg.forEach((value) -> {
		// int a = 0;
		// System.out.println(a + ". " + value.getNomCateg());
		// a++;
		// });

		System.out.print("Veuillez saisir le numéro de la catégorie: ");
		int categ = ihmUtil.getScanner().nextInt();

		Pizza pizza = new Pizza(0, code, nom, prix, listCateg.get(categ - 1));
		System.out.println(ihmUtil.getPizzaDao().addPizza(pizza) ? "Ajout éffectué !" : "Echec de l'ajout !");

	}

	@Override
	public void libelleOption() {
		// TODO Auto-generated method stub
		System.out.println(getLibelle());

	}

}
