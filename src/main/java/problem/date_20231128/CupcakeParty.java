package problem.date_20231128;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/24568
 */
public class CupcakeParty {
	public static void main(String[] args) {
		try (
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			int regular = Integer.parseInt(br.readLine()) * 8;
			int small = Integer.parseInt(br.readLine()) * 3;
			int leftOver = regular + small - 28;

			bw.write(leftOver + "");
			bw.flush();
		} catch (IOException e) {

		}
	}
}
