package problem.date_20231211;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/15700
 */
public class 타일채우기4 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			long N = Integer.parseInt(st.nextToken());
			long M = Integer.parseInt(st.nextToken());
			long count = (N * M) / 2;
			bw.write(count + "");
			bw.flush();
		} catch (IOException e) {

		}

	}
}
