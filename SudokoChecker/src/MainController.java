
public class MainController {

	public static void main(String[] args) {

		SudokoValidator sudokovalidator=new SudokoValidator();
		int[][] a = { { 5, 3, 4, 6, 7, 8, 9, 1, 2 },
					  { 6, 7, 2, 1, 9, 5, 3, 4, 8 }, 
					  { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
					  { 8, 5, 9, 7, 6, 1, 4, 2, 3 }, 
					  { 4, 2, 6, 8, 5, 3, 7, 9, 1 }, 
					  { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
					  { 9, 6, 1, 5, 3, 7, 2, 8, 4 }, 
					  { 2, 8, 7, 4, 1, 9, 6, 3, 5 }, 
					  { 3, 4, 5, 2, 8, 6, 1, 7, 9 } };
		boolean result = sudokovalidator.validate(a);
		boolean expectedResult = true;
		if (result == expectedResult) {
			System.out.println("Test Passes");
		} else
			System.out.println("Test Fails");

		int[][] b = { { 1, 2, 3 }, { 2, 3, 1 }, { 3, 1, 2 } };
		boolean result1 = sudokovalidator.validate(b);
		boolean expectedResult1 = true;
		if (result1 == expectedResult1) {
			System.out.println("Test Passes");
		} else
			System.out.println("Test Fails");

		int[][] c = { { 1, 2, 3 }, { 2, 2, 1 }, { 3, 1, 2 } };
		boolean result2 = sudokovalidator.validate(c);
		boolean expectedResult2 = false;
		if (result2 == expectedResult2) {
			System.out.println("Test Passes");
		} else
			System.out.println("Test Fails");

		int[][] d ={{ 5, 3, 4, 6, 7, 5, 9, 1, 2 },
				    { 6, 7, 2, 1, 9, 5, 3, 4, 8 }, 
				    { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
				    { 8, 5, 9, 7, 6, 1, 4, 2, 3 }, 
				    { 4, 2, 6, 8, 5, 3, 7, 9, 1 }, 
				    { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
				    { 9, 6, 1, 5, 3, 7, 2, 8, 4 }, 
				    { 2, 8, 7, 4, 1, 9, 6, 3, 5 }, 
				    { 3, 4, 5, 2, 8, 6, 1, 7, 9 } };

		boolean result4 = sudokovalidator.validate(d);
		boolean expectedResult4 = false;
		if (result4 == expectedResult4) {
			System.out.println("Test Passes");
		} else
			System.out.println("Test Fails");

		int[][] e ={{ 1,2,3,4,5,6 },
					{ 4,5,6,1,2,3 }, 
					{ 5,1,2,6,3,4 },
					{ 3,6,4,5,1,2 }, 
					{ 2,4,1,3,6,5 }, 
					{ 6,3,5,2,4,1 }};
			    
	boolean result5 = sudokovalidator.validate(e);
	boolean expectedResult5 = true;
	if (result5 == expectedResult5) {
		System.out.println("Test Passes");
	} else
		System.out.println("Test Fails");

}
}
