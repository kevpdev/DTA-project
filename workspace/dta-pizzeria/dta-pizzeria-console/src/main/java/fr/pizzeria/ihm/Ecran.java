package fr.pizzeria.ihm;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

import fr.pizzeria.dao.PizzaDaoFactory;
import fr.pizzeria.model.Pizza;
import fr.pizzeria.tool.IhmUtil;

public class Ecran {

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		// TODO Auto-generated method stub

		Pizza p1 = new Pizza();
		p1.setCode("MAR");

		Pizza p2 = new Pizza();
		p2.setCode("MAR");

		System.out.println("p1=p2 ? " + p1.equals(p2));

		ResourceBundle bundle = ResourceBundle.getBundle("application");
		File file = new File("data/pizza/");
		System.out.println("file : "+file.exists());
		ArrayList<String> files = new ArrayList<String>(Arrays.asList(file.list()));
		System.out.println("file : "+files.size());
		String daoImpl = bundle.getString("dao.impl");
		PizzaDaoFactory daofactory = (PizzaDaoFactory) Class.forName(daoImpl).newInstance();

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		IhmUtil ihmUtil;
		ihmUtil = new IhmUtil(sc, daofactory);
		Menu menu = new Menu("***** Pizzeria Administration *****", ihmUtil);
		menu.start();

		sc.close();

	}

}
