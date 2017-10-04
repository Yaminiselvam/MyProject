
import java.util.Arrays;

public class SudokoChecker {
	
	public static boolean check(int[][] arr)
    {
        if (arr.length != 9)
            return false;
 
        for (int i = 0; i < 9; i++)
        {
            if (arr[i].length != 9)
                return false;
            for (int j = 0; j < 9; j++)
                if (arr[i][j] < 1 || arr[i][j] > 9)
                    return false;
        }
 
        int[]   counts = new int[9];
        int good_count = 0;
        Arrays.fill(counts, 0);
 
        // rows
        for (int i = 0; i < 9; i++)
        {
            good_count++;
            for (int j = 0; j < 9; j++)
            {
                counts[arr[i][j] - 1]++;
                if (counts[arr[i][j] - 1] != good_count)
                    return false;
            }
        }
 
        // columns
        for (int j = 0; j < 9; j++)
        {
            good_count++;
            for (int i = 0; i < 9; i++)
            {
                counts[arr[i][j] - 1]++;
                if (counts[arr[i][j] - 1] != good_count)
                    return false;
            }
        }
 
        // blocks
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                good_count++;
                for (int r = i * 3; r < i * 3 + 3; r++)
                {
                    for (int c = j * 3; c < j * 3 + 3; c++)
                    {
                        counts[arr[r][c] - 1]++;
                        if (counts[arr[r][c] - 1] != good_count)
                            return false;
                    }
                }
            }
        }
        return true;
    }

	public static void main(String[] args) {
		int[][] arr = { { 5, 3, 4, 6, 7, 8, 9, 1, 2 }, { 6, 7, 2, 1, 9, 5, 3, 4, 8 }, { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
				{ 8, 5, 9, 7, 6, 1, 4, 2, 3 }, { 4, 2, 6, 8, 5, 3, 7, 9, 1 }, { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
				{ 9, 6, 1, 5, 3, 7, 2, 8, 4 }, { 2, 8, 7, 4, 1, 9, 6, 3, 5 }, { 3, 4, 5, 2, 8, 6, 1, 7, 9 } };
		System.out.println(check(arr));
	}
}