package problem.date_20231128;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/problem/27294
 */
public class 몇개고 {
	public static void main(String[] args) {
		try (
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int time = Integer.parseInt(st.nextToken());
			boolean isDrink = st.nextToken().equals("1");
			String rice = "280";
			if (!isDrink && time >= 12 && time <= 16) {
				rice = "320";
			}
			bw.write(rice);
			bw.flush();

		} catch (IOException e) {

		}
	}
}
