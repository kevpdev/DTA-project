package dta.chat.model.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class ChatObservable<T> {

	public List<ChatObserver<T>> observers = new ArrayList<>();

	public void addObserver(ChatObserver<T> observer) {

		observers.add(observer);

	}

	public void removeObserver(ChatObserver<T> observer) {

		observers.remove(observer);
	}

	public void notifyObserver(T msg) {

		observers.forEach(obs -> {
			obs.update(this, msg);
		});
	}
}
