package problem.date_20240108;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * https://www.acmicpc.net/problem/10817
 */
public class 세수 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			String input = br.readLine();
			String[] split = input.split(" ");
			int[] arr = Arrays.stream(split).mapToInt(Integer::parseInt).sorted().toArray();
			bw.write(arr[1] + "");
			bw.flush();
		} catch (IOException e) {

		}

	}
}
