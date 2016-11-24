package fr.pizzeria.dao;

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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateizza(Pizza pizza) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletePizza(Pizza pizza) {
		// TODO Auto-generated method stub
		return false;
	}

}
