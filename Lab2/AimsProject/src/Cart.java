
public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemOrdered[] = 
			new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	
	int qtyOrdered = 0;
	{
	for (int i = 0; i < MAX_NUMBERS_ORDERED; i++) {
		if (itemOrdered[i] == null) {
			break;
		} else {
			qtyOrdered += 1;
		}
	}
	}
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered == MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is almost full");
		} else {
			itemOrdered[qtyOrdered] = disc;
			System.out.println("The disc has been added");
		}
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		

}
}
