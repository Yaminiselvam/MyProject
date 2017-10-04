
public class TenOf100Or200Class {
	public boolean nearHundred(int n) {
		int value1 = 100 - n;
		int value2 = 200 - n;
		return (Math.abs(value1) <= 10 || Math.abs(value2) <= 10);
	}
}
