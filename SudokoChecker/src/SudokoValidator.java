import java.util.Arrays;

public class SudokoValidator {

		public boolean validate(int[][] input) {

			if ((input.length) > 9)
				return false;

			for (int i = 0; i < input.length; i++) {
				if (input[i].length != input.length)
					return false;

				for (int j = 0; j < input.length; j++)
					if (input[i][j] < 1 || input[i][j] > 9)
						return false;
			}

			int[] counts = new int[input.length];
			int good_count = 0;
			Arrays.fill(counts, 0);

			// rows
			for (int i = 0; i < input.length; i++) {
				good_count++;
				for (int j = 0; j < input.length; j++) {
					counts[input[i][j] - 1]++;
					if (counts[input[i][j] - 1] != good_count)
						return false;
				}
			}

			// columns
			for (int j = 0; j < input.length; j++) {
				good_count++;
				for (int i = 0; i < input.length; i++) {
					counts[input[i][j] - 1]++;
					if (counts[input[i][j] - 1] != good_count)
						return false;
				}
			}
			return true;
		}

		// blocks
		/*
		 * for (int i = 0; i < 3; i++) { for (int j = 0; j < 3; j++) {
		 * good_count++; for (int r = i * 3; r < i * 3 + 3; r++) { for (int c =
		 * j * 3; c < j * 3 + 3; c++) { counts[input[r][c] - 1]++; if
		 * (counts[input[r][c] - 1] != good_count) return false; } } } } return
		 * true; }
		 */

	}
