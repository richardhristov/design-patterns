package observer;

import java.util.ArrayList;

public class Topic<T> implements IObservable<T> {
	private ArrayList<IObserver<T>> observers = new ArrayList<>();
	
	public Topic() {
		
	}

	public void addObserver(IObserver<T> observer) {
		this.observers.add(observer);
	}

	public void removeObserver(IObserver<T> observer) {
		this.observers.remove(observer);
		
	}

	public void notifyObservers(T data) {
		observers.forEach(o -> o.observerNotify(data));
	}
}
