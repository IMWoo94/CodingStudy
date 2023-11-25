package problem.date_20231125;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;

/**
 * https://www.acmicpc.net/problem/5341
 */
public class Pyramids {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			String input;
			StringBuilder sb = new StringBuilder();
			while ((input = br.readLine()) != null && !input.equals("0")) {
				int num = Integer.parseInt(input);
				BigInteger big = new BigInteger(String.valueOf(num * (num + 1) / 2));
				sb.append(big.toString()).append('\n');

			}
			bw.write(sb.toString());
			bw.flush();
		} catch (IOException e) {

		}
	}
}
