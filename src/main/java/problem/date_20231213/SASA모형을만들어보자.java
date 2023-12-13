package problem.date_20231213;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/23825
 */
public class SASA모형을만들어보자 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken()) / 2;
			int M = Integer.parseInt(st.nextToken()) / 2;
			bw.write(Math.min(N, M) + "");
			bw.flush();
		} catch (IOException e) {

		}

	}
}
