package fr.pizzeria.dao;

import java.io.FileNotFoundException;
import java.util.List;

import fr.pizzeria.excepetion.PizzaException;
import fr.pizzeria.model.Pizza;

public interface IPizzaDao {

	List<Pizza> findAllPizzas();

	boolean addPizza(Pizza pizza) throws PizzaException, FileNotFoundException;

	boolean updatePizza(Pizza pizza) throws PizzaException, FileNotFoundException;

	boolean deletePizza(Pizza pizza) throws PizzaException, FileNotFoundException;

	Pizza getPizzaByCode(Object code);

	Pizza getPizzaByPizza(Pizza pizza);

	public void savePizzasFile(String filename) throws FileNotFoundException;

}
