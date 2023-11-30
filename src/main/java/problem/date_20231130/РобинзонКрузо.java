package problem.date_20231130;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/27219
 */
public class РобинзонКрузо {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			int num = Integer.parseInt(br.readLine());
			int count = num / 5;
			int mod = num % 5;
			bw.write("V".repeat(count) + "I".repeat(mod));
			bw.flush();
		} catch (IOException e) {

		}

	}
}
