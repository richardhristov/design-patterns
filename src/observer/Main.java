package observer;

public class Main {

	public static void main(String[] args) {
		var scene = new Topic<String>();
		
		var grievous = new TopicObserver<String>();
		var droids = new TopicObserver<String>();
		
		scene.addObserver(grievous);
		scene.addObserver(droids);
		
		scene.notifyObservers("Hello there!");
	}

}
