package fr.pizzeria.dao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTML.Tag;

import fr.pizzeria.excpetion.AddPizzaException;
import fr.pizzeria.excpetion.DeletePizzaException;
import fr.pizzeria.excpetion.PizzaException;
import fr.pizzeria.excpetion.UpdatePizzaException;
import fr.pizzeria.model.Pizza;

public class PizzaArrayDao implements IPizzaDao {

	public List<Pizza> pizzas = new ArrayList<>();

	public  PizzaArrayDao() {

		// TODO Auto-generated constructor stub
		pizzas.add(new Pizza(0,"PEP" ,"Pépéroni", 12.50));
		pizzas.add(new Pizza(1, "MAR" ,"Margherita", 14.00));
		pizzas.add(new Pizza(2, "REI" ,"Reine", 11.50));
		pizzas.add(new Pizza(3, "FRO" ,"La 4 fromages", 12.00));
		pizzas.add(new Pizza(4, "CAN" ,"La cannibale", 12.50));
		pizzas.add(new Pizza(5, "SAV" ,"La Savoyage", 13.00));
		pizzas.add(new Pizza(6, "ORI" ,"L' orientale", 15.50));
		pizzas.add(new Pizza(7, "IND" ,"L'indienne", 14.00));
	}

	@Override
	public List<Pizza> findAllPizzas() {
		// TODO Auto-generated method stub
		return pizzas;
	}

	@Override
	public boolean addPizza(Pizza pizza) throws PizzaException {
	
		if (!isValid(pizza)) {
			throw new AddPizzaException();

		}
		pizza.setId(pizzas.size());
		pizzas.add(pizza);

		return true;



	}

	private boolean isValid(Pizza pizza) {
		
		return pizza != null && pizza.getCode() != null;
	}

	@Override
	public boolean updatePizza(Pizza pizza) throws PizzaException {
		
		if (!isValid(pizza)) {
			throw new UpdatePizzaException();

		}

		for (Pizza pizzaArrayL : pizzas) {
			if (pizza.getId() == pizzaArrayL.getId()) {

				pizzaArrayL.setCode(pizza.getCode());
				pizzaArrayL.setNom(pizza.getNom());
				pizzaArrayL.setPrix(pizza.getPrix());

				return true;
			}
		}



		return false;
	}

	@Override
	public boolean deletePizza(Pizza pizza) throws PizzaException {

		if (!isValid(pizza)) {
			throw new DeletePizzaException();

		}
		
		for (int i = 0; i < pizzas.size(); i++) {
			if(!(pizza.equals(pizzas))){
				pizzas.remove(i);
			}					

		}


		return true;


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
