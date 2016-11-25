package fr.pizzeria.dao;

import fr.pizzeria.model.Pizza;

public interface IPizzaDao {
	
	Pizza[] findAllPizzas();
	boolean addPizza(Pizza pizza);
	boolean updatePizza(Pizza pizza);
	boolean deletePizza(Pizza pizza);
	Pizza getPizzaByCode(Object code);
	Pizza getPizzaByPizza(Pizza pizza);

}
