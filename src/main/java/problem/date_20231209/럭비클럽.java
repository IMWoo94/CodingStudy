package problem.date_20231209;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/2083
 */
public class 럭비클럽 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			while (true) {
				String input = br.readLine();
				if (input.equals("# 0 0")) {
					break;
				}
				StringTokenizer st = new StringTokenizer(input, " ");
				StringBuilder sb = new StringBuilder();
				sb.append(st.nextToken());
				int age = Integer.parseInt(st.nextToken());
				int weight = Integer.parseInt(st.nextToken());
				if (age > 17 || weight >= 80) {
					sb.append(" Senior");
				} else {
					sb.append(" Junior");
				}
				bw.write(sb.toString() + "\n");
			}
			bw.flush();
		} catch (IOException e) {

		}

	}
}
