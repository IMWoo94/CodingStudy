package problem.date_20231208;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/11365
 */
public class 느낌표밀비급일 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			while (true) {
				String code = br.readLine();
				if (code.equals("END")) {
					break;
				}
				StringBuilder sb = new StringBuilder(code);
				bw.write(sb.reverse().toString());
				bw.newLine();
			}
			bw.flush();
		} catch (IOException e) {

		}

	}
}
