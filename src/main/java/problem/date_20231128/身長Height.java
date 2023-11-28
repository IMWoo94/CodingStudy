package problem.date_20231128;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/24086
 */
public class 身長Height {
	public static void main(String[] args) {
		try (
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			int result = Integer.parseInt(br.readLine()) - Integer.parseInt(br.readLine());
			result = Math.abs(result);

			bw.write(result + "");
			bw.flush();
		} catch (IOException e) {

		}
	}
}
