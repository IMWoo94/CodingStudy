package problem.date_20231127;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/14928
 */
public class 큰수BIG {
	public static void main(String[] args) {
		try (
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			String num = br.readLine();
			long remainder = 0;
			for (int i = 0; i < num.length(); i++) {
				remainder = (remainder * 10 + (num.charAt(i) - '0')) % 20000303;
			}

			bw.write("" + remainder);
			bw.flush();

		} catch (IOException e) {

		}
	}
}
