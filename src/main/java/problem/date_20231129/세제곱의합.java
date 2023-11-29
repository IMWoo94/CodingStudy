package problem.date_20231129;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.stream.IntStream;

/**
 * https://www.acmicpc.net/problem/28701
 */
public class 세제곱의합 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			int count = Integer.parseInt(br.readLine());

			int sum1 = IntStream.range(1, count + 1).sum();
			int sum2 = (int)Math.pow(sum1, 2);
			int sum3 = IntStream.range(1, count + 1).map(num -> (int)Math.pow(num, 3)).sum();
			bw.write(sum1 + "\n");
			bw.write(sum2 + "\n");
			bw.write(sum3 + "\n");
			bw.flush();
		} catch (IOException e) {

		}

	}
}
