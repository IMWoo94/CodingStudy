package problem.date_20231125;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/4999
 */
public class 아 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			String my = br.readLine();
			String require = br.readLine();

			if (my.length() >= require.length()) {
				bw.write("go");
			} else {
				bw.write("no");
			}

			bw.flush();
		} catch (IOException e) {

		}
	}
}
