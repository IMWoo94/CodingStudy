package problem.date_20231208;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/15439
 */
public class 베라의패션 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			int n = Integer.parseInt(br.readLine());
			int result = n * (n - 1);
			bw.write(result + "");
			bw.flush();
		} catch (IOException e) {

		}

	}
}
