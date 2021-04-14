package observer;

public interface IObserver<T> {
	void setObservable(IObservable<T> observable);
	IObservable<T> getObservable();
	void observerNotify(T data);
}
