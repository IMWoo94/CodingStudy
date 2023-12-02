package problem.date_20231202;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * https://www.acmicpc.net/problem/10808
 */
public class 알파벳개수 {
	public static void main(String[] args) {
		int[] arr = new int[26];
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			String word = br.readLine();
			int a = 97;
			for (char c : word.toCharArray()) {
				int index = c - a;
				arr[index]++;
			}

			StringBuilder sb = new StringBuilder();
			Arrays.stream(arr).forEach(num -> sb.append(num + " "));
			bw.write(sb.toString());
			bw.flush();
		} catch (IOException e) {

		}

	}
}
