package fr.pizzeria.ihm;


import java.util.Locale;
import java.util.Scanner;

import fr.pizzeria.dao.IPizzaDao;
import fr.pizzeria.dao.PizzaArrayDao;
import fr.pizzeria.model.Pizza;
import fr.pizzeria.tool.IhmUtil;

public class Ecran{


	public static void main(String[] args) {
		// TODO Auto-generated method stub



	
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		IhmUtil ihmUtil = new IhmUtil(sc, new PizzaArrayDao());
		Menu menu = new Menu("***** Pizzeria Administration *****", ihmUtil);
		menu.start();
	   	
	
		
		
	

	}
	












}
