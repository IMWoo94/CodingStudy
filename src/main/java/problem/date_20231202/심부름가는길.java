package problem.date_20231202;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/5554
 */
public class 심부름가는길 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			int total = 0;
			while (true) {
				String input = br.readLine();
				if (input == null)
					break;

				total += Integer.parseInt(input);
			}
			int min = total / 60 % 60;
			int second = total % 60;
			bw.write(min + "");
			bw.newLine();
			bw.write(second + "");
			bw.flush();
		} catch (IOException e) {

		}

	}
}
