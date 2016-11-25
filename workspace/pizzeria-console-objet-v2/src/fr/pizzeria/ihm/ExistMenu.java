package fr.pizzeria.ihm;

public class ExistMenu extends Option {

	public ExistMenu() {
		// TODO Auto-generated constructor stub
		this.setLibelle("99. Quittez l'application");
	}
	@Override
	public void executeOption() {
		
		System.out.println("Aurevoir");
		
		System.exit(0);
	}

	@Override
	public void libelleOption() {
		// TODO Auto-generated method stub

	}

}
