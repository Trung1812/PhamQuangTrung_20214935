package hust.soict.dsai.aims.cart;
import java.util.ArrayList;
import java.util.Collections;

import hust.soict.dsai.aims.media.Media;
public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private ArrayList<Media> itemOrdered = new ArrayList<>();
	
	public void addMedia(Media media) {
		if (itemOrdered.size() == MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is almost full!");
		} else {
			itemOrdered.add(media);
		}
	}
	
	public void removeMedia(Media media) {
		boolean flag = true;
		for (int i = 0; i < itemOrdered.size(); i++) {
			if (itemOrdered.get(i) == media) {
				itemOrdered.remove(i);
				flag = false;
				System.out.println("Media removed");
				break;
			}
		}
		if (flag) {
			System.out.println(media +" is not in the cart");
		}
	}
		
	public float totalCost() {
		float cost = 0;
		for (int i = 0; i < itemOrdered.size(); i++) {
			cost += itemOrdered.get(i).getCost();
			}
	
		return cost;
	}
	public ArrayList<Media> getItemOrdered(){
		return itemOrdered;
	}
	
	public void PrintDisc()
	{
		System.out.println("Names of discs in cart: ");
		for(int i = 0; i < itemOrdered.size(); ++i)
		{
			Media Media_i = itemOrdered.get(i);
			System.out.println(Media_i.getTitle());
		}
	}
	public void SortByPrice()
	{
		Collections.sort(itemOrdered, Media.COMPARE_BY_COST_TITLE);
		
		for(Media m: itemOrdered)
		{
			System.out.println(m.toString());
		}
	}
	
	public void SortByTitle()
	{
		Collections.sort(itemOrdered, Media.COMPARE_BY_TITLE_COST);
		
		for(Media m: itemOrdered)
		{
			System.out.println(m.toString());
		}
	}
	
	public void searchId(int id)
	{
		for (int i = 0; i < itemOrdered.size(); ++i)
		{
			Media media_i = itemOrdered.get(i);
			if(media_i.getId() == id) media_i.toString();
		}
		
	}
	public void searchTitle(String title)
	{
		for (int i = 0; i < itemOrdered.size(); ++i)
		{
			Media media_i = itemOrdered.get(i);
			if(media_i.getTitle().equals(title)) media_i.toString();
		}
		
	}
	
	public Media findMedia(String title)
	{
		for(int i = 0; i < itemOrdered.size(); ++i)
		{
			Media media_i = itemOrdered.get(i);
			if(media_i.getTitle().equals(title)) return media_i;
		}
		
		return null;
	}
	
	public void removeAll()
	{
		itemOrdered.clear();
	}
	
}
