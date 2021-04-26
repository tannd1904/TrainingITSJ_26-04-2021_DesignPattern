package dependencyinjection;

public class DependencyInjectionDemo {
	public static void main(String[] args) {
		String msg = "Hi i am Tan";
		String email = "tannd1904@gmail.com";
		
		MessageServiceInjector injector = null;
		Consumer app = null;
		
		injector = new EmailServiceInjector();
		app = injector.getConsumer();
		app.processMessages(msg, email);
	}
}
