package fr.pizzeria.excpetion;

public class UpdatePizzaException extends PizzaException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Erreur Mise à jour : "+super.getMessage();
	}

}
