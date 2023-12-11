package problem.date_20231211;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/11283
 */
public class 한글2 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			String word = br.readLine();
			char start = '가';
			char end = word.charAt(0);
			System.out.println(((int)end - (int)start) + 1);
		} catch (IOException e) {

		}

	}
}
