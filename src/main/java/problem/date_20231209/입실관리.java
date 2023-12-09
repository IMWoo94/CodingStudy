package problem.date_20231209;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/5524
 */
public class 입실관리 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			int line = Integer.parseInt(br.readLine());
			for (int i = 0; i < line; i++) {
				String input = br.readLine();
				bw.write(input.toLowerCase() + "\n");
			}
			bw.flush();
		} catch (IOException e) {

		}

	}
}
