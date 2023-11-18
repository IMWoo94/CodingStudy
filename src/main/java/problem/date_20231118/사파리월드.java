package problem.date_20231118;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/2420
 */
public class 사파리월드 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String[] split = s.split(" ");

		long a = Long.parseLong(split[0]);
		long b = Long.parseLong(split[1]);

		System.out.println(Math.abs(a - b));
	}
}
