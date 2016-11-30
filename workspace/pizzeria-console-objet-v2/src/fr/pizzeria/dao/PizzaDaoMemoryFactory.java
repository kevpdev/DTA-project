package fr.pizzeria.dao;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import fr.pizzeria.excepetion.AddPizzaException;
import fr.pizzeria.excepetion.DeletePizzaException;
import fr.pizzeria.excepetion.PizzaException;
import fr.pizzeria.excepetion.UpdatePizzaException;
import fr.pizzeria.model.CategoriePizza;
import fr.pizzeria.model.Pizza;

public class PizzaDaoMemoryFactory implements PizzaDaoFactory {

	public List<Pizza> pizzas = new ArrayList<>();
	public String filename = "pizzas.txt";

	public PizzaDaoMemoryFactory() throws FileNotFoundException {

		// TODO Auto-generated constructor stub
		pizzas.add(new Pizza(0, "PEP", "Pépéroni", 12.50, CategoriePizza.VIANDE));
		pizzas.add(new Pizza(1, "MAR", "Margherita", 14.00, CategoriePizza.SANS_VIANDE));
		pizzas.add(new Pizza(2, "REI", "Reine", 11.50, CategoriePizza.VIANDE));
		pizzas.add(new Pizza(3, "FRO", "La 4 fromages", 12.00, CategoriePizza.VIANDE));
		pizzas.add(new Pizza(4, "CAN", "La cannibale", 12.50, CategoriePizza.VIANDE));
		pizzas.add(new Pizza(5, "SAV", "La Savoyage", 13.00, CategoriePizza.VIANDE));
		pizzas.add(new Pizza(6, "ORI", "L' orientale", 15.50, CategoriePizza.VIANDE));
		pizzas.add(new Pizza(7, "IND", "L'indienne", 14.00, CategoriePizza.VIANDE));

	}
	//
	// public void savePizzasFile(String filename) throws FileNotFoundException
	// {
	// PrintWriter pw = new PrintWriter(new FileOutputStream(filename));
	// pizzas.forEach(value -> {
	// pw.println(value);
	// });
	//
	// pw.close();
	// }

	// public List<Pizza> getPizzasFile(String filename) {
	// Stream<String> stream = Files.lines(Paths.get(filename));
	// // pizzas = (Pizza)stream.collect(Collectors.toList());
	// return null;
	// }

	@Override
	public List<Pizza> findAllPizzas() {
		// TODO Auto-generated method stub
		// pizzas.stream().map(t -> t.getCode()).filter(t ->
		// t.toString().length() > 0).reduce((t1, t2)-> t1+t2);

		return pizzas;
	}

	@Override
	public boolean addPizza(Pizza pizza) throws PizzaException, FileNotFoundException {

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
	public boolean updatePizza(Pizza pizza) throws PizzaException, FileNotFoundException {

		if (!isValid(pizza)) {
			throw new UpdatePizzaException();

		}

		for (Pizza pizzaArrayL : pizzas) {
			if (pizza.getId() == pizzaArrayL.getId()) {

				pizzaArrayL.setCode(pizza.getCode());
				pizzaArrayL.setNom(pizza.getNom());
				pizzaArrayL.setPrix(pizza.getPrix());
				pizzaArrayL.setCategPizza(pizza.getCategPizza());
				return true;
			}
		}

		return false;
	}

	@Override
	public boolean deletePizza(Pizza pizza) throws PizzaException, FileNotFoundException {

		if (!isValid(pizza)) {
			throw new DeletePizzaException();

		}
		int i = 0;
		boolean stop = false;
		while (i < pizzas.size() && !stop) {
			if ((pizza.getCode().equals(pizzas.get(i).getCode()))) {
				stop = true;
			}
			if (!stop) {
				i++;
			}

		}
		System.out.println(i);
		pizzas.remove(i);
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
