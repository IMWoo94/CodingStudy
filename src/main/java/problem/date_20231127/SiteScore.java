package problem.date_20231127;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/20254
 */
public class SiteScore {
	public static void main(String[] args) {
		try (
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int UR = 56 * Integer.parseInt(st.nextToken());
			int TR = 24 * Integer.parseInt(st.nextToken());
			int UO = 14 * Integer.parseInt(st.nextToken());
			int TO = 6 * Integer.parseInt(st.nextToken());

			int result = UR + TR + UO + TO;
			bw.write(result + "");
			bw.flush();

		} catch (IOException e) {

		}
	}
}
