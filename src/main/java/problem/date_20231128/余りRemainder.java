package problem.date_20231128;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/24078
 */
public class 余りRemainder {
	public static void main(String[] args) {
		try (
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			int remainder = Integer.parseInt(br.readLine()) % 21;
			bw.write(remainder + "");
			bw.flush();
		} catch (IOException e) {

		}
	}
}
