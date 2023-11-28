package problem.date_20231128;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/8545
 */
public class Zadaniepróbne {
	public static void main(String[] args) {
		try (
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			StringBuilder sb = new StringBuilder(br.readLine());
			StringBuilder reverse = sb.reverse();
			bw.write(reverse.toString());
			bw.flush();
		} catch (IOException e) {

		}
	}
}
