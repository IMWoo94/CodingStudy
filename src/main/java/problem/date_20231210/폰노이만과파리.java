package problem.date_20231210;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/14924
 */
public class 폰노이만과파리 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int S = Integer.parseInt(st.nextToken());
			int T = Integer.parseInt(st.nextToken());
			int D = Integer.parseInt(st.nextToken());

			int time = D / (S * 2);
			int pari = T * time;

			bw.write(pari + "");
			bw.flush();

		} catch (IOException e) {

		}

	}
}
