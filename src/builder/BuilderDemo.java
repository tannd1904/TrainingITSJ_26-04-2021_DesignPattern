package builder;

public class BuilderDemo {

	public static void main(String[] args) {
		CDBuilder cdBuilder = new CDBuilder();
		CDType cdType = cdBuilder.buildCD();
		cdType.showItems();
		
	}

}