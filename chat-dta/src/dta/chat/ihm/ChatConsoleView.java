package dta.chat.ihm;

import java.util.Scanner;

import dta.chat.controller.ChatAuthController;
import dta.chat.model.ChatMessage;
import dta.chat.model.observer.ChatObservable;
import dta.chat.model.observer.ChatObserver;

public class ChatConsoleView extends ViewComposite implements ChatObserver<ChatMessage> {

	private ChatConsoleTitleView titleView;
	private ChatConsoleLoginView loginView;
	private ChatConsoleConversationView conversView;
	private ChatAuthController authController;
	private String login;

	public ChatConsoleView(Scanner sc) {
		this.titleView = new ChatConsoleTitleView();
		this.loginView = new ChatConsoleLoginView(sc);
		this.conversView = new ChatConsoleConversationView();

		this.children.add(titleView);
		this.children.add(loginView);
		this.children.add(conversView);

	}

	public String getLogin() {
		return login;
	}

	public ChatAuthController getAuthController() {
		return authController;
	}

	public void setAuthController(ChatAuthController ctrl) {
		this.loginView.setController(ctrl);
	}

	@Override
	public void update(ChatObservable<ChatMessage> observable, ChatMessage cm) {
		// cm.
		conversView.update(cm.getLogin() + " : " + cm.getText());
	}

}
