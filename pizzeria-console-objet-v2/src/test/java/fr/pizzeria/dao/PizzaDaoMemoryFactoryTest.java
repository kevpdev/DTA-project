package fr.pizzeria.dao;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import fr.pizzeria.model.CategoriePizza;
import fr.pizzeria.model.Pizza;

public class PizzaDaoMemoryFactoryTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

		// PizzaDaoMemoryFactory pdaom = new PizzaDaoMemoryFactory();

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws FileNotFoundException {

		PizzaDaoMemoryFactory pdaom = new PizzaDaoMemoryFactory();
		Pizza pizza = new Pizza(9, "KEB", "kebab", 16, CategoriePizza.VIANDE);
		pdaom.addPizza(pizza);
		assertEquals(pizza, pdaom.getPizzaByCode(pizza.getCode()));
	}

}
