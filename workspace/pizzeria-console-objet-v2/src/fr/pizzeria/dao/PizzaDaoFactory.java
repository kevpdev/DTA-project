package fr.pizzeria.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import fr.pizzeria.excepetion.PizzaException;
import fr.pizzeria.model.Pizza;

public interface PizzaDaoFactory {

	List<Pizza> findAllPizzas() throws IOException, InstantiationException, IllegalAccessException;

	boolean addPizza(Pizza pizza)
			throws PizzaException, FileNotFoundException, IllegalArgumentException, IllegalAccessException, IOException;

	boolean updatePizza(Pizza pizza) throws PizzaException, FileNotFoundException;

	boolean deletePizza(Pizza pizza) throws PizzaException, FileNotFoundException;

	Pizza getPizzaByCode(Object code);

	Pizza getPizzaByPizza(Pizza pizza);

	// public void savePizzas(String filename) throws FileNotFoundException;

}
