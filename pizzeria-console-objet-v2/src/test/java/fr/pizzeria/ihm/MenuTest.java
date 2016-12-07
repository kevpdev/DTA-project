package fr.pizzeria.ihm;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MenuTest {

	static Menu menu;

	@BeforeClass
	public static void runBeforeClass() {
		menu = new Menu();
	}

	@Before
	public void runBeforeTestMethod() {

	}

	@Test
	public void testSetTitre() {
		menu.setTitre("titre test");
		assertEquals("titre test", menu.getTitre());
	}

	@After
	public void runAfterTestMethod() {

	}

	@AfterClass
	public static void runAfterClass() {

	}

}
