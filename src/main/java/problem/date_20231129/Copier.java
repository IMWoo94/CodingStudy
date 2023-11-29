package problem.date_20231129;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/26574
 */
public class Copier {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			int count = Integer.parseInt(br.readLine());
			for (int i = 0; i < count; i++) {
				String copy = br.readLine() + " ";
				bw.write(copy.repeat(2));
				bw.flush();
			}
		} catch (IOException e) {

		}

	}
}
