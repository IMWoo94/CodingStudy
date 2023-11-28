package problem.date_20231128;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;

/**
 * https://www.acmicpc.net/problem/24082
 */
public class 立方体Cube {
	public static void main(String[] args) {
		try (
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			int num = Integer.parseInt(br.readLine());
			BigInteger result = new BigInteger((long)Math.pow(num, 3) + "");

			bw.write(result.toString());
			bw.flush();

		} catch (IOException e) {

		}
	}
}
