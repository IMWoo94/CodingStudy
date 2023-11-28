package problem.date_20231128;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/27959
 */
public class 초코바 {
	public static void main(String[] args) {
		try (
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int money = Integer.parseInt(st.nextToken()) * 100;
			int price = Integer.parseInt(st.nextToken());

			String buy = money >= price ? "Yes" : "No";
			bw.write(buy);
			bw.flush();
		} catch (IOException e) {

		}
	}
}
