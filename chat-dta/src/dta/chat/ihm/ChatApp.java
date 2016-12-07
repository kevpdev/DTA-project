package dta.chat.ihm;

import java.util.Scanner;

import dta.chat.model.ChatConversationModel;

public class ChatApp {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			ChatConversationModel model = new ChatConversationModel();
			ChatConsoleView view = new ChatConsoleView(sc);
			view.setAuthController((login) -> {
				model.setLogin(login);
			});

			model.addObserver(view);
			view.print();

			model.sendMessage("Bonjour");
			model.sendMessage("C'est moi !");
		}
	}

}
