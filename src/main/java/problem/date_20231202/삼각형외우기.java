package problem.date_20231202;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * https://www.acmicpc.net/problem/10101
 */
public class 삼각형외우기 {
	public static void main(String[] args) {
		int[] result = new int[3];
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			int count = 0;
			while (true) {
				String input = br.readLine();
				if (input == null) {
					break;
				}
				result[count++] = Integer.parseInt(input);
			}

			long cnt = Arrays.stream(result).distinct().count();
			int sum = Arrays.stream(result).sum();
			if (sum != 180) {
				bw.write("Error");
			} else {
				if (cnt == 3) {
					bw.write("Scalene");
				} else if (cnt == 2) {
					bw.write("Isosceles");
				} else {
					bw.write("Equilateral");
				}
			}
			bw.flush();
		} catch (IOException e) {

		}

	}
}
