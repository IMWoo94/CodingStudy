package problem.date_20231129;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/2372
 */
public class LivestockCount {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			StringBuilder sb = new StringBuilder();

			sb.append("Animal      Count\n"
				+ "-----------------\n"
				+ "Chickens      100\n"
				+ "Clydesdales     5\n"
				+ "Cows           40\n"
				+ "Goats          22\n"
				+ "Steers          2");
			bw.write(sb.toString());
			bw.flush();
		} catch (IOException e) {

		}

	}
}
/**
 * with Ada.Text_IO; use Ada.Text_IO;
 *
 * procedure program_alioolio is
 * begin
 *   Put_Line("Animal      Count");
 *   Put_Line("-----------------");
 *   Put_Line("Chickens      100");
 *   Put_Line("Clydesdales     5");
 *   Put_Line("Cows           40");
 *   Put_Line("Goats          22");
 *   Put_Line("Steers          2");
 * end program_alioolio;
 */
