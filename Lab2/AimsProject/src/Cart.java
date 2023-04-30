
public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemOrdered[] = 
			new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;
	
	public int getQtyOrdered() {
		 return qtyOrdered;
	 }


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
			qtyOrdered += 1;
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
		qtyOrdered -= 1;
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
