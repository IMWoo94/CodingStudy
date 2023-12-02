package problem.date_20231202;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/10156
 */
public class 과자 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int price = Integer.parseInt(st.nextToken());
			int count = Integer.parseInt(st.nextToken());
			int money = Integer.parseInt(st.nextToken());
			int result = 0;
			int total = price * count;
			if (money < total) {
				result = total - money;
			}
			bw.write(result + "");
			bw.flush();
		} catch (IOException e) {

		}

	}
}
