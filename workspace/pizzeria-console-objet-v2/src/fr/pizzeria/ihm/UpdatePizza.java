package fr.pizzeria.ihm;


import fr.pizzeria.model.Pizza;
import fr.pizzeria.tool.IhmUtil;

public class UpdatePizza extends Option {

	public IhmUtil ihmUtil;

	public  UpdatePizza(IhmUtil ihmUtil) {

		this.setLibelle("3. Mise à jour d'une pizza");
		this.ihmUtil = ihmUtil;
	}

	@Override
	public void executeOption() {
		try {

			ListPizza listp = new ListPizza(ihmUtil);
			listp.executeOption();

			System.out.print("Veuillez saisir le code de la pizza à modifier: ");
			String codeAmodifier = ihmUtil.getScanner().next(); 

			Pizza pizzaAModifier = ihmUtil.getPizzaDao().getPizzaByCode(codeAmodifier);
			if (!(pizzaAModifier == null)) {

				System.out.print("Veuillez saisir le nouveau code: ");
				String code = ihmUtil.getScanner().next();

				System.out.print("Veuillez saisir le nouveau nom: ");
				String nom = ihmUtil.getScanner().next(); 

				System.out.print("Veuillez saisir le nouveau prix: ");
				double prix = ihmUtil.getScanner().nextDouble(); 

				Pizza pizza = new Pizza(pizzaAModifier.getId(), code, nom, prix);

				if(ihmUtil.getPizzaDao().updatePizza(pizza)){
					System.out.println("Mise à jour éffectué !");
				}else{
					System.out.println("Echec de la mise à jour !");
				}


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
