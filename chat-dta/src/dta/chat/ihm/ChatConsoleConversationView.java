package dta.chat.ihm;

public class ChatConsoleConversationView extends ViewComposite {

	@Override
	public void print() {
		System.out.println("== Conversation ==");

	}

	public void update(String msg) {
		System.out.println(msg);
	}

}
