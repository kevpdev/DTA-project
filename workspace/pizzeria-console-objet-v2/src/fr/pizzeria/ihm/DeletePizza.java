package fr.pizzeria.ihm;

public class DeletePizza extends Option {

	public  DeletePizza() {
		// TODO Auto-generated constructor stub
		this.setLibelle("4. Suppression d'une pizza");
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
