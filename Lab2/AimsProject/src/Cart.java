
public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemOrdered[] = 
			new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	public int getQtyOrdered() {
		 int a = 0;
		 for (int i = 0; i < MAX_NUMBERS_ORDERED; i++) {
			 if (itemOrdered[i] != null) {
				 a ++;
			 }
		 }
		 return a;
	 }
	int qtyOrdered = getQtyOrdered();

	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (getQtyOrdered() == MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is almost full");
		} else {
			for (int i = 0; i < MAX_NUMBERS_ORDERED; i++) {
				if (itemOrdered[i] == null) {
					itemOrdered[i] = disc;
					break;
				}
			}
			System.out.println("The disc has been added");
		}
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for (int i = 0; i< MAX_NUMBERS_ORDERED; i++) {
			if (disc == itemOrdered[i]) {
				itemOrdered[i] = null;
				break;
			}
		}
	}
	
	public float totalCost() {
		float cost = 0;
		for (int i = 0; i < MAX_NUMBERS_ORDERED; i++) {
			if (itemOrdered[i] != null) {
				cost += itemOrdered[i].getCost();
			}
		}
		return cost;
	}
}
