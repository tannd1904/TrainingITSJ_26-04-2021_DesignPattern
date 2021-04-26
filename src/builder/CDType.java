package builder;

import java.util.ArrayList;
import java.util.List;

public class CDType {
	private List<Packing> items = new ArrayList<Packing>();
	
	public void addItems (Packing packs) {
		items.add(packs);
	}
	
	public void showItems() {
		for (Packing packing : items) {
			System.out.println("CD name: " + packing.pack());
			System.out.println("Price: " + packing.price());
		}
	}
}
