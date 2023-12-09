package problem.date_20231209;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/17388
 */
public class 와글와글숭고한 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int[] p = new int[3];
			for (int i = 0; i < p.length; i++) {
				p[i] = Integer.parseInt(st.nextToken());
			}

			int total = Arrays.stream(p).sum();
			if (total < 100) {
				int min = Arrays.stream(p).min().orElseGet(() -> 0);
				for (int k = 0; k < p.length; k++) {
					if (p[k] == min) {
						if (k == 0) {
							bw.write("Soongsil");
						} else if (k == 1) {
							bw.write("Korea");
						} else {
							bw.write("Hanyang");
						}
						break;
					}
				}
			} else {
				bw.write("OK");
			}
			bw.flush();
		} catch (IOException e) {

		}

	}
}
