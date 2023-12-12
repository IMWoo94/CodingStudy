package problem.date_20231212;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/23795
 */
public class 사장님도박은재미로하셔야합니다 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			int total = 0;
			while (true) {
				String input = br.readLine();
				if (input.equals("-1")) {
					break;
				}
				total += Integer.parseInt(input);
			}
			bw.write(total + "");
			bw.flush();
		} catch (IOException e) {

		}

	}
}
