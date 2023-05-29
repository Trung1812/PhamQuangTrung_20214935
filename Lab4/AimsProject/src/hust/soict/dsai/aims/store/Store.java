package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.media.*;
import java.util.ArrayList;
public class Store {
	private ArrayList<Media> itemsInStore = new ArrayList<>();
	
	public void addMedia(Media media) {
		itemsInStore.add(media);
	}
	
	public void removeMedia(Media media) {
		boolean flag = true;
		for (int i = 0; i < itemsInStore.size(); i++) {
			if (itemsInStore.get(i) == media) {
				itemsInStore.remove(i);
				flag = false;
				System.out.println("Media has been removed");
				break;
			}
		}
		if (flag) {
			System.out.println("Media does not exist!");
		}
	}
	
	public void print()
	{
		for(int i = 0; i < itemsInStore.size(); ++i)
		{
			Media Media_i = itemsInStore.get(i);
			System.out.println(Media_i.getTitle());
		}
	}
	
	public Media findMedia(String media)
	{
		for(int i = 0; i < itemsInStore.size(); ++i)
		{
			Media Media_i = itemsInStore.get(i);
			if(Media_i.getTitle().equals(media)) return Media_i;
		}
		
		return null;
	}
}
