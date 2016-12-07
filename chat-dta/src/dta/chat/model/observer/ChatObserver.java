package dta.chat.model.observer;

public interface ChatObserver<T> {

	public void update(ChatObservable<T> observable, T obj);

}
