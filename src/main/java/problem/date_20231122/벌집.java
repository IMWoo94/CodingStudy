package problem.date_20231122;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/2292
 */
public class 벌집 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out));
		) {
			long room = Long.parseLong(br.readLine());
			long end = 1;
			long count = 1;
			while (true) {
				if (end >= room) {
					break;
				}
				end += 6 * count;
				count++;
			}

			bw.write(count + "");
			bw.flush();
			/**
			 * 1 - 1
			 * 2 - 2 ~ 7 ( 6개 )
			 * 3 - 8 ~ 19 ( 12개 )
			 * 4 - 20 ~ 37 ( 18 개)
			 * 6 의 배수로 늘어나네요.
			 */
		} catch (IOException e) {

		}

	}
}
