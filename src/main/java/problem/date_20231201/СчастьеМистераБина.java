package problem.date_20231201;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/29163
 */
public class СчастьеМистераБина {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			int even = 0;
			int odd = 0;
			int count = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			while (st.hasMoreTokens()) {
				int num = Integer.parseInt(st.nextToken());
				if (num % 2 == 0) {
					even++;
				} else {
					odd++;
				}
			}
			if (even > odd) {
				bw.write("Happy");
			} else {
				bw.write("Sad");
			}
		} catch (IOException e) {

		}

	}
}
