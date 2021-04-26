package builder;

public class CDBuilder {
	
	public CDType buildCD() {
		CDType cds = new CDType();
		cds.addItems(new Sony());
		cds.addItems(new Samsung());
		return cds;
	}
	
}
