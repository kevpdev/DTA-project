package dta.chat.model;

import dta.chat.model.observer.ChatObservable;

public class ChatConversationModel extends ChatObservable<ChatMessage> {

	private String login;
	// private

	public void setLogin(String login) {
		this.login = login;
		this.notifyObserver(new ChatMessage("Welcome", login));
	}

	public void sendMessage(String message) {

		this.notifyObserver(new ChatMessage(this.login, message));
	}

}
