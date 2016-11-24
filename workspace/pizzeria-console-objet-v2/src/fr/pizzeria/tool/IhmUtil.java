package fr.pizzeria.tool;

import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;

public class IhmUtil {
	
	private final Scanner scanner;
	private final IPizzaDao pizzaDao;

	public IhmUtil(final Scanner scanner, final IPizzaDao pizzaDao) {
		super();
		this.scanner = scanner;
		this.pizzaDao = pizzaDao;
	}

	public Scanner getScanner() {
		return this.scanner;
	}
	
	public IPizzaDao getPizzaDao() {
		return this.pizzaDao;
	}

}