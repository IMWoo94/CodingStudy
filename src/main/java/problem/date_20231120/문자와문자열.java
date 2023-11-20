package problem.date_20231120;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.acmicpc.net/problem/27866
 */
public class 문자와문자열 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String context = br.readLine();
		String findIndex = br.readLine();

		System.out.println(context.charAt(Integer.parseInt(findIndex) - 1));
	}
}
