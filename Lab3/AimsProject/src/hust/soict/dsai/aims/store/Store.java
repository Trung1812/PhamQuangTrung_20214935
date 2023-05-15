package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
	private DigitalVideoDisc[] itemsInStore;
	
	public void addDVD(DigitalVideoDisc disc) {
		int len = 0;
		if (itemsInStore != null) {
			len = itemsInStore.length;
		}
		
		DigitalVideoDisc newarr[] = new DigitalVideoDisc[len + 1];
		
		for (int i = 0; i < len; i++) {
			newarr[i] = itemsInStore[i];
		}
		newarr[len] = disc;
		itemsInStore = newarr;	
		System.out.println("The disc has been added");
	}
	
	public void removeDVD(DigitalVideoDisc disc) {
		int len = 0;
		if (itemsInStore != null) {
			len = itemsInStore.length;
		}
		//Check if the disc is in the store
		boolean flag = false;
		for (int i = 0; i < len; i++) {
			if (itemsInStore[i] == disc) {
				DigitalVideoDisc swap = itemsInStore[i];
				itemsInStore[i] = itemsInStore[len - 1];
				itemsInStore[len - 1] = swap;
				swap = null;
				flag = true;
				break;
			}
		}
		if (flag) {
			DigitalVideoDisc newarr[] = new DigitalVideoDisc[len-1];
			for (int i = 0; i < len - 1; i++) {
				newarr[i] = itemsInStore[i];
			}
			System.out.println("The disc has been removed");
		} else {
			System.out.println("The disc is not in the store");
		}
	}
	

}
