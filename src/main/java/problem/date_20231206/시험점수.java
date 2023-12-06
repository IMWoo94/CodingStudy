package problem.date_20231206;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * https://www.acmicpc.net/problem/5596
 */
public class 시험점수 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			String[] a = br.readLine().split(" ");
			String[] b = br.readLine().split(" ");

			int aSum = Arrays.stream(a).mapToInt(Integer::parseInt).sum();
			int bSum = Arrays.stream(b).mapToInt(Integer::parseInt).sum();
			if (aSum >= bSum) {
				bw.write(aSum + "");
			} else {
				bw.write(bSum + "");
			}
			bw.flush();

		} catch (IOException e) {

		}

	}
}
