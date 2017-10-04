
public class MainController {

	public static void main(String[] args) {
		TenOf100Or200Class obj = new TenOf100Or200Class();
		boolean result1 = obj.nearHundred(93);
		if (result1 == true)
			System.out.println("Test Passes");
		else
			System.out.println("Test Fails");

		boolean result2 = obj.nearHundred(110);
		if (result2 == true)
			System.out.println("Test Passes");
		else
			System.out.println("Test Fails");
		boolean result3 = obj.nearHundred(89);
		if (result1 == true)
			System.out.println("Test Passes");
		else
			System.out.println("Test Fails");

	}
}
