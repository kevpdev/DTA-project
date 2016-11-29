package fr.pizzeria.ihm;

import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

import fr.pizzeria.dao.PizzaArrayDao;
import fr.pizzeria.tool.IhmUtil;

public class Ecran {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		IhmUtil ihmUtil;
		try {
			ihmUtil = new IhmUtil(sc, new PizzaArrayDao());
			Menu menu = new Menu("***** Pizzeria Administration *****", ihmUtil);
			menu.start();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
