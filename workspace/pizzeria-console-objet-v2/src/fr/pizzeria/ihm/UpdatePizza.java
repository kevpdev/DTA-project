package fr.pizzeria.ihm;

import fr.pizzeria.tool.IhmUtil;

public class UpdatePizza extends Option {

	public  UpdatePizza(IhmUtil ihmUtil) {
		// TODO Auto-generated constructor stub
		this.setLibelle("3. Mise à jour d'une pizza");
	}

	@Override
	public boolean executeOption() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void libelleOption() {
		// TODO Auto-generated method stub
		System.out.println(getLibelle());
	}

}
