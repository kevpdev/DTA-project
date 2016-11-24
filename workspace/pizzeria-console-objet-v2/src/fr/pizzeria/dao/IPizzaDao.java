package fr.pizzeria.dao;

import fr.pizzeria.model.Pizza;

public interface IPizzaDao {
	
	Pizza[] findAllPizzas();
	boolean addPizza(Pizza pizza);
	boolean updateizza(Pizza pizza);
	boolean deletePizza(Pizza pizza);

}
