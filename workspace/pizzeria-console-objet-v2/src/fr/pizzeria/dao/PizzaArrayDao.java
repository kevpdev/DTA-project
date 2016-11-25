package fr.pizzeria.dao;

import javax.swing.text.html.HTML.Tag;

import fr.pizzeria.model.Pizza;

public class PizzaArrayDao implements IPizzaDao {

	Pizza [] pizzas={
			new Pizza(0,"PEP" ,"Pépéroni", 12.50),
			new Pizza(1, "MAR" ,"Margherita", 14.00),
			new Pizza(2, "REI" ,"Reine", 11.50),
			new Pizza(3, "FRO" ,"La 4 fromages", 12.00),
			new Pizza(4, "CAN" ,"La cannibale", 12.50),
			new Pizza(5, "SAV" ,"La Savoyage", 13.00),
			new Pizza(6, "ORI" ,"L' orientale", 15.50),
			new Pizza(7, "IND" ,"L'indienne", 14.00)};

	@Override
	public Pizza[] findAllPizzas() {
		// TODO Auto-generated method stub
		return pizzas;
	}

	@Override
	public boolean addPizza(Pizza pizza) {



		Pizza [] pizzasAdd = new Pizza[1000];

		try {
			for (int i = 0; i < pizzas.length; i++) {

				pizzasAdd[i] = pizzas[i];	

			}

			//je récupere le premier index libre
			int dernier =0;
			for (int j = 0; j < pizzasAdd.length; j++) {
				if (null == pizzasAdd[j]) {
					break;
				}else{
					dernier ++;

				}

			}
			pizza.setId(dernier);
			pizzasAdd[dernier] = pizza;
			pizzas = pizzasAdd;

			return true;


		} catch (Exception e) {
			System.out.println(e.getMessage());
		}


		return false;

	}

	@Override
	public boolean updatePizza(Pizza pizza) {

		try{
			//je récupere le premier index libre

			for (Pizza pizzaArray : pizzas) {
				if (pizza.getId() == pizzaArray.getId()) {

					pizzaArray.setCode(pizza.getCode());
					pizzaArray.setNom(pizza.getNom());
					pizzaArray.setPrix(pizza.getPrix());

					return true;
				}
			}




		} catch (Exception e) {
			System.out.println(e.getMessage());
		}


		return false;
	}

	@Override
	public boolean deletePizza(Pizza pizza) {

		Pizza [] pizzasDel = new Pizza[1000];

		try {
			for (int i = 0; i < pizzas.length; i++) {
				if(!(pizza.equals(pizzas[i]))){
					pizzasDel[i] = pizzas[i];	
				}					

			}

			pizzas = pizzasDel;

			return true;


		} catch (Exception e) {
			System.out.println(e.getMessage());
		}


		return false;

	}

	@Override
	public Pizza getPizzaByCode(Object code) {

		for (Pizza pizza : pizzas) {

			if (code.equals(pizza.getCode())) {

				return pizza;
			}
		}
		return null;
	}

	@Override
	public Pizza getPizzaByPizza(Pizza pizza) {
		// TODO Auto-generated method stub
		return null;
	}

}
