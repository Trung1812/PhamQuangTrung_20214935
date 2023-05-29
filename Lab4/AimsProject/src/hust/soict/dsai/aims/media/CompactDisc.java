package hust.soict.dsai.aims.media;
import java.util.ArrayList;
public class CompactDisc extends Disc implements Playable{
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<Track>();
	private static Integer nbCompactDisc = 0;
	private static Integer header = 1;
	public String getArtist() {
		return artist;
	}
	
	public void addTrack(Track trackName) {
		boolean flag = true;
		for (int i = 0; i < tracks.size(); i++) {
			if (trackName == tracks.get(i)) {
				flag = false;
				System.out.println(trackName + " is already in playlist");
				break;
			}
		}
		if (flag) {
			tracks.add(trackName);
			System.out.println("playlist updated");
		}
	}
	
	public void removeTrack(Track trackName) {
		boolean flag = true;
		for (int i = 0; i < tracks.size(); i++) {
			if (trackName == tracks.get(i)) {
				tracks.remove(i);
				System.out.println("Track removed");
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("Track is not on the playlist");
		}
	}
	
	public int getLength() {
		int length = 0;
		for (int i = 0; i < tracks.size(); i++) {
			length += tracks.get(i).getLength();
		}
		return length;
	}
	
	public void play() {
		System.out.println("Title: " + this.title);
		System.out.println("Artist: " + this.getArtist());
		for (int i = 0; i < tracks.size(); i++){
			tracks.get(i).play();
		}
	}
	
	public String toString() {
		String string = "CD - " + this.getTitle() + " - " + this.getArtist();
		return string;
	}

	public CompactDisc(String title) {
		super();
		this.title = title;
		String str = header.toString() + nbCompactDisc.toString();		
		this.id = Integer.parseInt(str);
		nbCompactDisc++;		
	}
	public CompactDisc(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
		String str = header.toString() + nbCompactDisc.toString();		
		this.id = Integer.parseInt(str);
		nbCompactDisc++;		
	}
	public CompactDisc(String title, String category, String artist, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.artist = artist;
		this.cost = cost;
		String str = header.toString() + nbCompactDisc.toString();		
		this.id = Integer.parseInt(str);
		nbCompactDisc++;
	}


}
