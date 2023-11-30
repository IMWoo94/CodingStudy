package problem.date_20231130;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * https://www.acmicpc.net/problem/26209
 */
public class interceptingInformation {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 BufferedWriter bw = new BufferedWriter(new PrintWriter(System.out))
		) {
			String letter = br.readLine();
			if (letter.contains("9")) {
				bw.write("F");
			} else {
				bw.write("S");
			}
			bw.flush();
		} catch (IOException e) {

		}

	}
}
