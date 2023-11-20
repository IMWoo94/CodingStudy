package problem.date_20231120;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/9086
 */
public class 문자열 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out));
		) {
			String strCount = br.readLine();
			int count = Integer.parseInt(strCount);
			for (int i = 0; i < count; i++) {
				String text = br.readLine();
				bw.write(String.valueOf(text.charAt(0)) + String.valueOf(text.charAt(text.length() - 1)));
				bw.newLine();
			}
			bw.flush();
		} catch (IOException e) {

		}
	}
}
