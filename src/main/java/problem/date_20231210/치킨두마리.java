package problem.date_20231210;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/14489
 */
public class 치킨두마리 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int accountA = Integer.parseInt(st.nextToken());
			int accountB = Integer.parseInt(st.nextToken());
			int price = Integer.parseInt(br.readLine());

			if (accountA + accountB >= price * 2) {
				bw.write((accountA + accountB) - (price * 2) + "");
			} else {
				bw.write(accountA + accountB + "");
			}
			bw.flush();
		} catch (IOException e) {

		}

	}
}
