package hust.soict.dsai.lab1.DisplayCalendar;

public class StringArray {
	public String[] array;
	
	public boolean contain(String element) {
		boolean flag = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals(element)) {
				flag = true;
				break;
			}
		}
		return flag;
	}
	public StringArray(String[] months) {
		array = months;
	}
}
