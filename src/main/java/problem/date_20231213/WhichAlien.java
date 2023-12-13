package problem.date_20231213;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/6778
 */
public class WhichAlien {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			int antenna = Integer.parseInt(br.readLine());
			int eyes = Integer.parseInt(br.readLine());

			if (antenna >= 3 && eyes <= 4) {
				bw.write("TroyMartian\n");
			}
			if (antenna <= 6 && eyes >= 2) {
				bw.write("VladSaturnian\n");
			}
			if (antenna <= 2 && eyes <= 3) {
				bw.write("GraemeMercurian\n");
			}
			bw.flush();
		} catch (IOException e) {

		}

	}
}
