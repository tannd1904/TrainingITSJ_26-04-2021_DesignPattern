package singleton;

public class SingletonDemo {
	public static void main (String[] args) {
		//Call getInstance to retrive the object available from the class
		SingletonObject object = SingletonObject.getInstance();
		object.printMessage();
	}
}
