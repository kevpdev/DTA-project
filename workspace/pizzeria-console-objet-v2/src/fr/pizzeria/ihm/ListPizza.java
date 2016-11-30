package fr.pizzeria.ihm;

import java.io.IOException;

import fr.pizzeria.model.TypeTriPizza;
import fr.pizzeria.tool.IhmUtil;

public class ListPizza extends Option {

	public IhmUtil ihmUtil;
	public TypeTriPizza ttp;

	public ListPizza(IhmUtil ihmUtil) {
		// TODO Auto-generated constructor stub
		this.setLibelle("1. Liste des pizza");
		this.ihmUtil = ihmUtil;
	}

	@Override
	public void executeOption() throws IOException {
		ihmUtil.getPizzaDao().findAllPizzas();
		// List<Pizza> pizzas = ihmUtil.getPizzaDao().findAllPizzas();

		// pizzas.forEach(System.out::println);

		// ihmUtil.getPizzaDao().savePizzasFile(ihmUtil.getFilename());
	}

	@Override
	public void libelleOption() {
		// TODO Auto-generated method stub
		System.out.println(getLibelle());

	}

}
