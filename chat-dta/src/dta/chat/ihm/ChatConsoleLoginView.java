package dta.chat.ihm;

import java.util.Scanner;

import dta.chat.controller.ChatAuthController;

public class ChatConsoleLoginView extends ViewComposite {

	private Scanner sc;
	private ChatAuthController ctrl;

	public ChatConsoleLoginView(Scanner sc) {
		super();
		this.sc = sc;
	}

	@Override
	public void print() {
		System.out.println("== Auntentification ==");
		System.out.println("Veuillez saisir votre login : ");
		String login = sc.next();
		getController().authenticate(login);

	}

	public ChatAuthController getController() {
		return ctrl;
	}

	public void setController(ChatAuthController ctrl) {
		this.ctrl = ctrl;
	}

}
