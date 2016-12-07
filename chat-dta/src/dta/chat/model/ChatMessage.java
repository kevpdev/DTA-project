package dta.chat.model;

public class ChatMessage {

	private String login;
	private String text;

	public ChatMessage() {
		super();
	}

	public ChatMessage(String login, String text) {
		super();
		this.login = login;
		this.text = text;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
