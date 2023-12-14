package problem.date_20231214;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/17863
 */
public class FYI {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			String tel = br.readLine();
			if (tel.startsWith("555")) {
				bw.write("YES");
			} else {
				bw.write("NO");
			}
			bw.flush();
		} catch (IOException e) {

		}

	}
}
