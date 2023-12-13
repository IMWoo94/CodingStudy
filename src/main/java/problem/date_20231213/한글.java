package problem.date_20231213;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/11282
 */
public class 한글 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			int n = Integer.parseInt(br.readLine()) + 44031;
			System.out.println((char)n);
		} catch (IOException e) {

		}

	}
}
