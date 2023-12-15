package problem.date_20231215;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/25628
 */
public class 햄버거만들기 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken()) / 2;
			int b = Integer.parseInt(st.nextToken());
			int result = Math.min(a, b);
			bw.write(result + "");
			bw.flush();
		} catch (IOException e) {

		}

	}
}
