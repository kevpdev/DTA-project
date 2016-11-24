package fr.pizzeria.ihm;

import fr.pizzeria.tool.IhmUtil;

public class Menu  {


	public String titre;
	public IhmUtil ihmUtil;
	public Option [] options = new Option[5];


	public Menu() {
		super();
	}


	public Menu(String titre, IhmUtil ihmUtil) {
		super();
		this.titre = titre;
		this.options[0] = new ListPizza(ihmUtil);
		this.options[1] = new AddPizza(ihmUtil);
		this.options[2] = new UpdatePizza(ihmUtil);
		this.options[3] = new DeletePizza();
		this.options[4] = new ExistMenu();
		this.ihmUtil = ihmUtil;
	}


	public String getTitre() {
		return titre;
	}


	public void setTitre(String titre) {
		this.titre = titre;
	}


	public Option[] getOptions() {
		return options;
	}


	public void setOptions(Option[] options) {
		this.options = options;
	}


	public void display(){

		System.out.println(this.titre);
		for (Option option : options) {
			System.out.println(option.libelle);
		}

	}

	public void action(){

		System.out.print("Votre choix : ");
		Integer action = ihmUtil.getScanner().nextInt();

		if (action < 4) {
			this.options[action -1].executeOption();

		}else if(action  == 99){
			this.options[4].executeOption();
		}


	}


	public void start(){
		display();
		action();
	}

}
