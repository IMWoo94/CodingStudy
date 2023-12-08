package problem.date_20231208;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/14652
 */
public class 나는행복합니다 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());

			int fenN = k / m;
			int fenM = k % m;
			bw.write(fenN + " " + fenM);
			bw.flush();
		} catch (IOException e) {

		}

	}
}
