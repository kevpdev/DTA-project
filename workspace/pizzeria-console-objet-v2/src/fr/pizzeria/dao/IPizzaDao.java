package fr.pizzeria.dao;

import java.util.List;

import fr.pizzeria.excpetion.AddPizzaException;
import fr.pizzeria.excpetion.DeletePizzaException;
import fr.pizzeria.excpetion.PizzaException;
import fr.pizzeria.excpetion.UpdatePizzaException;
import fr.pizzeria.model.Pizza;

public interface IPizzaDao {
	
	List<Pizza> findAllPizzas();
	boolean addPizza(Pizza pizza) throws PizzaException;
	boolean updatePizza(Pizza pizza) throws PizzaException;
	boolean deletePizza(Pizza pizza) throws PizzaException;
	Pizza getPizzaByCode(Object code);
	Pizza getPizzaByPizza(Pizza pizza);

}
