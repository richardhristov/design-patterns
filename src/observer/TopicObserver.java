package observer;

public class TopicObserver<T> implements IObserver<T> {
	private IObservable<T> observable = null;

	public void setObservable(IObservable<T> observable) {
		this.observable = observable;
	}
	
	public IObservable<T> getObservable() {
		return observable;
	}

	public void observerNotify(T data) {
		System.out.println(data.toString());
	}
}
