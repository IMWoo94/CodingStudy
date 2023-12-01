package problem.date_20231201;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/28938
 */
public class Конвейер {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			int count = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int sum = 0;
			while (st.hasMoreTokens()) {
				sum += Integer.parseInt(st.nextToken());
			}
			if (sum > 0) {
				bw.write("Right");
			} else if (sum < 0) {
				bw.write("Left");
			} else {
				bw.write("Stay");
			}
			bw.flush();
		} catch (IOException e) {

		}

	}
}
