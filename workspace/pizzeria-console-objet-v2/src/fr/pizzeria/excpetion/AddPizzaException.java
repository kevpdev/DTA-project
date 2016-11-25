package fr.pizzeria.excpetion;

public class AddPizzaException extends PizzaException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public AddPizzaException() {
		super();
		// TODO Auto-generated constructor stub
	}



	public AddPizzaException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		// TODO Auto-generated constructor stub
	}




	public AddPizzaException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}



	public AddPizzaException(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}




	public AddPizzaException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}



	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Erreur Ajout : "+super.getMessage();
	}
	

}
