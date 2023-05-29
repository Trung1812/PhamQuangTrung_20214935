package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements Playable{

	private String director;
	private int length;

	private static Integer nbDigitalVideoDiscs = 0;
	private static Integer header = 2;

	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}

	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
		String str = header.toString() + nbDigitalVideoDiscs.toString();		
		this.id = Integer.parseInt(str);
		nbDigitalVideoDiscs++;		
	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		String str = header.toString() + nbDigitalVideoDiscs.toString();		
		this.id = Integer.parseInt(str);
		nbDigitalVideoDiscs++;		
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
		String str = header.toString() + nbDigitalVideoDiscs.toString();		
		this.id = Integer.parseInt(str);
		nbDigitalVideoDiscs++;		
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
		String str = header.toString() + nbDigitalVideoDiscs.toString();		
		this.id = Integer.parseInt(str);
		nbDigitalVideoDiscs++;		
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String toString() {
		String string = "DVD - "+this.getTitle() + " - "+ this.getDirector()+ " - "+ this.getLength()+ ": "+ this.getCost() + "$";
		return string;
	}
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: "+ this.getLength());
	}
	
}
