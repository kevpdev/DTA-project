package fr.pizzeria.ihm;
import fr.pizzeria.model.Pizza;
import fr.pizzeria.tool.IhmUtil;

public class ListPizza extends Option {

	public IhmUtil ihmUtil;

	public  ListPizza(IhmUtil ihmUtil) {
		// TODO Auto-generated constructor stub
		this.setLibelle("1. Liste des pizza");
		this.ihmUtil = ihmUtil;
	}
	@Override
	public boolean executeOption() {

		Pizza[] pizzas = ihmUtil.getPizzaDao().findAllPizzas();
		for (Pizza pizza : pizzas) {
			System.out.println(pizza);
		}
		return true;
	}

	@Override
	public void libelleOption() {
		// TODO Auto-generated method stub
		System.out.println(getLibelle());

	}

}
