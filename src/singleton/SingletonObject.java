package singleton;

public class SingletonObject {
	//Create an object of SingletonObject
	private static SingletonObject instance;
	
	//Private constuctor
	private SingletonObject() { }
	
	//getInstance method return the object 
	public static SingletonObject getInstance() {
		if (instance == null) {
			instance = new SingletonObject();
		}
		return instance;
	}
	
	public void printMessage() {
		System.out.println("Hello from Singleton object!");
	}
}
