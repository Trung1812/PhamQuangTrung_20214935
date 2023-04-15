
public class Year {
	public int year;
	
	public boolean isLeap() {
		if (year % 4 != 0) {
			return false;
		} else {
			if (year % 400 != 0) {
				return true;
			} else {
				return false;
			}
		}
	}
	
	public Year(int num) {
		year = num;
	}
}
