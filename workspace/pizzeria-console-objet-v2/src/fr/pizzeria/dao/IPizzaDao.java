package fr.pizzeria.dao;

import java.util.List;

import fr.pizzeria.excepetion.AddPizzaException;
import fr.pizzeria.excepetion.DeletePizzaException;
import fr.pizzeria.excepetion.PizzaException;
import fr.pizzeria.excepetion.UpdatePizzaException;
import fr.pizzeria.model.Pizza;

public interface IPizzaDao {
	
	List<Pizza> findAllPizzas();
	boolean addPizza(Pizza pizza) throws PizzaException;
	boolean updatePizza(Pizza pizza) throws PizzaException;
	boolean deletePizza(Pizza pizza) throws PizzaException;
	Pizza getPizzaByCode(Object code);
	Pizza getPizzaByPizza(Pizza pizza);

}
