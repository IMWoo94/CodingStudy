package problem.date_20231212;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/11549
 */
public class Identifying_tea {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			int count = 0;
			String answer = br.readLine();
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			while (st.hasMoreTokens()) {
				if (st.nextToken().equals(answer)) {
					count++;
				}
			}
			bw.write(count + "");
			bw.flush();
		} catch (IOException e) {

		}

	}
}
