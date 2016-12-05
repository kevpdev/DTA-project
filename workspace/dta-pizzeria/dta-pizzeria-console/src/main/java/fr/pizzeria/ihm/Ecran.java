package fr.pizzeria.ihm;

import java.util.Locale;
import java.util.Scanner;

import fr.pizzeria.dao.PizzaDaoFileFactory;
import fr.pizzeria.model.Pizza;
import fr.pizzeria.tool.IhmUtil;

public class Ecran {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pizza p1 = new Pizza();
		p1.setCode("MAR");

		Pizza p2 = new Pizza();
		p2.setCode("MAR");

		System.out.println("p1=p2 ? " + p1.equals(p2));

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		IhmUtil ihmUtil;
		ihmUtil = new IhmUtil(sc, new PizzaDaoFileFactory());
		Menu menu = new Menu("***** Pizzeria Administration *****", ihmUtil);
		menu.start();

		sc.close();

	}

}
