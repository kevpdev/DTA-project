package fr.pizzeria.ihm;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import fr.pizzeria.excepetion.PizzaException;
import fr.pizzeria.model.CategoriePizza;
import fr.pizzeria.model.Pizza;
import fr.pizzeria.tool.IhmUtil;

public class ListPizzaByCatag extends Option {

	public IhmUtil ihmUtil;

	public ListPizzaByCatag(IhmUtil ihmUtil) {
		// TODO Auto-generated constructor stub
		this.setLibelle("5. Lister les pizzas groupées par catégorie");
		this.ihmUtil = ihmUtil;
	}

	@Override
	public void executeOption() throws PizzaException, IOException {

		List<Pizza> pizzas = ihmUtil.getPizzaDao().findAllPizzas();
		Map<CategoriePizza, List<Pizza>> map = pizzas.stream().collect(Collectors.groupingBy(Pizza::getCategPizza));
		map.forEach((key, value) -> {
			value.forEach(value2 -> {
				System.out.println(key + " : " + value2);
			});
		});
	}

	@Override
	public void libelleOption() {
		// TODO Auto-generated method stub

	}

}
