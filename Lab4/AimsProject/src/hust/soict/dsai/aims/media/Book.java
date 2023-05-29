package hust.soict.dsai.aims.media;
import java.util.ArrayList;

public class Book extends Media{

	private ArrayList<String> authors = new ArrayList<String>();
	private static Integer nbDigitalVideoDiscs = 0;
	private static Integer header = 0;

	public void removeAuthor(String authorName) {
		boolean flag = true;
		for (int i = 0; i < authors.size(); i++) {
			if (authors.get(i).equals(authorName)) {
				authors.remove(i);
				flag = false;
				System.out.println("Authors updated");
				break;
			}
		}
		if (flag) {
			System.out.println(authorName + " is not this book's author");
		}
	}
	
	public void addAuthor(String authorName) {
		boolean flag = true;
		for (int i = 0; i < authors.size(); i++) {
			if (authors.get(i).equals(authorName)) {
				flag = false;
				System.out.println(authorName + " is already in thus book's list of author");
				break;
			}
		}
		if (flag) {
			authors.add(authorName);
			System.out.println("Authors updated");
		}
	}
	
	public String toString() {
		String string = "Book - "+ this.getTitle();
		return string;
	}

	public Book(String title) {
		super();
		this.title = title;
		String str = header.toString() + nbDigitalVideoDiscs.toString();		
		this.id = Integer.parseInt(str);
		nbDigitalVideoDiscs++;
	}
	
	public Book(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		String str = header.toString() + nbDigitalVideoDiscs.toString();		
		this.id = Integer.parseInt(str);
		nbDigitalVideoDiscs++;
	}
	
	public Book(String title, String category, ArrayList<String> authors, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		this.authors = authors;
		String str = header.toString() + nbDigitalVideoDiscs.toString();		
		this.id = Integer.parseInt(str);
		nbDigitalVideoDiscs++;		
	}

}
