package fr.pizzeria.ihm;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import fr.pizzeria.excepetion.PizzaException;
import fr.pizzeria.excepetion.UpdatePizzaException;
import fr.pizzeria.model.CategoriePizza;
import fr.pizzeria.model.Pizza;
import fr.pizzeria.tool.IhmUtil;

public class UpdatePizza extends Option {

	public IhmUtil ihmUtil;

	public  UpdatePizza(IhmUtil ihmUtil) {

		this.setLibelle("3. Mise à jour d'une pizza");
		this.ihmUtil = ihmUtil;
	}

	@Override
	public void executeOption() throws PizzaException{
		

			ListPizza listp = new ListPizza(ihmUtil);
			listp.executeOption();

			System.out.print("Veuillez saisir le code de la pizza à modifier: ");
			String codeAmodifier = ihmUtil.getScanner().next(); 

			Pizza pizzaAModifier = ihmUtil.getPizzaDao().getPizzaByCode(codeAmodifier);
			if (!(pizzaAModifier == null)) {

				System.out.print("Veuillez saisir le nouveau code: ");
				String code = ihmUtil.getScanner().next();

				System.out.print("Veuillez saisir le nouveau nom: ");
				String nom = ihmUtil.getScanner().next(); 

				System.out.print("Veuillez saisir le nouveau prix: ");
				double prix = ihmUtil.getScanner().nextDouble(); 
				
				System.out.println("Liste des catégories: ");
				List<CategoriePizza> listCateg = new ArrayList<>(Arrays.asList(CategoriePizza.values()));
				for (int i = 0; i < listCateg.size(); i++) {
					
					System.out.println(i+1+". "+listCateg.get(i).toString());
					
				}
				
				System.out.print("Veuillez saisir le numéro de la catégorie: ");
				int categ = ihmUtil.getScanner().nextInt(); 

				Pizza pizza = new Pizza(pizzaAModifier.getId(), code, nom, prix, listCateg.get(categ-1));

				if(ihmUtil.getPizzaDao().updatePizza(pizza)){
					System.out.println("Mise à jour éffectué !");
				}else{
					System.out.println("Echec de la mise à jour !");
				}


			}

		
	}

	@Override
	public void libelleOption() {
		// TODO Auto-generated method stub
		System.out.println(getLibelle());
	}

}
