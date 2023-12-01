package problem.date_20231201;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/26575
 */
public class Pups {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			int count = Integer.parseInt(br.readLine());
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < count; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				double dogs = Double.parseDouble(st.nextToken());
				double food = Double.parseDouble(st.nextToken());
				double price = Double.parseDouble(st.nextToken());
				double sum = Math.round((dogs * food * price) * 100) / 100.0;

				sb.append(String.format("$%.2f\n", sum));
			}
			bw.write(sb.toString());
			bw.flush();
		} catch (IOException e) {

		}

	}
}
