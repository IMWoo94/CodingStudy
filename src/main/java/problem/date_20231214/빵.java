package problem.date_20231214;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/25377
 */
public class 빵 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			int n = Integer.parseInt(br.readLine());
			int result = -1;
			for (int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				if (a <= b) {
					if (result == -1) {
						result = b;
					} else if (result > b) {
						result = b;
					}
				}
			}
			bw.write(result + "");
			bw.flush();
		} catch (IOException e) {

		}

	}
}
