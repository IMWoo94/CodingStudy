package problem.date_20231210;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/19944
 */
public class 뉴비의기준은뭘까 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());

			if (M <= 2) {
				bw.write("NEWBIE!");
			} else if (M <= N) {
				bw.write("OLDBIE!");
			} else {
				bw.write("TLE!");
			}
			bw.flush();

		} catch (IOException e) {

		}

	}
}
