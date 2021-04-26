package prototype;

public class PrototypeDemo {

	public static void main(String[] args) {
	
		Intern intern = (Intern) (new Intern("0094", "Tan", 22, "Male"))
				.getClone();
		intern.show();
	}

}
