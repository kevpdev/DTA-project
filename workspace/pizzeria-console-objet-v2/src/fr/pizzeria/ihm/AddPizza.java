package fr.pizzeria.ihm;

import fr.pizzeria.tool.IhmUtil;

public class AddPizza extends Option{
	
	public IhmUtil ihmutil;
	
	public  AddPizza(IhmUtil ihmUtil) {
		// TODO Auto-generated constructor stub
	this.setLibelle("2. Ajouter une pizza");
	this.ihmutil = ihmUtil;
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
