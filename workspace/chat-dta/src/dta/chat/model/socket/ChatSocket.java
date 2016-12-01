package dta.chat.model.socket;

import dta.chat.model.ChatMessage;

public interface ChatSocket extends AutoCloseable {

	void sendMessage(ChatMessage msg);

	ChatMessage readMessage();

}
