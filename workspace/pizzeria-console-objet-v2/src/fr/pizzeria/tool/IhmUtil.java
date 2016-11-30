package fr.pizzeria.tool;

import java.util.Scanner;

import fr.pizzeria.dao.PizzaDaoFactory;

public class IhmUtil {

	private final Scanner scanner;
	private final PizzaDaoFactory pizzaDao;
	private final String filename = "pizzas.txt";

	public IhmUtil(final Scanner scanner, final PizzaDaoFactory pizzaDao) {
		super();
		this.scanner = scanner;
		this.pizzaDao = pizzaDao;
	}

	public Scanner getScanner() {
		return this.scanner;
	}

	public PizzaDaoFactory getPizzaDao() {
		return this.pizzaDao;
	}

	public String getFilename() {
		return filename;
	}

}