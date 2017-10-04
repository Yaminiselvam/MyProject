
public class Demo1 {
	public Demo1() {

		int mat[][] = {

				{ 5, 3, 0, 0, 7, 0, 0, 0, 0 }, { 6, 0, 0, 1, 9, 5, 0, 0, 0 }, { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
				{ 8, 0, 0, 0, 6, 0, 0, 0, 3 }, { 4, 0, 0, 8, 0, 3, 0, 0, 1 }, { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
				{ 0, 6, 0, 0, 0, 0, 2, 8, 0 }, { 0, 0, 0, 4, 1, 9, 0, 0, 5 }, { 0, 0, 0, 0, 8, 0, 0, 7, 9 }

		};

		fill(mat, 0, 0);

	}

	public static void main(String args[]) {
		@SuppressWarnings("unused")
		Demo1 obj = new Demo1();
	}

	private boolean validate(int mat[][], int n, int y, int x) {

		// row and column
		for (int i = 0; i < 9; i++) {
			if (mat[i][x] == n) {
				// System.out.println(mat[i][x] + "nnnn" + n);
				return false;
			}
			if (mat[y][i] == n)
				return false;
		}

		// only that sqare
		for (int i = y / 3 * 3; i < y / 3 * 3 + 3; i++)
			for (int j = x / 3 * 3; j < x / 3 * 3 + 3; j++) {
				// System.out.println("square " + n +" " + i + " " + j + " " +
				// mat[i][j]);
				if (mat[i][j] == n)
					return false;
			}
		return true;
	}

	public void fill(int[][] mat, int i, int j) {
		// System.out.println(i + " " + j);
		if (j == 9) {
			i++;
			j = 0;
		}

		if (i == 9) {
			System.out.println("Stigli");
			Print(mat);
			return;
		}

		if (mat[i][j] != 0) {
			fill(mat, i, j + 1);
			return;
		}

		for (int k = 1; k <= 9; k++) {
			// System.out.println("k" + k);
			if (validate(mat, k, i, j)) {
				mat[i][j] = k;
				fill(mat, i, j + 1);
				mat[i][j] = 0;
			}
		}
	}

	private void Print(int[][] mat) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}

}
