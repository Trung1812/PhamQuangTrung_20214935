package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

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
	public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
		int dvdLength = dvdList.length;
		if (dvdLength + qtyOrdered > MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is almost full");
			return;
		}
		int dvdAdd = 0;
		for (int i = 0; i < MAX_NUMBERS_ORDERED; i++) {
			if (dvdAdd < dvdLength) {
				if (itemOrdered[i] == null) {
					itemOrdered[i] = dvdList[dvdAdd];
					dvdAdd++;
				}
			} else {
				break;
			}
		}
		qtyOrdered += dvdAdd;
		System.out.println("The list of discs have been added");
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
		if (qtyOrdered + 2 > MAX_NUMBERS_ORDERED){
			System.out.println("The cart is almost full");
			return;
		}
		for (int i = 0; i < MAX_NUMBERS_ORDERED; i++) {
			if (itemOrdered[i] == null) {
				itemOrdered[i] = dvd1;
				break;
			}
		}
		for (int i = 0; i < MAX_NUMBERS_ORDERED; i++) {
			if (itemOrdered[i] == null) {
				itemOrdered[i] = dvd2;
				break;
			}
		}
		qtyOrdered += 2;
		System.out.println("The discs have been added");
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
	public void searchById(int id) {
		boolean flag = true;
		for (int i = 0; i < MAX_NUMBERS_ORDERED; i++) {
			if (itemOrdered[i] != null) {
				if (itemOrdered[i].getId() == id) {
					System.out.println(itemOrdered[i].toString());
					flag = false;
					break;
				}
			}

		}
		if (flag) {
			System.out.println("Can not find the item with the the given ID");
		}
	}
	
	public void searchByTitle(String title) {
		boolean flag = true;
		for (int i = 0; i < MAX_NUMBERS_ORDERED; i++) {
			if (itemOrdered[i] != null) {
				if (itemOrdered[i].getTitle().equals(title)) {
					System.out.println(itemOrdered[i].toString());
					flag = false;
					break;
				}
			}
		}
		if (flag) {
			System.out.println("Can not fint the item with the given title");
		}
	}
	
	public void print() {
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items:");
		int count = 0;
		float cost = 0.0f;
		for (int i = 0; i < MAX_NUMBERS_ORDERED; i++) {
			if (itemOrdered[i] != null) {
				count++;
				System.out.println(count +". "+ itemOrdered[i].toString());
				cost += itemOrdered[i].getCost();
			}
		}
		System.out.println("Total cost: " + cost);
		System.out.println("***************************************************");
	}
	
}
