package problem.date_20231130;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/26489
 */
public class GumGumforJayJay {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			int count = 0;
			while (true) {
				String input = br.readLine();
				if (input == null)
					break;
				count++;
			}
			bw.write(count + "");
			bw.flush();
		} catch (IOException e) {

		}

	}
}
