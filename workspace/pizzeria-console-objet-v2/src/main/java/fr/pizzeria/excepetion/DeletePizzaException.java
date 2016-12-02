package fr.pizzeria.excepetion;

public class DeletePizzaException extends PizzaException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Erreur Suppression : "+super.getMessage();
	}

}
