package problem.date_20231119;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * https://www.acmicpc.net/problem/2738
 */
public class 행렬덧셈 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String nmSize = br.readLine();
		String[] split = nmSize.split(" ");
		int nSize = Integer.parseInt(split[0]);
		int mSize = Integer.parseInt(split[1]);
		int[][] result = new int[nSize][mSize];

		// 첫 행렬 정보
		for (int i = 0; i < nSize; i++) {
			String arr = br.readLine();
			String[] temp = arr.split(" ");
			for (int k = 0; k < mSize; k++) {
				result[i][k] = Integer.parseInt(temp[k]);
			}
		}

		// 더할 행렬
		for (int i = 0; i < nSize; i++) {
			String arr = br.readLine();
			String[] temp = arr.split(" ");
			for (int k = 0; k < mSize; k++) {
				result[i][k] += Integer.parseInt(temp[k]);
			}
		}

		for (int[] ints : result) {
			Arrays.stream(ints).forEach(num -> System.out.printf("%d ", num));
			System.out.println();
		}

	}
}
