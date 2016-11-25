package fr.pizzeria.ihm;

import fr.pizzeria.model.Pizza;
import fr.pizzeria.tool.IhmUtil;

public class DeletePizza extends Option {


	public IhmUtil ihmUtil;

	public  DeletePizza(IhmUtil ihmUtil) {

		this.setLibelle("4. Suppression d'une pizza");
		this.ihmUtil = ihmUtil;
	}

	@Override
	public void executeOption() {
		ListPizza listp = new ListPizza(ihmUtil);
		listp.executeOption();

		System.out.print("Veuillez saisir le code de la pizza à  supprimer: ");
		String codeASupprimer = ihmUtil.getScanner().next(); 
		
		Pizza pizzaASup = ihmUtil.getPizzaDao().getPizzaByCode(codeASupprimer);
		if (codeASupprimer != null) {
			
			if(ihmUtil.getPizzaDao().deletePizza(pizzaASup)){
				System.out.println("Suppression éffectué");
			}else{
				System.out.println("Echec de la suppression");
			}
		}else{
			System.out.println("la pizza à supprimer n'existe pas !");
		}
		
	}

	@Override
	public void libelleOption() {
		// TODO Auto-generated method stub
		System.out.println(getLibelle());
	}

}
