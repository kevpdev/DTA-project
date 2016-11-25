package fr.pizzeria.ihm;

import fr.pizzeria.model.Pizza;
import fr.pizzeria.tool.IhmUtil;

public class AddPizza extends Option{
	
	public IhmUtil ihmUtil;
	
	public  AddPizza(IhmUtil ihmUtil) {
		// TODO Auto-generated constructor stub
	this.setLibelle("2. Ajouter une pizza");
	this.ihmUtil = ihmUtil;
	}

	@Override
	public void executeOption() {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("Ajout d'une nouvelle pizza");

			System.out.print("Veuillez saisir le code: ");
			String code = ihmUtil.getScanner().next();

			System.out.print("Veuillez saisir le nom: ");
			String nom = ihmUtil.getScanner().next(); 

			System.out.print("Veuillez saisir le prix: ");
			double prix = ihmUtil.getScanner().nextDouble(); 
			
			Pizza pizza = new Pizza(0, code, nom, prix);
			
			if(ihmUtil.getPizzaDao().addPizza(pizza)){
				System.out.println("Ajout éffectué !");
			}
			
		
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		
	
	}

	@Override
	public void libelleOption() {
		// TODO Auto-generated method stub
		System.out.println(getLibelle());
		
	}

}
