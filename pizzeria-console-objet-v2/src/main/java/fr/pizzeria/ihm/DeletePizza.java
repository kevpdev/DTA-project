package fr.pizzeria.ihm;

import java.io.IOException;

import fr.pizzeria.model.Pizza;
import fr.pizzeria.tool.IhmUtil;

public class DeletePizza extends Option {

	public IhmUtil ihmUtil;

	public DeletePizza(IhmUtil ihmUtil) {

		this.setLibelle("4. Suppression d'une pizza");
		this.ihmUtil = ihmUtil;
	}

	@Override
	public void executeOption() throws IOException, InstantiationException, IllegalAccessException {
		ListPizza listp = new ListPizza(ihmUtil);
		listp.executeOption();

		try {

			System.out.print("Veuillez saisir le code de la pizza à  supprimer: ");
			String codeASupprimer = ihmUtil.getScanner().next();

			Pizza pizzaASup = ihmUtil.getPizzaDao().getPizzaByCode(codeASupprimer);
			if (codeASupprimer != null) {

				System.out.println(ihmUtil.getPizzaDao().deletePizza(pizzaASup) ? "Suppression éffectué"
						: "Echec de la suppression");

			} else {
				System.out.println("la pizza à supprimer n'existe pas !");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Override
	public void libelleOption() {
		// TODO Auto-generated method stub
		System.out.println(getLibelle());
	}

}
