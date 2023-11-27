package problem.date_20231127;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/18301
 */
public class Rats {
	public static void main(String[] args) {
		try (
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int n1 = Integer.parseInt(st.nextToken()) + 1;
			int n2 = Integer.parseInt(st.nextToken()) + 1;
			int n12 = Integer.parseInt(st.nextToken()) + 1;

			int result = (n1 * n2) / n12 - 1;
			bw.write(result + "");
			bw.flush();

		} catch (IOException e) {

		}
	}
}
