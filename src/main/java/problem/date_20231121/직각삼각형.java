package problem.date_20231121;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * https://www.acmicpc.net/problem/4153
 */
public class 직각삼각형 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out));
		) {
			String input = null;
			while ((input = br.readLine()) != null && !input.equals("0 0 0")) {
				String[] split = input.split(" ");
				int[] array = Arrays.stream(split)
					.mapToInt(Integer::parseInt)
					.sorted()
					.toArray();

				if (isRightTriangle(array)) {
					bw.write("right\n");
				} else {
					bw.write("wrong\n");
				}
			}
			bw.flush();
		} catch (IOException e) {

		}
	}

	public static boolean isRightTriangle(int[] arr) {
		double a = Math.pow(arr[2], 2);
		double b = Math.pow(arr[1], 2);
		double c = Math.pow(arr[0], 2);
		if (a == (b + c)) {
			return true;
		}
		return false;
	}
}
