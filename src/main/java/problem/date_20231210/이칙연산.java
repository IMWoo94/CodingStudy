package problem.date_20231210;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/15726
 */
public class 이칙연산 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			double a = Double.parseDouble(st.nextToken());
			double b = Double.parseDouble(st.nextToken());
			double c = Double.parseDouble(st.nextToken());
			int max = 0;
			if (a * b / c > a / b * c) {
				max = (int)(a * b / c);
			} else {
				max = (int)(a / b * c);
			}
			bw.write(max + "");
			bw.flush();
		} catch (IOException e) {

		}

	}
}
